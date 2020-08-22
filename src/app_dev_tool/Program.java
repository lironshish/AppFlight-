package app_dev_tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		int choise;
		FlightSystem useFlifhtSystem = new FlightSystem();
		Scanner scan = new Scanner(System.in);
		FlightSystem.createHardCoded(); // Creating flights
		do {
			System.out.println(
					"Welcome to the menu!\nTo show all out flights - 1\nTo show all in flights - 2\nCreate a new in flight - 3\nCreate a new out flight - 4\nTo save flight information to file - 5\nTo Loading flight information from a file-6\nSearch flight -7\n");

			choise = scan.nextInt();
			switch (choise) {
			case 1: // Show all sorted out flights
				FlightSystem.sortOutFlightByDateAndTime(useFlifhtSystem.allOutFlights);
				System.out.println(FlightSystem.ShowAllOutFlight());
				break;
			case 2: // Show all sorted in flights
				FlightSystem.sortInFlightsByDateAndTime(useFlifhtSystem.allInFlights);
				System.out.println(FlightSystem.ShowAllInFlight());
				break;
			case 3: // Create a new in flight
				FlightSystem.CreateNewInFlight();
				break;
			case 4: // Create a new out flight
				FlightSystem.CreateNewOutFlight();
				break;
			case 5: // Save flight information to file
				String path1 = "C:\\flight.txt";
				FlightSystem.save(path1);
				break;
			case 6: // Loading flight information from a file
				String path = "C:\\flight.txt";
				File f = new File(path);
				Scanner s = new Scanner(f);
				String kind;
				int x = 2;
				do {
					kind = s.nextLine();
					if (kind.equals("InFlight")) {
						FlightSystem.readFromFileInFlight(path, s);
						x--;
					} else {
						FlightSystem.readFromFileOutFlight(path, s);
						x--;
					}
				} while (x != 0);
				break;
			case 7: // Search flight by parameters
				System.out.println(
						"choose the paramter which you like to search by\nterminal number - 1\nflight number - 2\ncity - 3\ndate -4\ncountry -5\ncompany -6");
				int serachChoose = scan.nextInt();
				switch (serachChoose) {
				case 1: // Terminal number
					System.out.println("please enter the terminal number that you like to search");
					int terminalNumber = scan.nextInt();
					FlightSystem.searchInFlightByTerminalNumber(terminalNumber);
					FlightSystem.searchOutFlightByTerminalNumber(terminalNumber);
					break;
				case 2: // Flight number
					System.out.println("please enter the flight number to search");
					String flightNumber = scan.next();
					FlightSystem.searchByFlightNumber(flightNumber);
					break;
				case 3: // City flight
					System.out.println("plesae enter city to search");
					String city = scan.next();
					FlightSystem.searchInFlightByCity(city);
					FlightSystem.searchOutFlightByCity(city);
					break;
				case 4: // Date flight
					int SearchChooseDate = 0;
					do {
						System.out.println(
								"choose the date paramter which you like to search by\nyear - 1\nmonth - 2\nday - 3");
						SearchChooseDate = scan.nextInt();
					} while (SearchChooseDate != 1 && SearchChooseDate != 2 && SearchChooseDate != 3);

					System.out.println("please enter the parameter");
					int temp = scan.nextInt();
					String searchResult = FlightSystem.searchFlightByDate(SearchChooseDate, temp);
					System.out.println(searchResult);
					break;
				case 5: // Country flight
					System.out.println("plesae enter country to search");
					String country = scan.next();
					FlightSystem.searchOutFlightByCountry(country);
					FlightSystem.searchInFlightByCountry(country);
					break;
				case 6: // Company flight
					System.out.println("please enter the company of flights to search");
					String company = scan.next();
					FlightSystem.searchInFlightByCompany(company);
					FlightSystem.searchOutFlightByCompany(company);
				}
			}
		} while (choise != 0);

	}

}
