package com.base;

import io.restassured.response.Response;

public class BaseClass {

    public static Response response;
    static {
        init();
    }

    public static synchronized void init() {

    }

    public static synchronized void readEnvironmentConfigurationFile() {

    }

}
