package com.utility;

import java.util.Map;

import com.base.BaseClass;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestService extends BaseClass {

    private static RequestSpecification req;

    /**
     * @author pankaj.sarjal
     * @Description : Simple get call without any parameter
     * @return
     */
    public static Response getCall() {
        return response = req.given().get();
    }

    /**
     * @author pankaj.sarjal
     * @param headers
     * @param URL
     * @Description : Get call with given header value and URL
     * @return
     */
    public static Response getCallWithHeaders(Map<String, String> headers,
            String URL) {
        return response = req.given().headers(headers).log().all().when()
                .get(URL);

    }

    /**
     * @author pankaj.sarjal
     * @param headers
     * @param pathParam
     * @param URL
     * @Description : Get call with given headers and path parameters and URL
     * @return
     */
    public static Response getCallWithHeaderAndPathParam(
            Map<String, String> headers, Map<String, String> pathParam,
            String URL) {
        return response = req.given().headers(headers).and()
                .pathParams(pathParam).log().all().get(URL);
    }

    /**
     * @author pankaj.sarjal
     * @param headers
     * @param param
     * @param contentType
     * @param url
     * @return
     */
    public static Response getCallWithHeaderAndQueryParam(
            Map<String, String> headers, Map<String, String> param,
            String contentType, String url) {
        return response = req.given().headers(headers).and().queryParams(param)
                .log().all().when().get(url);
    }

    /**
     * @author pankaj.sarjal
     * @param headers
     * @param contentType
     * @param url
     * @return
     */
    public static Response postCallwithHeader(Map<String, String> headers,
            String contentType, String url) {
        return response = req.given().headers(headers).and()
                .contentType(contentType).log().all().when().post(url);

    }

    public static void postCalvxcvxlwithHeader(Map<String, String> headers,
            String contentType, String url, String reqBody,
            String expectedSchema) {
        response = req.given().headers(headers).and().body(reqBody).when()
                .post(url);
        response.then().assertThat().statusCode(201);
        response.then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(expectedSchema));

    }

}
