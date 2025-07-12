package car_showroom_management_system;

import java.util.Scanner;

public class Car extends ShowRoom implements Utility {
	
	String carName;
	String carColor;
	String carFuelType;
	int carPrice;
	String carType;
	String carTransmissions;
	
	@Override
	public void getDetails() {
		
		System.out.println("Car Name :"+carName);
		System.out.println("Car Color :"+carColor);
		System.out.println("Car Feul Type :"+carFuelType);
		System.out.println("Car Price :"+carPrice);
		System.out.println("Car Type :"+carType);
		System.out.println("Car Transmissions :"+carTransmissions);

	}
	
	@Override
	public void setDetails() {
		
		System.out.println("******** PLEASE ENTER THE CAR DETAILS ********");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Car Name : ");
		carName = sc.nextLine();
		System.out.println("Car Color :");
		carColor = sc.nextLine();
		System.out.println("Car Fuel Type ( PETROL/DESSEL ) :");
		carFuelType = sc.nextLine();
		System.out.println("Car Price :");
		carPrice = sc.nextInt();
		 sc.nextLine();
		System.out.println("Car Type(Hatchback/Sedan/SUV/Crossover/Coupe) :");
		carType = sc.nextLine();
		System.out.println("Car Transmission (AUTOMATIC/MENUAL) :");
		carTransmissions = sc.nextLine();
		
		totalCarsInStock++;
		
	}
	
	

}
