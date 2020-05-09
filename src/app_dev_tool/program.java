package app_dev_tool;

import java.util.Scanner;

public class program {
	static Flight[] flight = new Flight[20];
	public static int fligthcounter = 0;

	// Tester test = new Tester();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choise;

		do {
			System.out.println("Choose your selection");
			System.out.println("1-show fligth");
			System.out.println("2-add fligth");
			System.out.println("3-cancel fligth");
			System.out.println("4-change destanation");
			System.out.println("5-coupon code");
			choise = scan.nextInt();
			switch (choise) {
			case 1:
				SortFlightsByDate();
				showFligth();
				break;
			case 2:
				creatFligth();
				// Tester.createHardCoded();
				// fligthcounter = 4;
				break;
			case 3:
				cancleFlight();
				break;
			case 4:
				changeDestanation();
			case 5:
				couponCode();
			}
		} while (choise != 0);
	}

	private static void couponCode() {
		Scanner scan = new Scanner(System.in);
		int counter=0;
		int[] couponsCode = { 123, 124, 105 };
		int answer, temp = -1;
		// boolean code;
		System.out.println("Do you have a coupon code?\n Yes-1\nNo-2 ");
		answer = scan.nextInt();
		if (answer == 2) {
			System.out.println("you dont have a coupon, but tnx for your visit");
		} else if (answer == 1) {
			System.out.println("what the flight id?");
			answer = scan.nextInt();
			for (int i = 0; i < fligthcounter; i++) {
				if (flight[i].getFlightId() == answer) {
					System.out.println("what the coupon number?");
					answer = scan.nextInt();
					for (int j = 0; j < couponsCode.length; j++) {
						if (couponsCode[j] == answer) {
							flight[i].makeADiscount();
							System.out.println(
									"you get the discount, now your payment bill stant on " + flight[i].getPrice());
						}else {
							counter++;
						}
					}if(counter==3) {
						System.out.println("we sorry, the coupon code dont exists");
					}

				}else
			{
				System.out.println("the flight dont exists");
			}
			}

		}

	}

	private static void changeDestanation() {
		Scanner scan = new Scanner(System.in);
		int id;
		System.out.println("enter the id of the flight");
		id = scan.nextInt();
		for (int i = 0; i < fligthcounter; i++) {
			if (flight[i].getFlightId() == id) {
				flight[i].toString();
				System.out.println("enter the new destanation");
				flight[i].setDestination(scan.next());

			}

		}
	}

	private static void cancleFlight() {
		int idToCancle = checkIfIdIsExist();
		if (idToCancle == -1) {
			System.out.println("sorry the fligth not exits");

		} else {
			int j = 0;
			Flight[] FlightsAfterCanceling = new Flight[20];
			for (int i = 0; i < fligthcounter; i++) {
				if (idToCancle == flight[i].getFlightId()) {
					i++;
				}
				FlightsAfterCanceling[j] = flight[i];
				j++;
			}
			flight = FlightsAfterCanceling;
			fligthcounter--;
			System.out.println("This flight is canceled");
		}
	}

	public static int checkIfIdIsExist() { // to cancle you have to enter an existing id
		int saveId;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the id of the flight");
		saveId = s.nextInt();
		for (int i = 0; i < fligthcounter; i++) {

			if (flight[i].getFlightId() == saveId) {
				return saveId;
			}
		}
		return -1;
	}

	private static void SortFlightsByDate() {
		Flight[] arranageFlights = new Flight[20];
		int checkIndex = 0;
		Flight temp = new Flight();
		boolean hasChanged = true;
		for (int i = fligthcounter; i > 0 && hasChanged; i--) {
			hasChanged = false;
			for (int j = 0; j < i - 1; j++) {
				if (firstIsMax(flight[j], flight[j + 1])) {
					swap(flight, j, j + 1);
					hasChanged = true;
				}
			}
		}
	}

	private static void swap(Flight[] flights, int i, int j) {
		Flight temp = flights[i];
		flights[i] = flights[j];
		flights[j] = temp;
	}

	private static boolean firstIsMax(Flight flight1, Flight flight2) { // if exceatly equal returns flight1
		// flight 2 = false,flight1=true , sort from max to min
		if (flight1.getYear() > flight2.getYear()) {
			return false;
		} else if (flight1.getYear() < flight2.getYear()) {
			return true;
		} else {
			if (flight1.getMonth() > flight2.getMonth()) {
				return false;
			} else if (flight1.getMonth() < flight2.getMonth()) {
				return true;
			} else {
				if (flight1.getDay() > flight2.getDay()) {
					return false;
				} else if (flight1.getDay() < flight2.getDay()) {
					return true;
				} else {
					if (flight1.getHour() > flight2.getHour()) {
						return false;
					} else if (flight1.getHour() < flight2.getHour()) {
						return true;
					} else {
						if (flight1.getMin() > flight2.getMin()) {
							return false;
						} else if (flight1.getMin() < flight2.getMin()) {
							return true;
						} else
							return true;
					}
				}
			}
		}
	}

	private static void showFligth() {
		String s = "";
		for (int i = 0; i < fligthcounter; i++) {
			s = s + "\n" + flight[i].toString();
		}
		System.out.println(s);
	}

	private static void creatFligth() {

		String des;
		String destination;
		int x;
		int id;
		int hour;
		int min;
		int day;
		int month;
		int year;
		double price = 0;
		Scanner s = new Scanner(System.in);
		do {

			System.out.println("enter details \n  the id number of the fligth");
			x = s.nextInt();
			id = x;
		} while (!Validation.setId(x));

		do {

			System.out.println("enter details \n  the hour of the fligth");
			x = s.nextInt();
			hour = x;
		} while (!Validation.setHour(x));

		do {
			System.out.println("enter the minitues");
			x = s.nextInt();
			min = x;
		} while (!Validation.setMin(x));

		do {
			System.out.println("enter the day in the month");
			x = s.nextInt();
			day = x;
		} while (!Validation.setDay(x));

		do {
			System.out.println("enter the number of the month");
			x = s.nextInt();
			month = x;
		} while (!Validation.setMonth(x));

		do {
			System.out.println("enter the year of the flight");
			x = s.nextInt();
			year = x;
		} while (!Validation.setYear(x));

		do {
			System.out.println("fiil the destination");
			des = s.next();
			destination = des;

		} while (!Validation.setDestination(des));
		do {
			System.out.println("fiil the price of the flight");
			price = s.nextDouble();

		} while (!Validation.checkPrice(price));

		flight[fligthcounter++] = new Flight(id, hour, min, day, month, year, destination, price);
	}

}