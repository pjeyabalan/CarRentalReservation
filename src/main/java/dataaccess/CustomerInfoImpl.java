package main.java.dataaccess;

import main.java.models.Authentiation;
import main.java.models.Customer;
import main.java.models.Payment;

public class CustomerInfoImpl implements CustomerInfoInterface {

	public Boolean authenticateUser(Authentiation auth) {
		return null;
	}

	public Customer getCustomerInfo(String customerId) {
		return new Customer();
	}

	public Payment getPaymentInfo(String customerId) {
		return new Payment();
	}
}
