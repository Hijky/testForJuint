package com.Test;

public class Method {
    public void aOutPutMethod() {
        System.out.println("Hello World");
    }

    public class TestAppEnv {
        public static final String DOMAIN = "192.168.31.31";
        public static final String PORT = "8080";
    }

    public static Object getUrl() {
        String DOMAIN = "192.168.31.31";
        String PORT = "8080";
        String url = "http://" + DOMAIN + ":" + PORT;
        return url;
    }

    public static final String str = "abc123";
}
