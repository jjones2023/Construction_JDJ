/**
 * This class generates the data for the SingleFamilyHome object.
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */

public class SingleFamilyHome extends Residential{
	
	//Instance Fields
	
	private boolean garage; //True or False value for if the building has a garbage or not.
	
	//Constructors
	
	/**
	 * Default Constructor
	 * Sets the default values for the instance fields
	 */
	public SingleFamilyHome() {
		
		this.garage = false;
			
	} //End default constructor
	/**
	 * Preferred Constructor
	 * @param projectName the name of the building project
	 * @param completeAddress the  complete  address  of  the  project
	 * @param totalSquareFeet the square footage of the building
	 * @param occupancyGroup group code according to Table 1
	 * @param subGroup subgroup code according to Table 1
	 * @param garage a boolean value that indicates whether or not the house has a garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, 
			String occupancyGroup, String subGroup, boolean garage) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.garage = garage;
	} //End preferred Constructor
		
	//Methods
	
	/**
	 * Method used to generate a drawing
	 */
	public void draw() {
		System.out.print("I am drawing. \n\n");
	} //End draw
	/**
	 * Displays the data for the SingleFamilyHome class using the ToString method.
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
		sb.append("SingleFamilyHome Additions \n");
		sb.append("==================================\n");
		sb.append("garage: " +isGarage() +"\n");
		sb.append("==================================\n");
		return super.displayData() + sb.toString();
	} //End displayData
	
	//GETTERS/SETTERS/TOSTRING
	
	/**
	 * Returns the current value of garage.
	 * @return
	 */
	public boolean isGarage() {
		return garage;
	}
	/**
	 * Sets the value of garage
	 * @param garage
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
}
