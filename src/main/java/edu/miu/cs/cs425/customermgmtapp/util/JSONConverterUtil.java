package edu.miu.cs.cs425.customermgmtapp.util;

import edu.miu.cs.cs425.customermgmtapp.model.Customer;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {

    public static String convertCustomerArrayToJSON(Customer[] customers) {
        JSONArray customerJsonArray = new JSONArray();
        Arrays.stream(customers).forEach(
                customer -> {
                    customerJsonArray.put(customer.toJSON());
                }
        );
        return customerJsonArray.toString();
    }
}
