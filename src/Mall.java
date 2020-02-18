/**
 * This class generates the data for the Mall object.
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */

public class Mall extends Business {
	
	//Instance Fields
	
	private int numRentedUnits; //Used to determine the number of Rented units in a mall.
	private double medianUnitSize; //Used to determine the average size of a unit
	private int numParkingSpaces; //Used to determine the number of parking spaces the mall has.
	
	/**
	 * Default Constructor
	 * Sets the default values for the instance fields
	 */
	public Mall() {
		
		this.numParkingSpaces = 0;
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		
	} //End default constructor
	/**
	 * Passes in Instance Fields from Business
	 * @param projectName the name of the building project
	 * @param completeAddress  the  complete  address  of  the  project
	 * @param totalSquareFeet the square footage of the building
	 * @param occupancyGroup group code according to Table 1
	 * @param subGroup subgroup code according to Table 1
	 * @param numRentedUnits  the  number  of  units  in  the  building  that  are  currently being rented
	 * @param medianUnitSize The median of all unit sizes in the mall
	 * @param numParkingSpaces the total number of parking spaces around the mall
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, 
			String subGroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
		
	} //End preferred constructor
	
	//Methods
	
	/**
	 * Method used to generate a drawing
	 */
	public void draw() {
		System.out.print("I am drawing. \n\n");
	} //end draw
	/**
	 * Displays the data for the Mall class using the ToString method.
	 * @return a formatted String with the instance fields
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("");
		sb.append("Business Additions \n");
		sb.append("==================================\n");
		sb.append("numRentableUnits: " +getNumRentableUnits() +"\n");
		sb.append("==================================\n");
		sb.append("Mall Additions \n");
		sb.append("==================================\n");
		sb.append("numParkingSpaces: " +getNumParkingSpaces() +"\n");
		sb.append("numRentedUnits: " +getNumRentedUnits() + "\n");
		sb.append("medianUnitSize: " +getMedianUnitSize() + "\n");
		sb.append("==================================\n");
		return super.displayData() + sb.toString();
	} //end displayData
	
	//GETTERS/SETTERS/TOSTRING
	
	/**
	 * @return the value of numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	/**
	 * @param numRentedUnits the value of numRentedUnits to be set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	
	/**
	 * @return the value of medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	
	/**
	 * @param medianUnitSize the value of medianUnitSize to be set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	
	/**
	 * @return the value of numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	
	/**
	 * @param numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	/**
	 * @return A formatted string with the instance fields.
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subGroup=" + subGroup + "]";
	}
}
