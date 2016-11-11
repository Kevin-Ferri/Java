package cs520.hw2.part2;

public class Course 
{
private String courseName;
private int costPerCredit;
private int numberOfCredits;


public Course(String courseName, int costPerCredit, int numberOfCredits){
	this.courseName = courseName;
	this.costPerCredit = costPerCredit;
	this.numberOfCredits = numberOfCredits;
	System.out.println("In Course Constructor values set: \n CourseName = " + getCourseName() + ", Cost per Credit = $" + getCostPerCredit() + ", Number of Credits = " + getNumberOfCredits ());
}

/**
 * @return the courseName
 */
public String getCourseName() {
	return courseName;
}

/**
 * @param courseName the courseName to set
 */
public void setCourseName(String courseName) {
	this.courseName = courseName;
}

/**
 * @return the costPerCredit
 */
public int getCostPerCredit() {
	return costPerCredit;
}

/**
 * @param costPerCredit the costPerCredit to set
 */
public void setCostPerCredit(int costPerCredit) {
	this.costPerCredit = costPerCredit;
}

/**
 * @return the numberOfCredits
 */
public int getNumberOfCredits() {
	return numberOfCredits;
}

/**
 * @param numberOfCredits the numberOfCredits to set
 */
public void setNumberOfCredits(int numberOfCredits) {
	this.numberOfCredits = numberOfCredits;
}

public int getTotalTuition(){
	return numberOfCredits * costPerCredit;
}

public String toString(){
	return "CourseName: " + courseName + " @ $" + getTotalTuition();
}

}
