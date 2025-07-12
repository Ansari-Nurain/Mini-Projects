package showroom;

public class Showroom {
	String showroomName;
	String showroomAddress;
	int totalEmployee;
	int totalCarsInStock=0;
	String managerName;
	
	
	public String getShowroomName() {
		return showroomName;
	}


	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}


	public String getShowroomAddress() {
		return showroomAddress;
	}


	public void setShowroomAddress(String showroomAddress) {
		this.showroomAddress = showroomAddress;
	}


	public int getTotalEmployee() {
		return totalEmployee;
	}


	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}


	public int getTotalCarsInStock() {
		return totalCarsInStock;
	}


	public void setTotalCarsInStock(int totalCarsInStock) {
		this.totalCarsInStock = totalCarsInStock;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public void display() {

		System.out.println("Showroom Name : "+showroomName);
		System.out.println("Showroom Address : "+showroomAddress);
		System.out.println("Total Employee : "+totalEmployee);
		System.out.println("Total Cars in Stock : "+totalCarsInStock);
		System.out.println("Manager Name : "+managerName);

	}
	

}
