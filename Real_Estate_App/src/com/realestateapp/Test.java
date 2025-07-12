package com.realestateapp;

public class Test {
	
	public static void main(String[] args) {
		
		Flat myFlat = new Flat(500, 5000, 3, 3);
		int price = myFlat.getPrice();
		System.out.println("Price : " + price);
		myFlat.printAllValues();
	}

}
