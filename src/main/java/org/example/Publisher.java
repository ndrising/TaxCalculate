package org.example;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/taxcalculator", new TaxCalculatorImpl());
        System.out.println("Web Service is published at http://localhost:8080/taxcalculator");
    }
}
