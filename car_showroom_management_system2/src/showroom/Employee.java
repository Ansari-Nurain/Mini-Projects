package showroom;

public class Employee extends Showroom {

	String empId;
	String empName;
	int empAge;
	String empDepartment;

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	public void display() {
		
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Age : "+empAge);
		System.out.println("Employee Department : "+empDepartment);
		System.out.println("Employee Showroom Name : "+showroomName);

	}
}
