package edu.miu.cs.cs425.customermgmtapp;

import edu.miu.cs.cs425.customermgmtapp.model.Customer;
import edu.miu.cs.cs425.customermgmtapp.repository.CustomerRepository;
import edu.miu.cs.cs425.customermgmtapp.util.JSONConverterUtil;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerMgmtApp {
    private final CustomerRepository customerRepository;

    public CustomerMgmtApp() {
        this.customerRepository = CustomerRepository.getInstance();
    }

    public static void main(String[] args) {
        System.out.println("Hello World! Welcome to CustomerMgmtApp");
        var app = new CustomerMgmtApp();
        var customers = app.customerRepository.getAllCustomers();
        Arrays.stream(customers)
                .sorted(Comparator.comparing(Customer::getFirstName))
                .forEach(System.out::println);
        var jsonData = JSONConverterUtil.convertCustomerArrayToJSON(customers);
        System.out.println(jsonData);
    }
}
