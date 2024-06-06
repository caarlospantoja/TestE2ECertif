package com.example.config;

import java.util.HashMap;
import java.util.Map;

public class Config {
    private static Map<String, String> envUrlMap = new HashMap<>();

    static {
        envUrlMap.put("dev", "http://192.168.129.106");
        envUrlMap.put("test", "https://teste.multicert.com");
    }

    public static String getBaseUrl(String environment) {
        return envUrlMap.getOrDefault(environment, envUrlMap.get("test"));
    }
}
