package org.example;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.TaxCalculator")
public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public double calculateTax(double income) {
        if (income <= 3500) {
            return 0;
        } else if (income <= 5000) {
            return (income - 3500) * 0.03;
        } else if (income <= 8000) {
            return (income - 5000) * 0.1 + 45;
        } else {
            return (income - 8000) * 0.2 + 145;
        }
    }
}
