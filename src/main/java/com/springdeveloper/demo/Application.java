package com.springdeveloper.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.hadoop.store.dataset.DatasetOperations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

    private DatasetOperations datasetOperations;

    @Autowired
    public void setDatesetOperations(DatasetOperations datasetOperations) {
        this.datasetOperations = datasetOperations;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("HELLO!!!");
        init();
        System.out.println(">> " + datasetOperations.read(Customer.class));
    }

    private void init() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Sven", 42, new Date()));
        customerList.add(new Customer("Nisse", 56, new Date()));
        datasetOperations.write(customerList);
    }
}
