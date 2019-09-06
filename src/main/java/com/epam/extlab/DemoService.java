package com.epam.extlab;

import kong.unirest.Header;
import kong.unirest.HttpResponse;

import java.util.HashMap;
import java.util.Map;

public class DemoService {
    public void go(){
        String url = "https://4pda.ru/forum/index.php";

        Map<String,String> headersMap = new HashMap<String, String>();
        headersMap.put("yo","kmon");
        headersMap.put("ChtoZaHeader?","NeZnau");

        Map<String,Object> parametersMap = new HashMap<String, Object>();
        parametersMap.put("showforum","282");

        HttpResponse<String> firstHttpQuery = HttpService.response("GET",url,headersMap,parametersMap);

        System.out.println(firstHttpQuery.getStatus()  + " : " + firstHttpQuery.getStatusText());
        System.out.println("");
        for (Header header:firstHttpQuery.getHeaders().all()) {
            System.out.println(header.getName() + " : " + header.getValue());
        }
        System.out.println("");
        System.out.println(firstHttpQuery.getBody());
    }
}
