package app_dev_tool;

import java.io.PrintWriter;
import java.util.Scanner;
import java.time.LocalDate;

public class Flight {

	protected String city;
	protected String company;
	protected String flightNum;
	protected String Country;

	protected int year;
	protected int month;
	protected int day;
	protected int hourFly;
	protected int minutesFly;
	protected int terminalNum;
	protected int daysOfVacation;
	protected int yearReturn;
	protected int monthReturn;
	protected int dayReturn;

	public Flight(String city, String company, int year, int month, int day, int hourFly, int minutesFly,
			String flightNum, int terminalNum, String Country, int daysOfVacation) { // Full constructor
		this.city = city;
		this.company = company;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hourFly = hourFly;
		this.minutesFly = minutesFly;
		this.flightNum = flightNum;
		this.terminalNum = terminalNum;
		this.Country = Country;
		this.daysOfVacation = daysOfVacation;
		LocalDate d = LocalDate.of(year, month, day).plusDays(daysOfVacation);
		this.yearReturn = d.getYear();
		this.monthReturn = d.getMonthValue();
		this.dayReturn = d.getDayOfMonth();

	}

// Setters and Getters 
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

	public int getYearReturn() {
		return yearReturn;
	}

	public int getMonthReturn() {
		return monthReturn;
	}

	public int getDayReturn() {
		return dayReturn;
	}

	public String getCompany() {
		return company;
	}

	public String getCountry() {
		return Country;
	}

	public String getCity() {
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
		writer.println(Country);
		writer.println(daysOfVacation);
	}

	// Loading flight information from a file
	public Flight(String path, Scanner s) {

		city = s.nextLine();
		company = s.nextLine();
		year = s.nextInt();
		s.nextLine();
		month = s.nextInt();
		s.nextLine();
		day = s.nextInt();
		s.nextLine();
		minutesFly = s.nextInt();
		s.nextLine();
		hourFly = s.nextInt();
		s.nextLine();
		flightNum = s.next();
		s.nextLine();
		terminalNum = s.nextInt();
		s.nextLine();
		Country = s.next();
		s.nextLine();
		daysOfVacation = s.nextInt();
	}

	@Override
	public String toString() {
		return "Company: " + company + ". Destination: " + city + ". Date: " + day + "/" + month + "/" + year
				+ ". Departure time: " + hourFly + ":" + minutesFly + ". Flight Number: " + flightNum + "\n "
				+ ". Terminal " + terminalNum + " the vacation will take place in " + Country + " and will be for "
				+ daysOfVacation + " days , which make the " + "returning date to be " + dayReturn + "/" + monthReturn
				+ "/" + yearReturn;
	}

}
