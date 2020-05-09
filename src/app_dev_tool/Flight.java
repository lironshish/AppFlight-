package app_dev_tool;

import java.io.PrintWriter;
import java.util.Scanner;

public class Flight {
	private int flightId;
	private int hour;
	private int min;
	private int day;
	private int month;
	private int year;
	private String destination;
	private double price;
	
	

	public Flight(int flightId, int hour, int min, int day, int month, int year, String destination, double price) {
		this.flightId = flightId;
		this.hour = hour;
		this.min = (min);
		this.day = (day);
		this.month = (month);
		this.year = (year);
		this.destination = destination;
		this.price = price;
	}

	public Flight() {
		this(0, 0, 0, 0, 0, 0, "", 0);
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void save(PrintWriter writer) {
		writer.println(flightId);
		writer.println(hour);
		writer.println(min);
		writer.println(day);
		writer.println(month);
		writer.println(year);
		writer.println(destination);
		writer.println(price);
	}

	public Flight(Scanner scan) {
		flightId = scan.nextInt();
		hour = scan.nextInt();
		min = scan.nextInt();
		day = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		destination = scan.next();
		price = scan.nextDouble();

	}

	@Override
	public String toString() {
		return "Fligth to  " + destination + " ,the id number of the filght is " + flightId + "  " + day + "\\" + month
				+ "\\" + year + " at hour " + hour + ":" + min + ", the price of thr flight is: " + price;
	}
	
	public void makeADiscount() {
		this.price = price*0.9;
	}
	public int getFlightId() {
		return flightId;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}


}
