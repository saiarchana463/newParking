package parking;

import java.io.IOException;
import java.util.ArrayList;

/**
 *  Bike inherits RegistrationDetails and storeBikeDetails() store them in detailsList 
 */

class Bike extends RegistrationDetails {

	private String slot;
	public Bike(String slotNo,String typeBike,String firstName ,String middleName, String lastName , String gender , String dob,String address, String email ,String phoneNo, String registrationNo) {
	slot = slotNo;
	}
	
	/**
	 * stores Bike details into list
	 * @param detailsList
	 * @throws InterruptedException 
	 * @throws ValidateException 
	 * @throws IOException 
	 * @throws RuntimeException 
	 */
	public void storeBikeDetails(ArrayList<RegistrationDetails> detailsList, Bike bikeObj) throws RuntimeException, IOException, ValidateException, InterruptedException {
		super.registerDetails(detailsList);
		detailsList.add(bikeObj);
	}
	
	/**
	 * Returns Slot Number
	 */
	public String getSlotNo() {
		return slot;
	}
	
}