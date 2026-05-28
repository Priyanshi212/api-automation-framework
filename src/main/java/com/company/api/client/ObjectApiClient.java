package com.company.api.client;

import com.company.api.constants.Endpoints;
import com.company.api.models.request.CreateObjectRequest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ObjectApiClient extends BaseApiClient {

    public Response createObject(CreateObjectRequest payload) {
        return given()
                .spec(requestSpec)
                .body(payload)
            .when()
                .post(Endpoints.CREATE_OBJECT)
            .then()
                .extract().response();
    }

    public Response getObject(String id) {
        return given()
                .spec(requestSpec)
                .pathParam("id", id)
            .when()
                .get(Endpoints.GET_OBJECT)
            .then()
                .extract().response();
    }

    public Response getAllObjects() {
        return given()
                .spec(requestSpec)
            .when()
                .get(Endpoints.GET_ALL_OBJECTS)
            .then()
                .extract().response();
    }

    public Response updateObject(String id, CreateObjectRequest payload) {
        return given()
                .spec(requestSpec)
                .pathParam("id", id)
                .body(payload)
            .when()
                .put(Endpoints.UPDATE_OBJECT)
            .then()
                .extract().response();
    }

    public Response deleteObject(String id) {
        return given()
                .spec(requestSpec)
                .pathParam("id", id)
            .when()
                .delete(Endpoints.DELETE_OBJECT)
            .then()
                .extract().response();
    }
}