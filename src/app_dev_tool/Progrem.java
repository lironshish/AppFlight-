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
					"Welcome to the menu!\nTo show all out flights - 1\nTo show all in flights - 2\nCreate a new in flight - 3\nCreate a new out flight - 4\nTo save flight information to file - 5\nTo Loading flight information from a file-6\nSearch flight -7\n");

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
			case 7:
				System.out.println(
						"choose the paramter which you like to search by\nterminal number - 1\nflight number - 2\ndestenation - 3\ndate range - 4");
				int serachChoose = scan.nextInt();
				switch (serachChoose) {
				case 1:
					System.out.println("please enter the terminal number that you like to search");
					int terminalNumber = scan.nextInt();
					FlightSystem.serachFlightByTerminalNumber(terminalNumber);
					break;
				case 2:
					System.out.println("please enter the flight number to search");
					String flightNumber = scan.next();
					FlightSystem.searchByFlightNumber(flightNumber);
					break;
				case 3:
					System.out.println("plesae enter destantion to search");
					String des = scan.next();
					FlightSystem.searchByDes(des);
					break;
				case 4:
					System.out.println("enter the date range , first enter the begin date , seperate with dots (.)");
					String begDate = scan.next();
					System.out.println("now enter the end date , also seperate with dots (.)");
					String endDate = scan.next();
					FlightSystem.searchFlightByDateRange(begDate, endDate);
				}
			}
		} while (choise != 0);

	}

}
