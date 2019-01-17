package main.java.dataaccess;

import main.java.models.Authentiation;
import main.java.models.Customer;
import main.java.models.Payment;

public interface CustomerInfoInterface {

	Boolean authenticateUser(Authentiation auth);

	Customer getCustomerInfo(String customerId);

	Payment getPaymentInfo(String customerId);
}
