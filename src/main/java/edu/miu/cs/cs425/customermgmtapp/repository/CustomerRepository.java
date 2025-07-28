package edu.miu.cs.cs425.customermgmtapp.repository;

import edu.miu.cs.cs425.customermgmtapp.model.Customer;

public class CustomerRepository {
    private static CustomerRepository instance;

    private CustomerRepository() {}

    public static synchronized CustomerRepository getInstance() {
        if (instance == null) {
            instance = new CustomerRepository();
        }
        return instance;
    }

    public Customer[] getAllCustomers() {
        return new Customer[] {
                new Customer(1, "John", "Smith"),
                new Customer(201, "Anna", "Jones"),
                new Customer(202, "Bob", "Franks")
        };
    }

    public String toJSONByHand() {
        return """
                [
                    {"customerId": 1, "firstName": "John", "lastName": "Smith"},
                    {"customerId": 201, "firstName": "Anna", "lastName": "Jones"}
                ]
                """;
    }

}
