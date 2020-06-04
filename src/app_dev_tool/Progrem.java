package app_dev_tool;

import java.util.Scanner;

public class Progrem {

	public static void main(String[] args) {
		int choise;
		FlightSystem useFlifhtSystem = new FlightSystem();
		Scanner scan = new Scanner(System.in);
		FlightSystem.createHardCoded();
		do {
			System.out.println(
					"Welcome to the menu!\nTo show all out flights - 1\nTo show all in flights - 2\nCreate a new in flight - 3\nCreate a new out flight - 4\nTo save flight information to file - 5\nTo Loading flight information from a file-6\n");

			choise = scan.nextInt();
			switch (choise) {
			case 1:
				FlightSystem.sortOutFlightByDateAndTime(useFlifhtSystem.allOutFlights);
				System.out.println(FlightSystem.ShowAllOutFlight());
				break;
			case 2:
				FlightSystem.sortInFlightsByDateAndTime(useFlifhtSystem.allInFlights);
				System.out.println(FlightSystem.ShowAllInFlight());
				break;
			case 3:
				FlightSystem.CreateNewInFlight();
				break;
			case 4:
				FlightSystem.CreateNewOutFlight();
				break;
			case 5:
				// Save flight information to file
				break;
			case 6:
				// Loading flight information from a file
				break;
			}
		} while (choise != 0);

	}

}
