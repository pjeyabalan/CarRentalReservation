package main.java.models;

import java.util.Date;

public class Reservation {
	private String reservationId;
	private String userId;
	private String vehicleId;
	private Date From;
	private Date To;
	private Payment payment;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Date getFrom() {
		return From;
	}
	public void setFrom(Date from) {
		From = from;
	}
	public Date getTo() {
		return To;
	}
	public void setTo(Date to) {
		To = to;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((From == null) ? 0 : From.hashCode());
		result = prime * result + ((To == null) ? 0 : To.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result
				+ ((reservationId == null) ? 0 : reservationId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((vehicleId == null) ? 0 : vehicleId.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (From == null) {
			if (other.From != null)
				return false;
		} else if (!From.equals(other.From))
			return false;
		if (To == null) {
			if (other.To != null)
				return false;
		} else if (!To.equals(other.To))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (reservationId == null) {
			if (other.reservationId != null)
				return false;
		} else if (!reservationId.equals(other.reservationId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (vehicleId == null) {
			if (other.vehicleId != null)
				return false;
		} else if (!vehicleId.equals(other.vehicleId))
			return false;
		return true;
	}
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", userId="
				+ userId + ", vehicleId=" + vehicleId + ", From=" + From
				+ ", To=" + To + ", payment=" + payment + "]";
	}
	
	
}
