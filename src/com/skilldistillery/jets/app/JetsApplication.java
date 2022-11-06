package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.UserJet;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication launch = new JetsApplication();

		launch.run();

	}

	public void run() {
		AirField af = new AirField();
		af.createJets("jets.txt");

		Scanner sc = new Scanner(System.in);

		while (true) {
			int choice;
			System.out.println("Please choose an option between 1 and 9: ");
			makeMenu();
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("List of Jets: ");
				for (Jet jet : af.fleet) {
					System.out.println(jet.toString());
				}
				continue;

			case 2:
				System.out.println("Flying all Jets: ");
				for (Jet jet : af.fleet) {
					jet.fly();
				}
				continue;

			case 3:
				Jet jet = new UserJet();
				System.out.println("View the fastest Jet: ");
				for (Jet j : af.fleet) {
					if (j.getSpeed() > jet.getSpeed()) {
						jet = j;
					}
				}
				System.out.println(jet.toString());
				continue;
			// before I added the UserJet method, this was printing any Jet
			// I had to create another class of Jet as a baseline
			// I couldn't use the abstract Jet class because of its abstraction

			case 4:
				System.out.println("View The Jet with the longest Range: ");
				Jet rangeJet = new UserJet();
				for (Jet j : af.fleet) {
					if (j.getRange() > rangeJet.getRange()) {
						rangeJet = j;
					}
				}
				System.out.println(rangeJet.toString());
				continue;

			case 5:
				System.out.println("Loading all cargo Jets");
				for (Jet j : af.fleet) {
					if (j instanceof CargoJet) {
						((CargoJet) j).loadCargo();

					}
				}
				continue;
			case 6:
				System.out.println("Scramble the jets!");
				for (Jet j : af.fleet) {
					if (j instanceof FighterJet) {
						((FighterJet) j).fight();
					}
				}
				continue;
			case 7:
				System.out.println("Adding a Jet to the Fleet");
				Scanner userInput = new Scanner(System.in);
				String name;
				double speed;
				double range;
				long price;
				System.out.println("What would you like the name of your jet to be?");
				name = userInput.nextLine();
				System.out.println("How fast would you like your jet to go?");
				speed = userInput.nextDouble();
				System.out.println("What is the maximum distance you would like your jet to go?");
				range = userInput.nextDouble();
				System.out.println("How expensive would you like this jet to be?");
				price = userInput.nextLong();

				Jet userJet = new UserJet(name, speed, range, price);
				af.fleet.add(userJet);
				System.out.println("This is the jet you have created: " + userJet);
				System.out.println();
				System.out.println("This jet has been addd to the current fleet");
				System.out.println();
				// userJet also allowed for a blank template to create another jet to be added
				// to the fleet.

				continue;

			case 8:
				System.out.println("Choose which Jet you would like to remove");
				int i = 1;
				for (Jet j : af.fleet) {
					System.out.println("Please choose the number that corresponds to the jet you'd like to remove" + ":"
							+ j.toString());
					i++;
				}

				int remove = sc.nextInt();
				af.fleet.remove(remove - 1);
				System.out.println("This jet has been removed");
				continue;

			case 9:
				System.out.println("Thank you for participating");
				break;

			default:
				System.out.println("Invalid entry please try again");

			}
			sc.close();
		}
	}

	public void makeMenu() {
		System.out.println();
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.println("|                                              |");
		System.out.println("|   1. List Fleet                              |");
		System.out.println("|                                              |");
		System.out.println("|   2. Fly all Jets                            |");
		System.out.println("|                                              |");
		System.out.println("|   3. View Fastest Jet                        |");
		System.out.println("|                                              |");
		System.out.println("|   4. View Jet with the Longest Range         |");
		System.out.println("|                                              |");
		System.out.println("|   5. Load all Cargo Jets                     |");
		System.out.println("|                                              |");
		System.out.println("|   6. Fighter Jets... FIGHT                   |");
		System.out.println("|                                              |");
		System.out.println("|   7. Add a Jet to the fleet                  |");
		System.out.println("|                                              |");
		System.out.println("|   8. Remove a Jet from the fleet             |");
		System.out.println("|                                              |");
		System.out.println("|   9. Quit the program                        |");
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
	}

}
