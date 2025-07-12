package car_showroom_management_system;

import java.util.Scanner;

public class Main {
	
public static void menu() {
		
		System.out.println("======== *** WELOME TO CAR SHOWROOM MANAGEMENT SYSTEM *** ======== ");
		System.out.println("");
		System.out.println("======== *** PLEASE ENTER YOUR CHOICE *** ========");
		System.out.println("");
		System.out.println("");
		
		System.out.println(" 1]. ADD SHOWROOM \t 2]. ADD EMPLOYEE \t 3]. ADD CARS");
		System.out.println("");
		System.out.println("");
		System.out.println(" 4]. GET SHOWROOM \t 5]. GET EMPLOYEE  \t 6]. GET CARS");

		System.out.println("");
		System.out.println("");
		System.out.println(" ======== *** PLEASE ENTER 0 to EXIT *** ========");
}


		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ShowRoom showRoom[] = new ShowRoom[5];
		Employee employee[] = new Employee[5];
		Car car[] = new Car[5];
		
		int showroomCount=0;
		int employeeCount=0;
		int carCount=0;
		int choice=100;
		
		
		while(choice!=0) {
			
			menu();
			
			choice = sc.nextInt();
			
			while (choice != 9 && choice !=0) {
				
				switch (choice) {
				case 1:
					showRoom[showroomCount] = new ShowRoom();
					showRoom[showroomCount].setDetails();
					showroomCount++;
					System.out.println();
					
					System.out.println("1]. ADD NEW SHOWROOM");
					System.out.println("9]. GO BACK TO MENU");
					choice = sc.nextInt();
					break;
					
				case 2:
					
					employee[employeeCount] = new Employee();
					employee[employeeCount].setDetails();
					employeeCount++;
					System.out.println("");
					System.out.println("2]. ADD NEW EMPLOYEE");
					System.out.println("9]. GO BACK TO MENU");
					choice = sc.nextInt();
					
					break;
					
				case 3:
					
					car[carCount] = new Car();
					car[carCount].setDetails();
					carCount++;
					System.out.println("");
					System.out.println("3]. ADD NEW CAR");
					System.out.println("9]. GO BACK TO MENU");
					choice = sc.nextInt();
					
					break;
					
					
				case 4:
					for(int i=0; i<showroomCount; i++) {
						showRoom[i].getDetails();
						System.out.println("");
						System.out.println("");
					}
					System.out.println("");
					System.out.println("9]. GO BACK TO MENU");
					System.out.println("0]. TO EXIT");
					choice = sc.nextInt();
					
					break;
					
				case 5:
					for(int i=0; i<employeeCount; i++) {
						employee[i].getDetails();
						System.out.println("");
						System.out.println("");
					}
					System.out.println("");
					System.out.println("9]. GO BACK TO MENU");
					System.out.println("0]. TO EXIT");
					choice = sc.nextInt();
					
					break;
					
				case 6:
					for(int i=0; i<carCount; i++) {
						car[i].getDetails();
						System.out.println("");
						System.out.println("");
					}
					System.out.println("");
					System.out.println("9]. GO BACK TO MENU");
					System.out.println("0]. TO EXIT");
					choice = sc.nextInt();
					
					break;
					
				default:
					System.out.println("Please Enter Valid Option");
					break;
				}
				
			}
			
		}
		
		
	}

}
