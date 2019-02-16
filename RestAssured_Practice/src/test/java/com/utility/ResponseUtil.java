package com.utility;

import com.base.BaseClass;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class ResponseUtil extends BaseClass {

    public static void validateStatusCode(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

    public static void validateResponseSchema(String schema) {
        response.prettyPrint();
        response.then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(schema));
    }

    public static String getDataFromResponseBodyUsingJsonPath(String jsonPath) {
        return response.then().extract().jsonPath().getString(jsonPath);

    }

    public static void demo() {
        response.then().statusCode(200);
        response.then().contentType(ContentType.JSON);
        response.then().assertThat().contentType(ContentType.JSON);
    }

    /**
     * @author pankaj.sarjal
     * @param headerName
     * @param headerValue
     * @Description : Method to verify value of particular header from response
     * @return
     */
    public static boolean verifyHeaderValue(String headerName,
            String headerValue) {

        return response.then().extract().header(headerName).toString()
                .equals(headerValue);
    }
}
