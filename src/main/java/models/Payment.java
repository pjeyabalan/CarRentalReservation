package main.java.models;

public class Payment {
	
	private String paymentType;
	private String paymentAmount;
	private boolean isPaymentSuccessful;
	private String paymentId;
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public boolean isPaymentSuccessful() {
		return isPaymentSuccessful;
	}
	public void setPaymentSuccessful(boolean isPaymentSuccessful) {
		this.isPaymentSuccessful = isPaymentSuccessful;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}
