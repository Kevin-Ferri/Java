package cs520.hw2.part1;

import javax.swing.*;


public class TuitionProceduralStyle {

	public static void main(String[] args) {
		String courseName1 = JOptionPane.showInputDialog("Enter the name of the first course");
		int credits1= Integer.parseInt(JOptionPane.showInputDialog("enter the number of credits for the first course"));
		int creditCost1 = Integer.parseInt(JOptionPane.showInputDialog("enter the cost per credit for the first course"));
		
		String courseName2 = JOptionPane.showInputDialog("Enter the name of the second course");
		int credits2 = Integer.parseInt(JOptionPane.showInputDialog("enter the number of credits for the second course"));
		int creditCost2 = Integer.parseInt(JOptionPane.showInputDialog("enter the cost per credit for the second course"));


		int tuition1 = credits1 * creditCost1;

		int tuition2 = (credits2 * creditCost2);
		
		JOptionPane.showMessageDialog(null, "Course 1: " + courseName1 + "\n tuition: " + tuition1);
		JOptionPane.showMessageDialog(null, "\n Course 2: " + courseName2 + "\n tuition: " + tuition2);
		
		int difference=0;
		
		if (tuition1 > tuition2)
		{
			difference = tuition1-tuition2;
			JOptionPane.showMessageDialog(null, "Tuition 1: " + tuition1 + "\n - Tuition 2: " + tuition2 + "\n = " + difference + " is the difference");
		}
		else if (tuition1 < tuition2)
		{
			difference = tuition2-tuition1;
			JOptionPane.showMessageDialog(null, "Tuition 2: " + tuition2 + "\n - Tuition 1: " + tuition1 + "\n = " + difference + " is the difference");
		}
		else
		{
			difference = 0;
			JOptionPane.showMessageDialog(null, "The tuition for each course is the same, the difference is " + difference);
		}

	}

}
