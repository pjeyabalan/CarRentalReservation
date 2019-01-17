package main.java.models;
import java.util.List;

public class Location {

	private String state;
	private String city;
	private String zipCode;
	private List availableVehicles;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public List getAvailableVehicles() {
		return availableVehicles;
	}
	public void setAvailableVehicles(List availableVehicles) {
		this.availableVehicles = availableVehicles;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((availableVehicles == null) ? 0 : availableVehicles
						.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (availableVehicles == null) {
			if (other.availableVehicles != null)
				return false;
		} else if (!availableVehicles.equals(other.availableVehicles))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	public String toString() {
		return "Location [state=" + state + ", city=" + city + ", zipCode="
				+ zipCode + ", availableVehicles=" + availableVehicles + "]";
	}
	
	
}
