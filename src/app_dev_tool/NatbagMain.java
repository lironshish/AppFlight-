package app_dev_tool;

public class NatbagMain {

	public static void main(String[] args) {
		boolean isHtml = args.length > 0 && args[0].equalsIgnoreCase("html");
		boolean isDepartures = args.length > 1 && args[1].equalsIgnoreCase("departures");
		int terminalNumTemp, yearTemp, monthTemp, dayTemp;
		FlightSystem.createHardCoded();
		if (isDepartures) {
			FlightSystem.searchByCountry(args[3]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchByCity(args[4]);
			if (isHtml)
				System.out.println("<br>");
			terminalNumTemp = Integer.parseInt(args[5]);
			FlightSystem.serachFlightByTerminalNumber(terminalNumTemp);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchByCompany(args[6]);
			if (isHtml)
				System.out.println("<br>");
			dayTemp = Integer.parseInt(args[7]);
			FlightSystem.searchFlightByDate(3, dayTemp);
			if (isHtml)
				System.out.println("<br>");
			monthTemp = Integer.parseInt(args[8]);
			FlightSystem.searchFlightByDate(2, monthTemp);
			if (isHtml)
				System.out.println("<br>");
			yearTemp = Integer.parseInt(args[9]);
			FlightSystem.searchFlightByDate(1, yearTemp);
			if (isHtml)
				System.out.println("<br>");

		} else { 
			FlightSystem.searchByCountry(args[3]);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchByCity(args[4]);
			if (isHtml)
				System.out.println("<br>");
			terminalNumTemp = Integer.parseInt(args[5]);
			FlightSystem.serachFlightByTerminalNumber(terminalNumTemp);
			if (isHtml)
				System.out.println("<br>");
			FlightSystem.searchByCompany(args[6]);
			if (isHtml)
				System.out.println("<br>");
			dayTemp = Integer.parseInt(args[7]);
			FlightSystem.searchFlightByDate(3, dayTemp);
			if (isHtml)
				System.out.println("<br>");
			monthTemp = Integer.parseInt(args[8]);
			FlightSystem.searchFlightByDate(2, monthTemp);
			if (isHtml)
				System.out.println("<br>");
			yearTemp = Integer.parseInt(args[9]);
			FlightSystem.searchFlightByDate(1, yearTemp);
			if (isHtml)
				System.out.println("<br>");
		}

	}

}


//http://localhost:8000/departures?outformat=html&country=france&city=paris&airport=CDG&airline=elal&day1=4&month1=6&year1=2020&day2=31&month2=7&year2=2020&sunday=true&monday