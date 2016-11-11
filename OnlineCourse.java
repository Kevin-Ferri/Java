package cs520.hw2.part2;

public class OnlineCourse extends Course {
private int technologyFee;

public OnlineCourse(String courseName, int costPerCredit, int numberOfCredits, int technologyFee)
{
	super (courseName, costPerCredit, numberOfCredits);
	this.technologyFee = technologyFee;
	System.out.println("In OnlineCourse Constructor values set: \n CourseName = " + getCourseName() + " CostPerCredit = " + getCostPerCredit() + " NumberOfCredits = " + getNumberOfCredits () + "Technology Fee = " + technologyFee);
}

/**
 * @return the technologyFee as technology fee entered multiplied by the number of credits for the course
 */
public int getTechnologyFee() {
	return technologyFee * getNumberOfCredits();
}

/**
 * @param technologyFee the technologyFee to set
 */
public void setTechnologyFee(int technologyFee) {
	 this.technologyFee = technologyFee;
}

//override getTotalTuition method from the Course class
public int getTotalTuition(){
	return (getCostPerCredit() * getNumberOfCredits() + getTechnologyFee());
}

public String toString(){
	return "OnlineCourse: " + getCourseName() + " @ $" + getTotalTuition();
}

}
