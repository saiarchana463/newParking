package parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * MainParking is main class that passes control to other classes based on user input
 */
public class MainParking {
	
	enum VehicleType{
		BIKE,CAR,BUS;
	}
	 
	/**
	 * passes control to different classes and methods based on user input.
	 * @param args
	 * @throws IOException
	 * @throws ValidateException
	 * @throws InvalidOptionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, ValidateException ,InvalidOptionException, InterruptedException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<RegistrationDetails> detailsList = new ArrayList<RegistrationDetails>();
		RegistrationDetails registrationDetailsObj = new RegistrationDetails();
		String vehicleType ,entryOrExit;
		String next = "yes";
		int[] block = {20,20,20,20,20};
		while(next.equals("yes")) {
			System.out.println("Enter  1.ENTRY  2.EXIT 3.View Details:");
			entryOrExit = br.readLine();
			
			boolean isValidEntryOrExit= !entryOrExit.equals("1") && !entryOrExit.equals("2") && !entryOrExit.equals("3");
			while(isValidEntryOrExit) {
				try{
					if(isValidEntryOrExit)
						throw new InvalidOptionException("Invalid Option");
						
					}
					catch(InvalidOptionException e) {
						System.err.println(e.getMessage());
						Thread.sleep(100);
					}
				System.out.println("Enter correct option : ");
				entryOrExit = br.readLine();
				isValidEntryOrExit = !entryOrExit.equals("1") && !entryOrExit.equals("2") && !entryOrExit.equals("3");
			}
			
			if(entryOrExit.equals("1")) {
				System.out.println("Enter Vehicle Type : \n1.Bike 2.Car 3.Bus  ");
				vehicleType = br.readLine();
				
				boolean isValidVehicleType= !vehicleType.equals("1") && !vehicleType.equals("2") && !vehicleType.equals("3");
				while(isValidVehicleType) {
					try{
						if(isValidVehicleType)
							throw new InvalidOptionException("Invalid Option");
						}
						catch(InvalidOptionException e) {
							System.err.println(e.getMessage());
							Thread.sleep(100);
						}
					System.out.println("Enter correct option : ");
					vehicleType = br.readLine();
					isValidVehicleType = !vehicleType.equals("1") && !vehicleType.equals("2") && !vehicleType.equals("3");
				}
				
				if(vehicleType.equals("1")) {
					
					try {
						for(int i = 0;i<=5;i++) {
							if(block[i]>=1) {
								block[i] -= 1;
								Bike bikeObj = new Bike(String.valueOf(i+1),String.valueOf(VehicleType.BIKE),registrationDetailsObj.getFirstName(),registrationDetailsObj.getMiddleName(),registrationDetailsObj.getLastName(),registrationDetailsObj.getGender(),registrationDetailsObj.getDob(),registrationDetailsObj.getAddress(),registrationDetailsObj.getEmail(),registrationDetailsObj.getPhoneNo(),registrationDetailsObj.getRegistrationNo());
								bikeObj.storeBikeDetails(detailsList,bikeObj);
								break;
								
							}
						}
					}
					catch(IndexOutOfBoundsException e) {
						System.err.println("No Slot Available !");
						Thread.sleep(100);
					}
					
					
				}
				
				if(vehicleType.equals("2")) {
					try {
						for(int i =0;i<=5;i++) {
							if(block[i]>=2) {
								block[i] -= 5;
								Car carObj = new Car(String.valueOf(i+1)/*,carId*/,String.valueOf(VehicleType.CAR),registrationDetailsObj.getFirstName(),registrationDetailsObj.getMiddleName(),registrationDetailsObj.getLastName(),registrationDetailsObj.getGender(),registrationDetailsObj.getDob(),registrationDetailsObj.getAddress(),registrationDetailsObj.getEmail(),registrationDetailsObj.getPhoneNo(),registrationDetailsObj.getRegistrationNo());
								carObj.storeCarDetails(detailsList,carObj);
								break;
							}
						}
					}
					catch(IndexOutOfBoundsException e) {
						System.err.println("No Slot Available !");
						Thread.sleep(100);
					}
					
				}
				
				if(vehicleType.equals("3")) {
					try {
						for(int i =0;i<=5;i++) {
							if(block[i]>=4) {
								block[i] -= 10;
								Bus busObj = new Bus(String.valueOf(i+1)/*,busId*/,String.valueOf(VehicleType.BUS),registrationDetailsObj.getFirstName(),registrationDetailsObj.getMiddleName(),registrationDetailsObj.getLastName(),registrationDetailsObj.getGender(),registrationDetailsObj.getDob(),registrationDetailsObj.getAddress(),registrationDetailsObj.getEmail(),registrationDetailsObj.getPhoneNo(),registrationDetailsObj.getRegistrationNo());
								busObj.storeBusDetails(detailsList,busObj);
								break;
							}
						}
					}
					catch(IndexOutOfBoundsException e) {
						System.err.println("No Slot Available !");
						Thread.sleep(100);
					}
					
				}
				
			}
			else if(entryOrExit.equals("2")) {
				Exit exitObj = new Exit();
				block = exitObj.addSlot(block,detailsList);
				
			}
			
			else if(entryOrExit.equals("3")){
//				ViewDetails viewDetailsObj = new ViewDetails();
//				viewDetailsObj.viewDetails(block,detailsList);
				registrationDetailsObj.viewDetails(block,detailsList);
			}
			System.out.println("Do you want to continue (yes/no) :");
			next = br.readLine();
			
		}
		System.out.println("Thank You ...");
		
		
	}
	

}