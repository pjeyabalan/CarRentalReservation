package main.java.business;

import java.math.BigDecimal;
import java.util.Date;

import main.java.models.Location;
import main.java.models.Payment;
import main.java.models.Reservation;

public interface ReserveVehicleInterface {

	
	boolean reserveVehicle(Location location,Date FromdateTime,Date TodateTime,String VehicleId, String customerId);
	boolean makePayment(Payment payment);
	BigDecimal CalculateDueAmount(Reservation reservation);
	boolean cancelReservation(String reservationId);
	Reservation getReservation(String reservationId);
	boolean refundPayment(Payment payment);
}
