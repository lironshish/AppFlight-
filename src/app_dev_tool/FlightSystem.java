package app_dev_tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FlightSystem {

	static Scanner scan = new Scanner(System.in);
	static List<OutFlight> allOutFlights = new ArrayList<OutFlight>();
	static List<InFlight> allInFlights = new ArrayList<InFlight>();

	public static void createHardCoded() {
		// Creating flights
		OutFlight outFlight1 = new OutFlight("London", "el al", 2020, 5, 20, 10, 10, "LY315", 3, "England", 22);
		OutFlight outFlight2 = new OutFlight("New York", "el al", 2020, 5, 20, 00, 45, "LY3001", 3, "USA", 15);
		InFlight inFlight1 = new InFlight("rio de jeneiro", "el al", 2020, 7, 15, 10, 15, "LY415", 1, "Brazil", 9);
		InFlight inFlight2 = new InFlight("shengai", "el al", 2020, 4, 12, 12, 00, "LY317", 3, "China", 11);

		allOutFlights.add(outFlight1);
		allOutFlights.add(outFlight2);

		allInFlights.add(inFlight1);
		allInFlights.add(inFlight2);

	}

	public static int ReadInt() { // method for reading int that throws an exception
		int number = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			try {
				System.out.println("please enter the number");
				number = scan.nextInt();
				isValidInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Your answer is not from the correct variable");
				scan.nextLine(); // cleans buffer
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scan.nextLine(); // cleans buffer
			}
		}
		return number;
	}

	public static boolean isAlpha(String str) { // Help method
		boolean isalpha = true;
		char[] cha = str.toCharArray();
		for (char i : cha) {
			if (!Character.isLetter(i)) {
				isalpha = false;
			}
		}
		return isalpha;

	}

	public static String ReadString() {// method for reading String that throws an exception
		boolean isalpha = false;
		String str = "";
		while (!isalpha) {
			try {
				System.out.println("please enter the name");
				str = scan.next();
			} catch (InputMismatchException e) {
				System.out.println("Your answer is not from the correct variable");
				scan.nextLine(); // cleans buffer
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scan.nextLine(); // cleans buffer
			}
			isalpha = isAlpha(str);
		}
		return str;
	}

	public static void CreateNewOutFlight() { // Create a new out flight
		String landingCity = "", company = "", flightNumber = "", country = "";
		int year, hour, month, day, minutes, terminalNum, vacationLength;
		do {
			System.out.println("Hello,Plesae enter Landing City");
			landingCity = ReadString();
		} while (!Flight.setCity(landingCity));
		System.out.println("please enter the company");
		company = ReadString();
		do {
			System.out.println("please enter the year");
			year = ReadInt();
		} while (!Flight.setYear(year));
		do {
			System.out.println("please enter the month");
			month = ReadInt();
		} while (!Flight.setMonth(month));
		do {
			System.out.println("please enter the day");
			day = ReadInt();
		} while (!Flight.setDay(day));
		do {
			System.out.println("please enter the hour");
			hour = ReadInt();
		} while (!Flight.setHourFly(hour));
		do {
			System.out.println("please enter the minutes");
			minutes = ReadInt();
		} while (!Flight.setMinutesFly(minutes));
		System.out.println("please enter the flight number");
		flightNumber = scan.next();
		System.out.println("please enter the terminal number");
		terminalNum = ReadInt();
		System.out.println("enter the country name");
		country = ReadString();
		System.out.println("please enter how many days the vacation will be");
		vacationLength = ReadInt();
		OutFlight outFlight = new OutFlight(landingCity, company, year, month, day, hour, minutes, flightNumber,
				terminalNum, country, vacationLength);
		allOutFlights.add(outFlight);
	}

	public static void CreateNewInFlight() { // Create a new in flight
		String takeOffCity = "", company = "", flightNumber = "", country = "";
		int year, hour, month, day, minutes, terminalNum, vacationLength;
		do {
			System.out.println("Please enter the city that will take off");
			takeOffCity = ReadString();
		} while (!Flight.setCity(takeOffCity));
		System.out.println("please enter the company");
		company = ReadString();
		do {
			System.out.println("please enter the year");
			year = ReadInt();
		} while (!Flight.setYear(year));
		do {
			System.out.println("please enter the month");
			month = ReadInt();
		} while (!Flight.setMonth(month));
		do {
			System.out.println("please enter the day");
			day = ReadInt();
		} while (!Flight.setDay(day));
		do {
			System.out.println("please enter the hour");
			hour = ReadInt();
		} while (!Flight.setHourFly(hour));
		do {
			System.out.println("please enter the minutes");
			minutes = ReadInt();
		} while (!Flight.setMinutesFly(minutes));
		System.out.println("please enter the flight number");
		flightNumber = scan.next();
		System.out.println("please enter the terminal number");
		terminalNum = ReadInt();
		System.out.println("please enter the country");
		country = ReadString();
		System.out.println("enter the vacation length");
		vacationLength = ReadInt();
		InFlight outFlight = new InFlight(takeOffCity, company, year, month, day, hour, minutes, flightNumber,
				terminalNum, country, vacationLength);
		allInFlights.add(outFlight);

	}

	public static String ShowAllInFlight() { // Show in flights
		String s = "The in flights are:\n";
		for (int i = 0; i < allInFlights.size(); i++) {
			s += allInFlights.get(i).toString();
			s += "\n";

		}
		return s;
	}

	public static String ShowAllOutFlight() { // Show out flights
		String s = "The out flights are:\n";
		for (int i = 0; i < allOutFlights.size(); i++) {
			s += allOutFlights.get(i).toString();
			s += "\n";

		}
		return s;

	}

