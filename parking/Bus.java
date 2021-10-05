package parking;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Bus inherits RegistrationDetails and storeBikeDetails() store them in detailsList 
 */
public class Bus extends RegistrationDetails {
	private String slot;
	public Bus(String slotNo,String typeBus,String firstName ,String middleName, String lastName , String gender , String dob,String address, String email ,String phoneNo, String registrationNo) {
		slot = slotNo;
	}
	
	/**
	 * stores Bus Details into list.
	 * @param detailsList
	 * @throws InterruptedException 
	 * @throws ValidateException 
	 * @throws IOException 
	 * @throws RuntimeException 
	 */
	public void storeBusDetails(ArrayList<RegistrationDetails> detailsList,Bus busObj) throws RuntimeException, IOException, ValidateException, InterruptedException {
		super.registerDetails(detailsList);
		detailsList.add(busObj);
	}

	/**
	 * Returns Slot Number
	 */
	public String getSlotNo() {
		return slot;
	}
}