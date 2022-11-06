package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
	public ArrayList<Jet> fleet = new ArrayList<>();

	public void createJets(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jets = line.split(",");
				String name = jets[0];
				// add if statements
				double speed = Double.parseDouble(jets[1]);
				double range = Double.parseDouble(jets[2]);
				long price = Long.parseLong(jets[3]);

				int counter = 0;
				switch (counter) {
				// zero must be used as a case here because of how the data is viewed in the text file
				// if case started at 1 nothing would print out
				// it so happens that the names of the jets are in the 0th position
				case 0:
					SupportJet AC130 = new SupportJet(name, speed, range, price);
					fleet.add(AC130);
					counter++;
					continue;
				case 1:
					AttackJet F22 = new AttackJet(name, speed, range, price);
					fleet.add(F22);
					counter++;
					continue;
				case 2:
					ReconJet SR71 = new ReconJet(name, speed, range, price);
					fleet.add(SR71);
					counter++;
					continue;
				case 3:
					CargoJet C133 = new CargoJet(name, speed, range, price);
					fleet.add(C133);
					counter++;
					continue;
				case 4:
					PassengerJet Boeing747 = new PassengerJet(name, speed, range, price);
					fleet.add(Boeing747);
					counter++;

				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}

		// create a constructor based on the different types of jet
		// i.e. support jet = first jet in the list
		// add a counter so the program knows to add it into the array list
		// this will work the same way with the add and remove a jet from the program.
		// see food truck

	}
}
