/**
 * This class is used to test the different objects and methods within the project
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */
public class Application {

	/**
	 * The main method is used to test code from the different classes. 
	 * The main method is required for a program to run.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Building Tests
		Building a = new Building();
			a.setProjectName("New Building");
			a.setCompleteAddress("2705 Ashford Drive, Louisville Kentucky 40299");
			a.setTotalSquareFeet(5000.0);
			a.setOccupancyGroup("N/A");
			a.setSubGroup("N/A");
			System.out.println(a.displayData());
			a.draw();
		
		//Business Tests
		Business b = new Business();
			b.setProjectName("New Business");
			b.setCompleteAddress("500 M Street, Louisville Kentucky 40047");
			b.setTotalSquareFeet(5000.0);
			b.setOccupancyGroup("Business");
			b.setSubGroup("Group B");
			b.setNumRentableUnits(2);
		
		//Mall Tests
		Mall c = new Mall();
			c.setProjectName("New Mall");
			c.setCompleteAddress("2710 Earnhardt Drive, Louisville Kentucky 40299");
			c.setTotalSquareFeet(10000.0);
			c.setOccupancyGroup("Business");
			c.setSubGroup("Group B");
			c.setNumRentableUnits(15);
			c.setNumRentedUnits(10);
			c.setMedianUnitSize(1000);
			c.setNumParkingSpaces(500);
			System.out.println(c.displayData());
			c.draw();
		
		//Residential Tests
		Residential d = new Residential();
			d.setProjectName("New Residential");
			d.setCompleteAddress("2725 Earnhardt Drive, Louisville Kentucky 40299");
			d.setTotalSquareFeet(2000.0);
			d.setOccupancyGroup("Residential");
			d.setSubGroup("Groups R-1, R-2, R-3, & R-4");
			d.setNumBedrooms(40);
			d.setNumBathrooms(20);
			d.setLaundryRoom(true);
		
		//Apartment Tests
		Apartment e = new Apartment();
			e.setProjectName("New Apartment");
			e.setCompleteAddress("2744 Cardinal Avenue, Louisville Kentucky 40299");
			e.setTotalSquareFeet(10000.0);
			e.setOccupancyGroup("Residential");
			e.setSubGroup("Groups R-1, R-2, R-3, & R-4");
			e.setNumBedrooms(1);
			e.setNumBathrooms(1);
			e.setLaundryRoom(false);
			e.setNumRentableUnits(10);
			e.setAvgUnitSize(1000.0);
			e.setParkingAvailable(true);
			System.out.println(e.displayData());
			e.draw();
		
		//SingleFamilyHome Tests
		SingleFamilyHome f = new SingleFamilyHome();
			f.setProjectName("New SingleFamilyHome");
			f.setCompleteAddress("14 Briarwood Road, Murfreesboro Tennessee 37128");
			f.setTotalSquareFeet(10000.0);
			f.setOccupancyGroup("Residential");
			f.setSubGroup("Groups R-1, R-2, R-3, & R-4");
			f.setNumBedrooms(5);
			f.setNumBathrooms(3);
			f.setLaundryRoom(true);
			f.setGarage(true);
			System.out.println(f.displayData());
			f.draw();
	}

}
