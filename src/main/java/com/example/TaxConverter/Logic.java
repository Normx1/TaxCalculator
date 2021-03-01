package com.example.TaxConverter;

import TaxPackeg.TaxOperation;

public class Logic {
    private String region;
    private String last_name;
    private String gender;
    private double salary;
    private double baseValue;

    public Logic(String region, String last_name, String gender, Double salary, Double baseValue) {
        this.region = region;
        this.last_name = last_name;
        this.gender = gender;
        this.salary = salary;
        this.baseValue = baseValue;
    }
    public Double allTax() {

        double taxReg = 0;
        double taxSex = 0;
        double tax = 0;

        Double newTax = (new TaxOperation(salary, baseValue)).taxPayment();
        if (!gender.equals("man")) {
            taxSex = -newTax * 0.05;
        }

        if (!region.equals("Minsk")) {
            taxReg = -newTax * 0.05;
        } else {
            taxReg = newTax * 0.05;
        }
        tax = newTax + taxSex + taxReg;
        return tax;
    }
}
