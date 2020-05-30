package app_dev_tool;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//

public class FlightSystem {
	static Scanner scan = new Scanner(System.in);
	static List<OutFlight> allOutFlights = new ArrayList<OutFlight>();
	static List<InFlight> allInFlights = new ArrayList<InFlight>();

	public static void createHardCoded() {
		OutFlight outFlight1 = new OutFlight("London", "el al", 2020, 5, 20, 10, 10, "LY315", 3);
		OutFlight outFlight2 = new OutFlight("New York", "el al", 2020, 5, 20, 00, 45, "LY3001", 3);

		InFlight inFlight1 = new InFlight("Brezil", "el al", 2020, 7, 15, 10, 15, "LY415", 1);
		InFlight inFlight2 = new InFlight("China", "el al", 2020, 4, 12, 12, 00, "LY317", 3);

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

	public static boolean isAlpha(String str) {
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

	public static void CreateNewOutFlight() {
		String landingCity = "", company = "", flightNumber = "";
		int year, hour, month, day, minutes, terminalNum;
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
		OutFlight outFlight = new OutFlight(landingCity, company, year, month, day, hour, minutes, flightNumber,
				terminalNum);
		allOutFlights.add(outFlight);
	}

	public static void CreateNewInFlight() {
		String takeOffCity = "", company = "", flightNumber = "";
		int year, hour, month, day, minutes, terminalNum;
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
		InFlight outFlight = new InFlight(takeOffCity, company, year, month, day, hour, minutes, flightNumber,
				terminalNum);
		allInFlights.add(outFlight);

	}

	public static String ShowAllInFlight() {
		String s = "The in flights are:\n";
		for (int i = 0; i < allInFlights.size(); i++) {
			s += allInFlights.get(i).toString();
			s += "\n";

		}
		return s;
	}

	public static String ShowAllOutFlight() {
		String s = "The out flights are:\n";
		for (int i = 0; i < allOutFlights.size(); i++) {
			s += allOutFlights.get(i).toString();
			s += "\n";

		}
		return s;

	}

// sort in flights 
	public static void sortInFlightsByDateAndTime() {
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
	public static void sortOutFlightByDateAndTime() {
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
}
