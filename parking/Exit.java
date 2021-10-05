package parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Exit class is used when vehicles exit from parking lot.
 */
public class Exit {
	
	/**
	 * Checks the vehicle based on Registration Number , deletes the details of it from list and adds it's slot back to block.
	 * @param block
	 * @param detailsList
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public int[] addSlot(int[] block , ArrayList<RegistrationDetails> detailsList ) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if(detailsList.size()<=0) {
			System.out.println("No Vehicles in parking lot !");
		}
		else {
			System.out.println("Enter Vehicle Registration Number :");
			String vehicleRegistrationNo = br.readLine();
			for(int i = 0;i<detailsList.size();i++){
	            if(detailsList.get(i).getRegistrationNo().equals(vehicleRegistrationNo)){
	            	int slot = Integer.parseInt(detailsList.get(i).getSlotNo());
					if(detailsList.get(i) instanceof Bike) {
						block[slot-1] += 1;
					}
					else if (detailsList.get(i) instanceof Car)
					{
						block[slot-1] += 2;
					}
					else if(detailsList.get(i) instanceof Bus) {
						block[slot-1] += 4;
					}
	                detailsList.remove(i);
	                break;
	            }
	        }
		}
		
		
		return block;
		
	}
	
	

}