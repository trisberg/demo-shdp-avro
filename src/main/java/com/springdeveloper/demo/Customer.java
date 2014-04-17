package com.springdeveloper.demo;

import java.util.Date;

public class Customer {

    private String name;

    private int age;

    private Date customerSince;

    public Customer() {}

    public Customer(String name, int age, Date customerSince) {
        this.name = name;
        this.age = age;
        this.customerSince = customerSince;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + customerSince;
    }
}
