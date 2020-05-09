package app_dev_tool;

public class Validation {
	public static boolean setId(int x) {
		if (x < 0) {
			return false;
		} else
			return true;
	}

	public static boolean setDestination(String des) {
		return true;
	}

	public static boolean setHour(int x) {
		if (x >= 0 && x <= 24) {
			return true;
		}
		return false;
	}

	public static boolean setMin(int min2) {
		if (min2 >= 0 && min2 <= 60) {
			return true;
		}
		return false;
	}

	// check days
	public static boolean setDay(int day) {
		if (day > 0 && day <= 31) {
			return true;
		}
		return false;
	}

	// check month
	public static boolean setMonth(int month) {
		if (month < 0 || month > 12) {
			return false;
		}
		return true;
	}

	// check year
	public static boolean setYear(int year) {
		if (year < 0 || year > 2019) {
			return false;
		}
		return true;
	}

	public static boolean checkPrice(double price) {
		if (price < 0) {
			return false;

		} else
			return true;

	}

}
