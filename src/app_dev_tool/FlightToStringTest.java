package app_dev_tool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class FlightToStringTest {
//Test 1 
	@Test
	public void toStringTest() {
		OutFlight Flight1 = new OutFlight("London", "el al", 2020, 5, 20, 10, 10, "LY315", 3, "England", 22);

		StringBuffer expectedResult = new StringBuffer();

		expectedResult.append("Company: ");
		expectedResult.append("el al");
		expectedResult.append(". Destination: ");
		expectedResult.append("London");
		expectedResult.append(". Date: ");
		expectedResult.append(20);
		expectedResult.append("/");
		expectedResult.append(5);
		expectedResult.append("/");
		expectedResult.append(2020);
		expectedResult.append(". Departure time: ");
		expectedResult.append(10);
		expectedResult.append(":");
		expectedResult.append(10);
		expectedResult.append(". Flight Number: ");
		expectedResult.append("LY315");
		expectedResult.append("\n ");
		expectedResult.append(". Terminal ");
		expectedResult.append(3);
		expectedResult.append(" the vacation will take place in ");
		expectedResult.append("England");
		expectedResult.append(" and will be for ");
		expectedResult.append(22);
		expectedResult.append(" days , which make the ");
		expectedResult.append("returning date to be");
		expectedResult.append(11);
		expectedResult.append("/");
		expectedResult.append(6);
		expectedResult.append("/");
		expectedResult.append(2020);

		assertEquals(expectedResult.toString(), Flight1.toString());
	}

//Test 2
	@Test
	public void toStringArrayListInFlightTest() {
		ArrayList<InFlight> flightsForTest = new ArrayList<>();

		InFlight inFlight1 = new InFlight("rio de jeneiro", "el al", 2020, 7, 15, 10, 15, "LY415", 1, "Brazil", 9);
		InFlight inFlight2 = new InFlight("shengai", "el al", 2020, 4, 12, 12, 00, "LY317", 3, "China", 11);

		flightsForTest.add(inFlight1);
		flightsForTest.add(inFlight2);

		StringBuffer expectedResult = new StringBuffer();

		expectedResult.append("[");
		expectedResult.append(inFlight1);
		expectedResult.append(", ");
		expectedResult.append(inFlight2);
		expectedResult.append("]");
	}

// Test 3
	@Test
	public void toStringArrayListOutFlightTest() {
		ArrayList<OutFlight> flightsForTest = new ArrayList<>();

		OutFlight outFlight1 = new OutFlight("London", "el al", 2020, 5, 20, 10, 10, "LY315", 3, "England", 22);
		OutFlight outFlight2 = new OutFlight("New York", "el al", 2020, 5, 20, 00, 45, "LY3001", 3, "USA", 15);
		flightsForTest.add(outFlight1);
		flightsForTest.add(outFlight2);

		StringBuffer expectedResult = new StringBuffer();

		expectedResult.append("[");
		expectedResult.append(outFlight1);
		expectedResult.append(", ");
		expectedResult.append(outFlight1);
		expectedResult.append("]");
	}
}
