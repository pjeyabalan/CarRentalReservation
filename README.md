# CarRentalReservation
Design and Prototype for a car reservation system

# Model classes

class Location{

private String state;
private String city;
private String zipCode;
private List<Vehicle> availableVehicles;

}

Enum CarSize {
	SUV , COMPACT , SMALL , MEDIUM , UHAUL, TRUCK
}

Enum CarMake{
TOYOTA, FORD , MAZDA , HONDA , CHEVY , SUBARU 
}

Enum PaymentMode{
CREDIT , CASH , DEBIT ,PAYPAL ,INTERNETPAYMENT
}

class vehicle{

private int vehicleId;
private int vehicleType;
private String model;
private String make;
private BigDecimal pricePerDay;
}

class Reservation{

private DateTime reservationFromTime;
private DateTime reservationToTime;
private int totalReservationDays;

}


class Receipt{

private String userId;
private String vehicleId;
private DateTime From;
private DateTime To;
private Payment payment;
private String transactionId;

}


class Payment{
	PaymentMode mode;
	private String paymentType;
	private String paymentAmount;
	private boolean isPaymentSuccessful;
}

class VehicleSearchFilter{

private String pricePerDay;
private String carMake;
private boolean isCarSeatAvailable;
private boolean isGPSAvailable;

}

class User{

private String firstName;
private String lastName;
private String phone;
private String address;
private String userId;

}

Class Authentiation{

private String userName;
private String password;
private boolean isLoginSuccessful;

}

# Data Access class / Interface:

public interface CustomerInfoInterface {
	Boolean authenticateUser(Authentiation auth);
	Customer getCustomerInfo(String customerId);
	Payment getPaymentInfo(String customerId);
}

public interface VehicleInventoryInterface {
	List GetAvailableVehicles(Location location);
	List GetAvailableVehiclesFilter(Location location,
			VehicleSearchFilter vehicleSearchFilter);
	Boolean UpdateInventory(Reservation reservation);
	Vehicle getVehicleInfo(String vehicleId);
}

# Business class / Interface:

public interface ReserveVehicleInterface {
	boolean reserveVehicle(Location location,Date FromdateTime,Date TodateTime,String VehicleId, String customerId);
	boolean makePayment(Payment payment);
	BigDecimal CalculateDueAmount(Reservation reservation);
	boolean cancelReservation(String reservationId);
	Reservation getReservation(String reservationId);
	boolean refundPayment(Payment payment);
}

public interface CustomerNotificationInterface {
	boolean sendNotification(String messge, String customerId);
}
