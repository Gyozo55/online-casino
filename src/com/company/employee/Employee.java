package com.company.employee;

public abstract class Employee {
    private String name;
    private String paymentPeriod;

    public Employee(String name, String paymentPeriod) {
        this.name = name;
        this.paymentPeriod = paymentPeriod;
    }

    public String getName() {
        return name;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }
}
