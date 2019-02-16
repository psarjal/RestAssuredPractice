package com.utility;

import java.io.File;

import com.base.BaseClass;

import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;

public class Utility extends BaseClass {

    public static String readJsonSchemaFile(String fileName) {

        String fileLocation = System.getProperty("user.dir")
                + "\\src\\test\\resources\\jsonFiles\\ResponseJson\\" + fileName
                + ".json";

        // URL file = "";
        return "";
    }

    public static void removeKeyFromJson(String file, JsonPathConfig config,
            String path, String key) {
        JsonPath.with(file).using(config).getMap(path).remove(key);
    }

    public static void removeKeyFromJsonnnnnnnnn(File file,
            JsonPathConfig config, String path, String key, String map) {

        JsonPath.from(file).getMap(map).remove(key);
    }

}
