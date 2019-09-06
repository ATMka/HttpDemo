package com.epam.extlab;

import kong.unirest.Header;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class Main {
    public static void main(String[] args) {
        new DemoService().go();
    }
}
