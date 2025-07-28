package edu.miu.cs.cs425.customermgmtapp.model;

import org.json.JSONObject;

import java.util.StringJoiner;

public class Customer {
    private Integer customerId;
    private String firstName;
    private String lastName;

    public Customer(Integer customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("customerId=" + customerId)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .toString();
    }

    public String toJSON() {
        JSONObject customerJsonObject = new JSONObject();
        customerJsonObject.put("customerId", customerId);
        customerJsonObject.put("firstName", firstName);
        customerJsonObject.put("lastName", lastName);
        return customerJsonObject.toString();
    }
}
