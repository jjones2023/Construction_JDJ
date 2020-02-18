/**
 * This class generates the data for the Residential object.
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */

public class Residential extends Building {
	
	//Instance Fields
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//Constructors
	
	/**
	 * Default Constructor
	 */
	public Residential() {
		
		this.numBathrooms = 0;
		this.numBedrooms = 0;
		this.laundryRoom = false;
		
	} //End default constructor
	
	/**
	 * Preferred Constructor
	 * @param projectName name of the Project
	 * @param completeAddress complete Address of the Mall
	 * @param totalSquareFeet the square footage of the building
	 * @param occupancyGroup group code according to Table 1
	 * @param subGroup subgroup code according to Table 1
	 * @param numBedrooms the number of bedrooms in the building
	 * @param numBathrooms the number of bathrooms in the building
	 * @param laundryRoom whether or not the building has a laundry room
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
		
	} //End preferred constructor
	
	//Getters/Setters/ToString
	
	/**
	 * @return the value of numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}
	
	/**
	 * @param numBedrooms the value of numBedrooms to be set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	
	/**
	 * @return the value of numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}
	
	/**
	 * @param numBathrooms the value of numBathrooms to be set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	
	/**
	 * @return the value of laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	/**
	 * @param laundryRoom the value of laundryRoom to be set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	/**
	 * @return A formatted string with the instance fields.
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + "]";
	}
}
