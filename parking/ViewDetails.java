
package parking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ViewDetails class is used to display all the details of vehicles that are parking lot.
 */
public class ViewDetails {

	public void viewDetails(int[] block,ArrayList<RegistrationDetails> detailsList) {
		System.out.println("Slots Available "+Arrays.toString(block));
		if(detailsList.size()<=0) {
			System.out.println("No Details Available !");
		}
		else {
			for(RegistrationDetails detail : detailsList) {
				System.out.println(detail.getSlotNo()+" "+detail.getFirstName()+" "+detail.getMiddleName()+" "+detail.getLastName()+" "+detail.getAddress()+" "+detail.getDob()+" "+detail.getEmail()+" "+detail.getGender()+" "+detail.getPhoneNo()+" "+detail.getRegistrationNo());
			}
		}
		
	}
	
}