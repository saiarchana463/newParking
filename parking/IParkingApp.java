package parking;

import java.io.IOException;
import java.util.ArrayList;

/**
 * ParkingApp is interface that lists the action done by the application
 */

public interface IParkingApp {
	
	void registerDetails(ArrayList<RegistrationDetails> detailsList) throws RuntimeException, ValidateException, IOException, InterruptedException;
	
	

}