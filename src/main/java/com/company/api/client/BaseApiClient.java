package com.company.api.client;

import com.company.api.config.ConfigManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;
import io.restassured.filter.log.LogDetail;

public class BaseApiClient {
    protected RequestSpecification requestSpec;

    public BaseApiClient() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(ConfigManager.get("base.url"))
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL) // Logs request + response
                .build();
    }
}