package main.java.business;

import java.math.BigDecimal;
import java.util.Date;

import main.java.dataaccess.CustomerInfoImpl;
import main.java.dataaccess.VehicleInventoryImpl;
import main.java.models.Location;
import main.java.models.Payment;
import main.java.models.Reservation;
import main.java.models.Vehicle;

public class ReserveVehicleImpl implements ReserveVehicleInterface {

	VehicleInventoryImpl vehicleInventoryImpl;
	CustomerInfoImpl customerInfoImpl;
	CustomerNotificationImpl customerNotificationImpl;

	public boolean reserveVehicle(Location location, Date FromdateTime,
			Date TodateTime, String VehicleId, String customerId) {

		if (vehicleInventoryImpl.GetAvailableVehicles(location).contains(
				VehicleId)) {

			Payment payment = customerInfoImpl.getPaymentInfo(customerId);

			if (makePayment(payment)) {
				return true;
			} else {
				return false;
			}
		}
		// Vehicle not available for the selected date range
		return false;
	}

	public boolean makePayment(Payment payment) {
		return true;
	}

	public BigDecimal CalculateDueAmount(Reservation reservation) {

		int totReservationDays = reservation.getFrom().getDay()
				- reservation.getTo().getDay();

		String vehicleId = reservation.getVehicleId();

		Vehicle vehicleInfo = vehicleInventoryImpl.getVehicleInfo(vehicleId);

		BigDecimal totalDueAmount = BigDecimal.valueOf(totReservationDays)
				.multiply(vehicleInfo.getPricePerDay());

		return totalDueAmount;
	}

	public boolean cancelReservation(String reservationId) {

		Reservation reservation = getReservation(reservationId);

		String customerId = reservation.getUserId();

		vehicleInventoryImpl.UpdateInventory(reservation);

		Payment payment = customerInfoImpl.getPaymentInfo(customerId);

		if (refundPayment(payment)) {
			customerNotificationImpl.sendNotification("PAYMENT CREDITED",
					customerId);
		} else {
			customerNotificationImpl.sendNotification("PAYMENT NOT CREDITED",
					customerId);
		}

		return true;
	}

	public Reservation getReservation(String reservationId) {
		return new Reservation();
	}

	public boolean refundPayment(Payment payment) {
		return false;
	}
}
