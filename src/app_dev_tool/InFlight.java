package app_dev_tool;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class InFlight extends Flight {

	public InFlight(String city, String company, int year, int month, int day, int hourFly, int minutesFly,
			String flightNum, int terminalNum) {
		super(city, company, year, month, day, hourFly, minutesFly, flightNum, terminalNum);

	}
	
	public InFlight(String path,Scanner s) {
		super(path, s);

	}
	
	//

	@Override
	public String toString() {
		return super.toString();
	}

}
