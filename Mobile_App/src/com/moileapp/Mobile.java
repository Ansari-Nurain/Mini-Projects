package com.moileapp;

public class Mobile {
	
	private int screenSize;
	private String companyName;
	private String operatingSystem;
	private int batteryPercentage;
	
	public Mobile(int screenSize, String companyName, String operatingSystem) {
		super();
		this.screenSize = screenSize;
		this.companyName = companyName;
		this.operatingSystem = operatingSystem;
		this.batteryPercentage = 100;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void takePicture() {
		
		if(batteryPercentage<10) {
			System.out.println("Cannot take picture. Battery is not sufficient");
		}else {
			System.out.println("Picture is taken");
			batteryPercentage-=10;
		}
	}
	
	public void videoRecord() {
		if(batteryPercentage<30) {
			System.out.println("Cannot record video. Battery is not sufficient");
		}else {
			System.out.println("Video is record");
			batteryPercentage-=30;
		}
	}
	
	public void playGame() {
		if(batteryPercentage<60) {
			System.out.println("Cannot play game. Battery is not sufficient");
		}else {
			System.out.println("Play video game");
			batteryPercentage-=60;
		}
	}
	
	public void batteryCharged() {
		batteryPercentage = 100;
		System.out.println("Battery is charge 100%");
	}
	

}
