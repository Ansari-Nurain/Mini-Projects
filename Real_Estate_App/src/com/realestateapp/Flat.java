package com.realestateapp;


public class Flat {
	private int squareFeet;
	private int pricePerSquareFeet;
	private int floorNumber;
	private int numbersOfRoom;
	
	public Flat(int squareFeet, int pricePerSquareFeet, int floorNumber, int numbersOfRoom) {
		super();
		this.squareFeet = squareFeet;
		this.pricePerSquareFeet = pricePerSquareFeet;
		this.floorNumber = floorNumber;
		this.numbersOfRoom = numbersOfRoom;
	}
	
	public int getPrice() {
		
		return squareFeet*pricePerSquareFeet;
	}
	
	public void printAllValues() {
		
		System.out.println("------------------------");
		System.out.println("Square Feet " +squareFeet);
		System.out.println("Price Per SquareFeet " +pricePerSquareFeet);
		System.out.println("Floor Number " +floorNumber);
		System.out.println("Numbers Of Room " +numbersOfRoom);

	}

}

