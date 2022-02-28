package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		String foodName;
		String truckName;
		int rating = 0;
		Scanner kb = new Scanner(System.in);
		FoodTruck[] foodTruckArr = new FoodTruck[5];

		for (int truck = 0; truck <= 5; truck++) {
			System.out.println("Please enter the food truck name.");
			truckName = kb.next();

			if (truckName.equalsIgnoreCase("Quit")) {
				System.out.println("You've chosen to quit.");
				break;
			}
			System.out.println("Please enter the type of food.");
			foodName = kb.next();

			System.out.println("Please give a rating between 1 - 5.");
			rating = kb.nextInt();

			FoodTruck ft = new FoodTruck(truckName, foodName, rating);
			foodTruckArr[truck] = ft;
			
		}
		
		FoodTruckApp app = new FoodTruckApp();
		app.Menu(foodTruckArr, kb);
	}
		

	public void Menu(FoodTruck[] foodTruckArr, Scanner kb )	{
			while(true) {
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
			
			System.out.print("Which would you like to do? ");
			
			int choice = kb.nextInt();

			switch (choice) {

			case 1:for (int truck = 0; truck <=5; truck++) {
				if (foodTruckArr[truck] == null) {
					break;
				} else {
					System.out.println(foodTruckArr[truck]);
				}
			}

			break;
			case 2:
			
				break;
			case 3:
				

				break;
			case 4:
				System.out.print("You chosen to quit");
				return;

			}		
	}
}
}
