package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		boolean trucks = true;
		Scanner kb = new Scanner(System.in);
		FoodTruck ft = new FoodTruck();
		
//		while (trucks) {
			System.out.println("Please enter the food truck name.");
			ft.truckName = kb.nextLine();

			if (ft.truckName.equals("Quit")) {
				System.out.println("You've chosen to quit.");
//				break;
		}
			System.out.println("Please enter the type of food.");
			ft.foodType = kb.nextLine();

			System.out.println("Please give a rating between 1 - 5.");
			ft.numericRating = kb.nextInt();

//		}
	
		ft.printMenu();
	
	
	
	
	}
	
	
}