// sort in flights 
	public static void sortInFlightsByDateAndTime(List<InFlight> allInFlights) {
		for (int i = allInFlights.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (allInFlights.get(j).getYear() > allInFlights.get(j + 1).getYear()) {
					if (allInFlights.get(j).getMonth() > allInFlights.get(j + 1).getMonth()) {
						if (allInFlights.get(j).getDay() > allInFlights.get(j + 1).getDay()) {
							if (allInFlights.get(j).getHourFly() > allInFlights.get(j + 1).getHourFly()) {
								if (allInFlights.get(j).getMinutesFly() > allInFlights.get(j + 1).getMinutesFly()) {
									swapInFlights(allInFlights, j, j + 1);
								}
								swapInFlights(allInFlights, j, j + 1);
							}
							swapInFlights(allInFlights, j, j + 1);
						}
						swapInFlights(allInFlights, j, j + 1);
					}
					swapInFlights(allInFlights, j, j + 1);
				}
				swapInFlights(allInFlights, j, j + 1);
			}
		}
	}

	public static void swapInFlights(List<InFlight> listOfFlights, int i, int j) {
		InFlight temp = listOfFlights.get(i);
		listOfFlights.set(i, listOfFlights.get(j));
		listOfFlights.set(j, temp);
	}

//sort out flights 
	public static void sortOutFlightByDateAndTime(List<OutFlight> allOutFlights) {
		for (int i = allOutFlights.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (allOutFlights.get(j).getYear() > allOutFlights.get(j + 1).getYear()) {
					if (allOutFlights.get(j).getMonth() > allOutFlights.get(j + 1).getMonth()) {
						if (allOutFlights.get(j).getDay() > allOutFlights.get(j + 1).getDay()) {
							if (allOutFlights.get(j).getHourFly() > allOutFlights.get(j + 1).getHourFly()) {
								if (allOutFlights.get(j).getMinutesFly() > allOutFlights.get(j + 1).getMinutesFly()) {
									swapOutFlights(allOutFlights, j, j + 1);
								}
								swapOutFlights(allOutFlights, j, j + 1);
							}
							swapOutFlights(allOutFlights, j, j + 1);
						}
						swapOutFlights(allOutFlights, j, j + 1);
					}
					swapOutFlights(allOutFlights, j, j + 1);
				}
				swapOutFlights(allOutFlights, j, j + 1);

			}
		}
	}

	public static void swapOutFlights(List<OutFlight> listOfFlights, int i, int j) {
		OutFlight temp = listOfFlights.get(i);
		listOfFlights.set(i, listOfFlights.get(j));
		listOfFlights.set(j, temp);
	}

