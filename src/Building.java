/**
 * This class generates the data for the Building object.
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 2
 * SP/2020
 * 
 */

public class Building {
	
	//Instance Fields
	protected String projectName; //Name of the building
	protected String completeAddress; //The complete address of the building
	protected double totalSquareFeet; //The square footage of the building
	protected String occupancyGroup; //Group code according to Table 1
	protected String subGroup; //subgroup code according to Table 1
	
	//Constructors
	
	/**
	 * Default Constructor
	 * Sets the default values for the instance fields
	 */
	public Building( ) {
		
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subGroup = "";
		
	} //end Default Constructor
	
	/**
	 * Passes in Instance Fields
	 * @param projectName the name of the building project
	 * @param completeAddress the  complete  address  of  the  project
	 * @param totalSquareFeet the square footage of the building
	 * @param occupancyGroup group code according to Table 1
	 * @param subgroup subgroup code according to Table 1
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		
	} //end Preferred Constructor
	
	//Methods
	
	/**
	 * Method used to generate a drawing
	 */
	public void draw() {
		System.out.print("I am drawing. \n\n");
	} //End draw
	/**
	 * Displays the data for the Building class using the ToString method.
	 * @return a formatted String with the instance fields
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Complete Address: "+getCompleteAddress()+ "\n");
		sb.append("Total Square Feet: " +getTotalSquareFeet()+ "\n");
		sb.append("Occupancy Group: " +getOccupancyGroup()+"\n");
		sb.append("Sub Group: " +getSubGroup()+ "\n");
		sb.append("==================================\n");
		return sb.toString();
	} //End displayData

	//Getters/Setters/ToString
	
	/**
	 * @return the value of ProjectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the value of ProjectName to be set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the value of CompleteAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}

	/**
	 * @param completeAddress the value of CompleteAddress to be set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	/**
	 * @return The value of TotalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/**
	 * @param totalSquareFeet The value of TotalSquareFeet to be set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/**
	 * @return The value of OccupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	/**
	 * @param occupancyGroup The value of OccupancyGroup to be set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	/**
	 * @return The value of subGroup
	 */
	public String getSubGroup() {
		return subGroup;
	}

	/**
	 * @param subGroup The value of subGroup to be set
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}

	/**
	 *@return A string that displays the current values of the Instance Fields.
	 */
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}
	
}
