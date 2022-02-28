package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		boolean trucks = true;
		int choice;
		Scanner kb = new Scanner(System.in);
		FoodTruck ft = new FoodTruck();

		while (trucks) {
		System.out.println("Please enter the food truck name.");
		ft.truckName = kb.nextLine();
		if (ft.truckName.equals("Quit")) {
			System.out.println("You've chosen to quit.");
				break;
		}
		System.out.println("Please enter the type of food.");
		ft.foodType = kb.nextLine();

		System.out.println("Please give a rating between 1 - 5.");
		ft.numericRating = kb.nextInt();

		}

		while (trucks) {

			ft.printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {

			case 1:
				ft.displayCar();

				break;
			case 2:
				System.out.println(ft.foodType);
				break;
			case 3:
				System.out.println(ft.numericRating);

				break;
			case 4:
				System.out.print("You chosen to quit");
				return;

			}

		}
	}
}