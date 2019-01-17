package main.java.dataaccess;

import java.util.List;
import main.java.models.*;

public interface VehicleInventoryInterface {

	List GetAvailableVehicles(Location location);

	List GetAvailableVehiclesFilter(Location location,
			VehicleSearchFilter vehicleSearchFilter);

	Boolean UpdateInventory(Reservation reservation);

	Vehicle getVehicleInfo(String vehicleId);
}
