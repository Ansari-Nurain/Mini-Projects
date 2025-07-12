package showroom;

public class Car {

	
	String carName;
	String carColor;
	String carFuelType;
	int carPrice;
	String carType;
	String carTransmissions;

	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarFuelType() {
		return carFuelType;
	}
	public void setCarFuelType(String carFuelType) {
		this.carFuelType = carFuelType;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarTransmissions() {
		return carTransmissions;
	}
	public void setCarTransmissions(String carTransmissions) {
		this.carTransmissions = carTransmissions;
	}
	
	public void display() {
		
		System.out.println("Car Name :"+carName);
		System.out.println("Car Color :"+carColor);
		System.out.println("Car Feul Type :"+carFuelType);
		System.out.println("Car Price :"+carPrice);
		System.out.println("Car Type :"+carType);
		System.out.println("Car Transmissions :"+carTransmissions);

	}
}
