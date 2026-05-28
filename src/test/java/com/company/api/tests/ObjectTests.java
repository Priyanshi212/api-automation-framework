package com.company.api.tests;

import com.company.api.models.request.CreateObjectRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ObjectTests extends BaseTest {

    @Test
    public void testCreateObject() {
        CreateObjectRequest req = CreateObjectRequest.builder()
                .name("Tanvi's Laptop")
                .data(CreateObjectRequest.ObjectData.builder()
                        .role("SDET3")
                        .company("Google")
                        .year(2024)
                        .price(2999.99)
                        .build())
                .build();

        Response res = objectApi.createObject(req);
        Assert.assertEquals(res.statusCode(), 200); // Note: This API returns 200, not 201
        Assert.assertNotNull(res.jsonPath().getString("id"));
        Assert.assertEquals(res.jsonPath().getString("name"), "Tanvi's Laptop");
    }
}