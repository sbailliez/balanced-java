package credit_customer_list;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class credit_customer_list {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-2ppXve1BnInnsIKZytspDrsuhjtAT9dD8");

// this scenario is not present in scenarios.cache
// so the customer_uri will be rendered as an empty string
Customer customer = new Customer("/v1/customers/CU3pCSyHecPahJL4FKDMThoG");
Credit.Collection credits = customer.credits;

}
}
