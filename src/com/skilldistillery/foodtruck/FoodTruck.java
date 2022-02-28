package com.skilldistillery.foodtruck;

public class FoodTruck {

	private int numericId;
	private double numericRating;
	private String truckName;
	private String foodType;
	private static int nextNumericId = 0;
	
	public String toString() {
		String output = "Truck Name: " + truckName + ", Food Type: " + foodType + ", Truck Rating: " 
				+ numericRating + ", Truck ID: " + numericId;
		
		return output;
	}
	public void displayCar() {
		String carData = toString();
		System.out.println(carData);
	}

	public FoodTruck() {
	}

	public FoodTruck(String truckName, String foodType, int numericRating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.numericRating = numericRating;
		this.numericId = nextNumericId;
		nextNumericId++;

	}

	public String gettruckName() {
		return truckName;
	}

	public void settruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getfoodType() {
		return foodType;
	}

	public void setfoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getnumericRating() {
		return numericRating;
	}

	public void setnumericRating(double numericRating) {
		this.numericRating = numericRating;
	}

	public int getnumericId() {
		return numericId;
	}

	public void setnumericId(int numericId) {
		this.numericId = numericId;
	}

	public static int getNumericId() {
		return nextNumericId;
	}



}