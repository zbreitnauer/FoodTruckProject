package com.skilldistillery.foodtruck;

public class FoodTruck {
	
	public int numericId;
	public int numericRating;
	public String truckName;
	public String foodType;
	
	 public void printMenu(){
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