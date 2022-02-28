package com.skilldistillery.foodtruck;

public class FoodTruck {

	public int numericId;
	public int numericRating;
	public String truckName;
	public String foodType;
	public static int nextNumericId = 0;

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

	public void setnumericRating(int numericRating) {
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

	public String toString() {
		StringBuilder make = new StringBuilder();
		make.append("Food Truck Name: ").append(truckName).append(", Food Type: ").append(foodType).append(", Rating: ")
				.append(numericRating).append(", and truckID: ").append(numericId).append(".");

		return make.toString();
	}

	public void displayCar() {
		String carData = toString();
		System.out.println(carData);
	}

}