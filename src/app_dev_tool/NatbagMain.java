package app_dev_tool;

public class NatbagMain {

	public static void main(String[] args) {
		boolean isHtml = args.length > 0 && args[0].equalsIgnoreCase("html");
		boolean isDepartures = args.length > 1 && args[1].equalsIgnoreCase("departures");
		FlightSystem.createHardCoded();
		if (isDepartures) {
			FlightSystem.searchOutFlightByCountry(args[3]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchOutFlightByCity(args[4]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchOutFlightByFlightNumber(args[5]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchOutFlightByCompany(args[6]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.helpMethod(args[7], 3, false);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.helpMethod(args[8], 2, false);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.helpMethod(args[9], 1, false);
			if (isHtml)
				System.out.println("<br>");

		} else {
			FlightSystem.searchInFlightByCountry(args[3]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchInFlightByCity(args[4]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchInFlightByFlightNumber(args[5]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchInFlightByCompany(args[6]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.helpMethod(args[7], 3, true);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.helpMethod(args[8], 3, true);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.helpMethod(args[9], 3, true);
			if (isHtml)
				System.out.println("<br>");
		}

	}

}
