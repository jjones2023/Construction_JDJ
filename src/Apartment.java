/**
 * This class generates the data for the Apartment Object
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */

public class Apartment extends Residential {
	
	//Instance Fields
	
	private int numRentableUnits; //Number of Rentable Apartments
	private double avgUnitSize; //Average unit size of the Apartments
	private boolean parkingAvailable; //True or False value that is used to determine if parking is available.
	
	//Constructors
	
	/**
	 * Default Constructor
	 * Sets the default values for the instance fields
	 */
	public Apartment() {
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}
	/**
	 * Preferred Constructor
	 * @param projectName the name of the building project
	 * @param completeAddress  the  complete  address  of  the  project
	 * @param totalSquareFeet the square footage of the building
	 * @param occupancyGroup group code according to Table 1
	 * @param subGroup subgroup code according to Table 1
	 * @param numRentableUnits the number of units that can be rented in the building
	 * @param avgUnitSize the average size of the apartments (square footage) in the building
	 * @param parkingAvailable a boolean value that indicates if onsite parking is available for this building
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, 
			String subGroup, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}
	
	//Methods
	
	/**
	 * Method used to generate a drawing
	 */
	public void draw() {
		System.out.print("I am drawing.\n\n");
	}
	/**
	 * Displays the data for the Apartment class using the ToString method.
	 * @return a formatted String with the instance fields
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("");
		sb.append("Residential Additions \n");
		sb.append("==================================\n");
		sb.append("numBedrooms: " +getNumBedrooms() +"\n");
		sb.append("numBathrooms: " +getNumBathrooms() + "\n");
		sb.append("laundryRoom: " +isLaundryRoom() + "\n");
		sb.append("==================================\n");
		sb.append("Apartment Additions \n");
		sb.append("==================================\n");
		sb.append("numRentableUnits: " +getNumRentableUnits() +"\n");
		sb.append("avgUnitSize: " +getAvgUnitSize() + "\n");
		sb.append("parkingAvailable: " +isParkingAvailable() + "\n");
		sb.append("==================================\n");
		return super.displayData() + sb.toString();
	}
	
	//Getters/Setters/ToString
	
	/**
	 * @return the current value of numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	
	/**
	 * @param numRentableUnits the current value of numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	/**
	 * @return the current value of AvgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	
	/**
	 * @param avgUnitSize sets the value of AvgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	
	/**
	 * @return the current value of ParkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	
	/**
	 * @param parkingAvailable sets the value of parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
}
