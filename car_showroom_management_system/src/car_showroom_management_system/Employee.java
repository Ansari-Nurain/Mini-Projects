package car_showroom_management_system;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends ShowRoom implements Utility {
	
	String empId;
	String empName;
	int empAge;
	String empDepartment;
	
	@Override
	public void getDetails() {
		
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Age : "+empAge);
		System.out.println("Employee Department : "+empDepartment);
		System.out.println("Employee Showroom Name : "+showroomName);

	}
	
	@Override
	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		UUID uuid = UUID.randomUUID();
		empId = String.valueOf(uuid);
		
		System.out.println("******** PLEASE ENETR EMPLOYEE DETAILS ********");
		System.out.println();
		
		System.out.println("Please Enter Employee Name");
		empName = sc.nextLine();
		System.out.println("Please Enter Employee Age");
		empAge = sc.nextInt();
	      sc.nextLine();
		System.out.println("Please Enter Employee Department");
		empDepartment = sc.nextLine();
		System.out.println("Please Enter Employee Showroom Name");
		showroomName = sc.nextLine();

		
	
		
	}

}
