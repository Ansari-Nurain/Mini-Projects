package car_showroom_management_system;

import java.util.Scanner;

public class ShowRoom implements Utility {
	
	String showroomName;
	String showroomAddress;
	int totalEmployee;
	int totalCarsInStock=0;
	String managerName;

	@Override
	public void getDetails() {

		System.out.println("Showroom Name : " +showroomName);
		System.out.println("Showroom Address : " +showroomAddress);
		System.out.println("Total Employee : " +totalEmployee);
		System.out.println("Manager Name : " +managerName);
		System.out.println("Total Cars in Stock : " +totalCarsInStock);
		

	}

	@Override
	public void setDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("===== ** PLEASE ENTER SHOWROOM DEATAILS ** =====");
		
		System.out.println();
		
		System.out.println("Please Enter Showroom Name : ");
		showroomName = sc.nextLine();
		System.out.println("Please Enter Showroom Address : ");
		showroomAddress = sc.nextLine();
		System.out.println("Please Enter Manager Name : ");
		managerName = sc.nextLine();

		System.out.println("Please Enter Total Employee : ");
		totalEmployee = sc.nextInt();
		System.out.println("Please Enter Total Cars in Stock : ");
		totalCarsInStock = sc.nextInt();
		


	}
	
	
	

}
