package parking;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Car inherits RegistrationDetails and storeBikeDetails() store them in detailsList 
 */
public class Car extends RegistrationDetails {
	private String slot;
	public Car(String slotNo,String typeCar,String firstName ,String middleName, String lastName , String gender , String dob,String address, String email ,String phoneNo, String registrationNo) {
		slot = slotNo;
	}

	/**
	 * Stores car details into list.
	 * @param detailsList
	 * @throws InterruptedException 
	 * @throws ValidateException 
	 * @throws IOException 
	 * @throws RuntimeException 
	 */
	public void storeCarDetails(ArrayList<RegistrationDetails> detailsList,Car carObj) throws RuntimeException, IOException, ValidateException, InterruptedException {
		super.registerDetails(detailsList);
		detailsList.add(carObj);
	}
	
	/**
	 * Returns Slot Number
	 */
	public String getSlotNo() {
		return slot;
	}
	
}