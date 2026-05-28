package com.company.api.tests;

import com.company.api.client.ObjectApiClient;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ObjectApiClient objectApi;

    @BeforeMethod
    public void setup() {
        objectApi = new ObjectApiClient();
    }
}