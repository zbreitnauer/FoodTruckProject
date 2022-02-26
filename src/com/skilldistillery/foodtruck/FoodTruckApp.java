package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruck ft = new FoodTruck();
		
		System.out.println("Please enter the food truck name.");
		ft.truckName = kb.nextLine();
		
		System.out.println("Please enter the type of food.");
		ft.foodType = kb.nextLine();
		
		System.out.println("Please give a rating between 1 - 5.");
		ft.numericRating = kb.nextInt();
		
		
	}

}
