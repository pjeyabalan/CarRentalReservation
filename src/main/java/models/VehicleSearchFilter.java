package main.java.models;

public class VehicleSearchFilter {

	private String pricePerDay;
	private String carMake;
	private boolean isCarSeatAvailable;
	private boolean isGPSAvailable;
	
	public String getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(String pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public boolean isCarSeatAvailable() {
		return isCarSeatAvailable;
	}
	public void setCarSeatAvailable(boolean isCarSeatAvailable) {
		this.isCarSeatAvailable = isCarSeatAvailable;
	}
	public boolean isGPSAvailable() {
		return isGPSAvailable;
	}
	public void setGPSAvailable(boolean isGPSAvailable) {
		this.isGPSAvailable = isGPSAvailable;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carMake == null) ? 0 : carMake.hashCode());
		result = prime * result + (isCarSeatAvailable ? 1231 : 1237);
		result = prime * result + (isGPSAvailable ? 1231 : 1237);
		result = prime * result
				+ ((pricePerDay == null) ? 0 : pricePerDay.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleSearchFilter other = (VehicleSearchFilter) obj;
		if (carMake == null) {
			if (other.carMake != null)
				return false;
		} else if (!carMake.equals(other.carMake))
			return false;
		if (isCarSeatAvailable != other.isCarSeatAvailable)
			return false;
		if (isGPSAvailable != other.isGPSAvailable)
			return false;
		if (pricePerDay == null) {
			if (other.pricePerDay != null)
				return false;
		} else if (!pricePerDay.equals(other.pricePerDay))
			return false;
		return true;
	}
	public String toString() {
		return "VehicleSearchFilter [pricePerDay=" + pricePerDay + ", carMake="
				+ carMake + ", isCarSeatAvailable=" + isCarSeatAvailable
				+ ", isGPSAvailable=" + isGPSAvailable + "]";
	}	
}
