package test.java;

import java.util.List;

import main.java.business.CustomerNotificationImpl;
import main.java.dataaccess.CustomerInfoImpl;
import main.java.dataaccess.VehicleInventoryImpl;
import main.java.models.Location;
import main.java.models.Reservation;

public class ReserveVehicleTest {

	VehicleInventoryImpl vehicleInventoryImpl;
	CustomerInfoImpl customerInfoImpl;
	CustomerNotificationImpl customerNotificationImpl;
	Reservation reservation;
	Location location;
	String vehicleId;

	public void Setup(){
		vehicleInventoryImpl= new VehicleInventoryImpl();
		customerInfoImpl = new CustomerInfoImpl();
		customerNotificationImpl = new CustomerNotificationImpl();
	    reservation = new Reservation();
	    
	}
	
	public void reserveVehicleNotAvailable() {
		
		List availableVehicles = vehicleInventoryImpl.GetAvailableVehicles(location);
		
		//Assert.That(available,Is.NOTNULL);
		
		boolean selectedVehicle =vehicleInventoryImpl.GetAvailableVehicles(location).contains(vehicleId);
		
		//Assert.That(selectedVehicle , Is.FALSE)
		
		
	}
	
	
	public void reserveVehicleAvailable() {
		
		List availableVehicles = vehicleInventoryImpl.GetAvailableVehicles(location);
		
		//Assert.That(available,Is.NOTNULL);
		
		boolean selectedVehicle =vehicleInventoryImpl.GetAvailableVehicles(location).contains(vehicleId);
		
		//Assert.That(selectedVehicle , Is.TRUE)
		
	}
	
	
}
