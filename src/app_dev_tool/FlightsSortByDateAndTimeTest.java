package app_dev_tool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class FlightsSortByDateAndTimeTest {
//Test 1
	@Test
	public void SortInFlightTest() {
		ArrayList<InFlight> inFlightsForTest = new ArrayList<>();

		InFlight inFlight1 = new InFlight("Brezil", "el al", 2020, 7, 15, 10, 15, "LY415", 1);
		InFlight inFlight2 = new InFlight("China", "el al", 2020, 4, 12, 12, 00, "LY317", 3);

		inFlightsForTest.add(inFlight1);
		inFlightsForTest.add(inFlight2);

		FlightSystem.sortInFlightsByDateAndTime(inFlightsForTest);

		StringBuffer expectedResult = new StringBuffer();
		expectedResult.append("[");
		expectedResult.append(inFlight2);
		expectedResult.append(", ");
		expectedResult.append(inFlight1);
		expectedResult.append("]");

		assertEquals(expectedResult.toString(), inFlightsForTest.toString());

	}

//Test 2	
	@Test
	public void SortOutFlightTest() {
		ArrayList<OutFlight> outFlightsForTest = new ArrayList<>();

		OutFlight outFlight1 = new OutFlight("London", "el al", 2020, 5, 20, 10, 10, "LY315", 3);
		OutFlight outFlight2 = new OutFlight("New York", "el al", 2020, 5, 20, 00, 45, "LY3001", 3);

		outFlightsForTest.add(outFlight1);
		outFlightsForTest.add(outFlight2);

		FlightSystem.sortOutFlightByDateAndTime(outFlightsForTest);

		StringBuffer expectedResult = new StringBuffer();
		expectedResult.append("[");
		expectedResult.append(outFlight2);
		expectedResult.append(", ");
		expectedResult.append(outFlight1);
		expectedResult.append("]");

		assertEquals(expectedResult.toString(), outFlightsForTest.toString());

	}
}