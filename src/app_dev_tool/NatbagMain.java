package app_dev_tool;

public class NatbagMain {

	public static void main(String[] args) {
		boolean isHtml = args.length > 0 && args[0].equalsIgnoreCase("html");
		System.out.println(
				"Company: el al. Destination: London. Date: 20/5/2020. Departure time: 10:10. Flight Number:LY315. Terminal 3");
		if (isHtml) {
			System.out.println("<br>");
		}
		System.out.println(
				"Company: el al. Destination: New York. Date: 20/5/2020. Departure time: 00:45. Flight Number:LY3001. Terminal 3");
		if (isHtml) {
			System.out.println("<br>");
		}
		System.out.println(
				"Company: el al. Destination: Brezil. Date: 15/7/2020. Departure time: 10:15. Flight Number:LY415. Terminal 1");
		if (isHtml) {
			System.out.println("<br>");
		}
		System.out.println(
				"Company: el al. Destination: China. Date: 12/4/2020. Departure time: 12:00. Flight Number:LY317. Terminal 3");
		if (isHtml) {
			System.out.println("<br>");
		}
	}

}
