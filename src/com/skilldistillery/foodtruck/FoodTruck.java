package com.skilldistillery.foodtruck;

public class FoodTruck {

	public int numericId;
	public int numericRating;
	public String truckName;
	public String foodType;
	public static int nextNumericId = 5;

	public FoodTruck() {
	}

	public FoodTruck(String truckName, String foodType, int numericRating, int numericId) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.numericRating = numericRating;
		this.numericId = numericId;
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

	public void setnumericId(int truckID) {
		this.numericId = numericId + nextNumericId;
	}

	public static int getNumericId() {
		return nextNumericId;
	}

	public static void setnextNumericId(int nextNumericId) {
		FoodTruck.nextNumericId = nextNumericId;
		nextNumericId++;
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

	public void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. All food trucks |");
		System.out.println("|   2. Average rating  |");
		System.out.println("|   3. Highest rated   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();

	}
}