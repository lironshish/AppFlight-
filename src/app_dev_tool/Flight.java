package app_dev_tool;

import java.io.PrintWriter;
import java.util.Scanner;

public class Flight {
	//
	protected String city;
	protected String company;
	protected String flightNum;

	protected int year;
	protected int month;
	protected int day;
	protected int hourFly;
	protected int minutesFly;
	protected int terminalNum;

	public Flight(String city, String company, int year, int month, int day, int hourFly, int minutesFly,
			String flightNum, int terminalNum) { // Full constructor
		this.city = city;
		this.company = company;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hourFly = hourFly;
		this.minutesFly = minutesFly;
		this.flightNum = flightNum;
		this.terminalNum = terminalNum;

	}

//Check proper
	public static boolean setCity(String city) {
		for (int i = 0; i < city.length(); i++) {
			if (Character.isDigit(city.charAt(i)) == true) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

	public static boolean setDay(int day) {
		if (day < 1 || day > 31) {
			return false;
		}
		return true;
	}

	public static boolean setMonth(int month) {
		if (month < 1 || month > 12) {
			return false;
		}
		return true;
	}

	public static boolean setYear(int year) {
		if (year < 1 || year > 2020) {
			return false;
		}
		return true;
	}

	public static boolean setHourFly(int hourFly) {
		if (hourFly < 0 || hourFly > 24) {
			return false;
		}
		return true;
	}

	public static boolean setMinutesFly(int minutesFly) {
		if (minutesFly < 0 || minutesFly > 60) {
			return false;
		}
		return true;
	}

	public static boolean setTerminalNum(int terminalNum) {
		if (terminalNum < 0) {
			return false;
		}
		return true;
	}
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getHourFly() {
		return hourFly;
	}

	public int getMinutesFly() {
		return minutesFly;
	}

	public int getTerminalNum() {
		return terminalNum;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public String getDes() {
		return city;
	}

	// Save flight information to file
	public void save(PrintWriter writer) {
		writer.println(city);
		writer.println(company);
		writer.println(year);
		writer.println(month);
		writer.println(day);
		writer.println(hourFly);
		writer.println(minutesFly);
		writer.println(flightNum);
		writer.println(terminalNum);
	}

	// Loading flight information from a file
	public Flight(Scanner scan) {
		city = scan.next();
		company = scan.next();
		year = scan.nextInt();
		month = scan.nextInt();
		day = scan.nextInt();
		minutesFly = scan.nextInt();
		hourFly = scan.nextInt();
		flightNum = scan.next();
		terminalNum = scan.nextInt();

	}

	@Override
	public String toString() {
		return "Company: " + company + ". Destination: " + city + ". Date: " + day + "/" + month + "/" + year
				+ ". Departure time: " + hourFly + ":" + minutesFly + ". Flight Number: " + flightNum + ". Terminal "
				+ terminalNum;
	}

}
