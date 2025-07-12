package com.moileapp;

public class Test {

	public static void main(String[] args) {

		Mobile myMobile = new Mobile(5, "Apple", "IOS");
		
		myMobile.takePicture();
		System.out.println(myMobile.getBatteryPercentage());
		
		myMobile.videoRecord();
		System.out.println(myMobile.getBatteryPercentage());
		
		myMobile.playGame();
		System.out.println(myMobile.getBatteryPercentage());
		
		myMobile.takePicture();
		System.out.println(myMobile.getBatteryPercentage());
		
		myMobile.batteryCharged();
		System.out.println(myMobile.getBatteryPercentage());

		


		
		
	}

}
