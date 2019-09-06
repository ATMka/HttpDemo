package com.epam.extlab;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.Map;

public class HttpService {
    public static HttpResponse<String> response(String httpMethod, String url, Map<String, String>headers, Map<String, Object> parameters){
        return Unirest.request(httpMethod, url)
                .headers(headers)
                .queryString(parameters)
                .asString();
    }
}
