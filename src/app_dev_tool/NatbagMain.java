package app_dev_tool;

public class NatbagMain {

	public static void main(String[] args) {
		boolean isHtml = args.length > 0 && args[0].equalsIgnoreCase("html");
		FlightSystem.createHardCoded();
		FlightSystem.searchByDes(args[4]);
		System.out.println(args[4]);
		
		
	}

}
