/**
 * This class generates the data for the Business object.
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */

public class Business extends Building {

	//Instance Fields
	
	protected int numRentableUnits; //value of numRentableUnits
	
	//Constructors
	
	/**
	 * Default Constructor
	 */
	public Business() {
		
		this.numRentableUnits = 0;
		
	} //End default constructor
	/**
	 * Preferred Constructor
	 * @param projectName the value of projectName sent into the constructor
	 * @param completeAddress the value of completeAddress sent into the constructor
	 * @param totalSquareFeet the value of totalSquareFeet sent into the constructor
	 * @param occupancyGroup the value of occupancyGroup sent into the constructor
	 * @param subGroup the value of subGroup sent into the constructor
	 * @param numRentableUnits the number of units in the building that can be rented
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, 
			String subGroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentableUnits = numRentableUnits;
	} //End preferred constructor

	//Getters/Setters/ToString
	/**
	 * This section holds the getters and setters for the instance fields of the class.
	 */
	
	/**
	 * @return the value of numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	/**
	 * @param numRentableUnits the value of numRentableUnits to be set.
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	/**
	 * @return A formatted string with the instance fields.
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}
}
