package app_dev_tool;

import java.util.Scanner;

public class InFlight extends Flight {

	public InFlight(String city, String company, int year, int month, int day, int hourFly, int minutesFly,
			String flightNum, int terminalNum, String country, int daysOfVacation) {
		super(city, company, year, month, day, hourFly, minutesFly, flightNum, terminalNum, country, daysOfVacation);
		// Call to constructor of Flight
	}

	public InFlight(String path, Scanner s) {
		super(path, s);

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
