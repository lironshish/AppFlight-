package app_dev_tool;

public class Tester {
	//public static Flight[] flight = new Flight[20];
	

	public static void createHardCoded() {
		// int flightId,int hour,int min,int day,int month,int year,String destination
		program.flight[0] = new Flight(1, 10, 7, 1, 1, 2009, "brazil", 100);
		program.flight[1] = new Flight(2, 10, 7, 1, 1, 2004, "japan", 500);
		program.flight[2] = new Flight(3, 10, 7, 1, 1, 2003, "israel", 200);
		program.flight[3] = new Flight(4, 10, 7, 1, 1, 2008, "jordan", 300);
	}

}
