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
			FlightSystem.searchOutFlightByTerminalNumber(Integer.parseInt(args[5]));
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchOutFlightByCompany(args[6]);
			if (isHtml)
				System.out.println("<br>");

			FlightSystem.searchFlightByDate(3, Integer.parseInt(args[7]));
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchFlightByDate(2, Integer.parseInt(args[8]));
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchFlightByDate(1, Integer.parseInt(args[9]));
			if (isHtml)
				System.out.println("<br>");

		} else {
			FlightSystem.searchInFlightByCountry(args[3]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchInFlightByCity(args[4]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchInFlightByTerminalNumber(Integer.parseInt(args[5]));
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchInFlightByCompany(args[6]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchFlightByDate(3, Integer.parseInt(args[7]));
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchFlightByDate(2, Integer.parseInt(args[8]));
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchFlightByDate(1, Integer.parseInt(args[9]));
			if (isHtml)
				System.out.println("<br>");
		}

	}

}
