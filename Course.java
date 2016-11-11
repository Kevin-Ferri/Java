package cs520.hw2.part1;

import javax.swing.*;

public class Course
{
	
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;
	
	
	
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @param costPerCredit the costPerCredit to set
	 */
	public void setCostPerCredit(int costPerCredit) {
		this.costPerCredit = costPerCredit;
	}

	/**
	 * @param numberOfCredits the numberOfCredits to set
	 */
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}


	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName = JOptionPane.showInputDialog("Enter the name of the course");
	}

	/**
	 * @return the costPerCredit
	 */
	public int getCostPerCredit() {
		return costPerCredit = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per credit of the course"));
	}

	/**
	 * @return the numberOfCredits
	 */
	public int getNumberOfCredits() {
		return numberOfCredits = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits of the course"));
	}

	public int getTotalTuition()
	{
		return costPerCredit * numberOfCredits;
	}

	public void printTuitionDetails()
	{
		JOptionPane.showMessageDialog(null, "Course Name: " + getCourseName() + "\n Cost per Credit: " + getCostPerCredit() + "\n Number of Credits: " + getNumberOfCredits() + " \nTotal Tuition Cost: " + getTotalTuition());
	}

}