// Searchers flight by parameters	

	public static String searchFlightByDate(int choose, int temp) { // by date
		String allFlightsInDate = " ";
		if (choose == 1) {
			for (int i = 0; i < allInFlights.size(); i++) {
				if (allInFlights.get(i).getYear() == temp) {
					allFlightsInDate += allInFlights.get(i) + "\n";
				}
			}
			for (int j = 0; j < allOutFlights.size(); j++) {
				if (allOutFlights.get(j).getYear() == temp) {
					allFlightsInDate += allOutFlights.get(j) + "\n";
				}
			}
			return allFlightsInDate;
		} else if (choose == 2) {
			for (int i = 0; i < allInFlights.size(); i++) {
				if (allInFlights.get(i).getMonth() == temp) {
					allFlightsInDate += allInFlights.get(i) + "\n";
				}
			}
			for (int j = 0; j < allOutFlights.size(); j++) {
				if (allOutFlights.get(j).getMonth() == temp) {
					allFlightsInDate += allOutFlights.get(j) + "\n";
				}
			}

			return allFlightsInDate;
		}

		else if (choose == 3) {
			for (

					int i = 0; i < allInFlights.size(); i++) {
				if (allInFlights.get(i).getDay() == temp) {
					allFlightsInDate += allInFlights.get(i) + "\n";
				}
			}
			for (int j = 0; j < allOutFlights.size(); j++) {
				if (allOutFlights.get(j).getDay() == temp) {
					allFlightsInDate += allOutFlights.get(j) + "\n";
				}
			}

			return allFlightsInDate;
		} else
			return allFlightsInDate;
	}

	public static String searchInFlightByCompany(String comp) { // In flight by company
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allInFlights.size(); i++) {
			if (allInFlights.get(i).getCompany().equalsIgnoreCase(comp)) {
				System.out.println(allInFlights.get(i));
				count++;
				searchEnd += allInFlights.get(i) + "\n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;
	}

	public static String searchOutFlightByCompany(String comp) { // Out flight by company
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allOutFlights.size(); i++) {
			if (allOutFlights.get(i).getCompany().equalsIgnoreCase(comp)) {
				System.out.println(allOutFlights.get(i));
				count++;
				searchEnd += allOutFlights.get(i) + "\n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;
	}

	public static String searchOutFlightByCity(String city) { // Out flight by city
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allOutFlights.size(); i++) {
			if (allOutFlights.get(i).getCity().equalsIgnoreCase(city)) {
				System.out.println(allOutFlights.get(i));
				count++;
				searchEnd += allOutFlights.get(i) + "\n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;

	}

	public static String searchInFlightByCity(String city) { // In flight by city
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allInFlights.size(); i++) {
			if (allInFlights.get(i).getCity().equalsIgnoreCase(city)) {
				System.out.println(allInFlights.get(i));
				count++;
				searchEnd += allInFlights.get(i) + "\n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;

	}

	public static String searchInFlightByCountry(String country) { // In flight by country
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allInFlights.size(); i++) {
			if (allInFlights.get(i).getCountry().equalsIgnoreCase(country)) {
				System.out.println(allInFlights.get(i));
				count++;
				searchEnd += allInFlights.get(i) + "/n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;
	}

	public static String searchOutFlightByCountry(String country) { // Out flight by country
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allOutFlights.size(); i++) {
			if (allOutFlights.get(i).getCountry().equalsIgnoreCase(country)) {
				System.out.println(allOutFlights.get(i));
				count++;
				searchEnd += allOutFlights.get(i) + "/n";
			}
		}

		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;

	}

	public static String searchInFlightByTerminalNumber(int terminalNumber) { // In flight by terminal number
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allInFlights.size(); i++) {
			if (allInFlights.get(i).getTerminalNum() == terminalNumber) {
				System.out.println(allInFlights.get(i));
				count++;
				searchEnd += allOutFlights.get(i) + "/n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;

	}

	public static String searchOutFlightByTerminalNumber(int terminalNumber) { // Out flight by terminal number
		int count = 0;
		String searchEnd = "";
		for (int i = 0; i < allOutFlights.size(); i++) {
			if (allOutFlights.get(i).getTerminalNum() == terminalNumber) {
				System.out.println(allOutFlights.get(i));
				count++;
				searchEnd += allOutFlights.get(i) + "/n";
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
		return searchEnd;

	}

	public static void searchByFlightNumber(String flightNumber) { // by flight number
		int count = 0;
		for (int i = 0; i < allInFlights.size(); i++) {
			if (allInFlights.get(i).getFlightNum().equalsIgnoreCase(flightNumber)) {
				System.out.println(allInFlights.get(i));
				count++;
			}
		}
		for (int i = 0; i < allOutFlights.size(); i++) {
			if (allOutFlights.get(i).getFlightNum().equalsIgnoreCase(flightNumber)) {
				System.out.println(allOutFlights.get(i));
				count++;
			}
		}
		if (count == 0) {
			System.out.println("the parameter that you wanted to search does not exist\n");
		}
	}

	// Loading in flight information from a file
	public static void readFromFileInFlight(String path, Scanner s) throws FileNotFoundException {
		int numOfFligth;
		numOfFligth = s.nextInt();
		s.nextLine();
		for (int i = 0; i < numOfFligth; i++) {
			InFlight temp = new InFlight(path, s);
			allInFlights.add(temp);
			s.nextLine();
		}
	}

	// Loading out flight information from a file
	public static void readFromFileOutFlight(String path, Scanner s) throws FileNotFoundException {
		int numOfFligth;
		numOfFligth = s.nextInt();
		s.nextLine();
		for (int i = 0; i < numOfFligth; i++) {

			OutFlight temp = new OutFlight(path, s);
			allOutFlights.add(temp);
			s.nextLine();
		}

	}

	// Save flight information to file
	public static void save(String path1) throws FileNotFoundException {
		File f = new File(path1);
		PrintWriter pw = new PrintWriter(f);
		pw.println("InFlight");
		pw.println(allInFlights.size());
		for (int i = 0; i < allInFlights.size(); i++) {
			allInFlights.get(i).save(pw);
		}
		pw.println("OutFlights");
		pw.println(allOutFlights.size());
		for (int i = 0; i < allOutFlights.size(); i++) {
			allOutFlights.get(i).save(pw);

		}
		pw.close();
	}
}
