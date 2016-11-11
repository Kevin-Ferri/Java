package cs520.hw3.part1;

import javax.swing.*;


public class StringTest {

	public static void main(String[] args) {
		
		try {
		String input = JOptionPane.showInputDialog("Enter the course id, name, and tuition");

		input = input.trim();
		int len = input.length();
		
	
		int first = input.indexOf(",");
		
		if (first<0)  { //check to make sure there is a comma
		JOptionPane.showMessageDialog(null, "Please first enter the course id followed by a comma");
		throw new StringIndexOutOfBoundsException();
		}				
		
		int second = input.indexOf(",", first + 1);
		if (second<0)  { //check to make sure there is a second comma
		JOptionPane.showMessageDialog(null, "Please enter the course name followed by a comma");
		throw new StringIndexOutOfBoundsException();
		}	

		String CourseId = input.substring(0, first);
		String CourseName = input.substring(first +1, second);
		String Tuition = input.substring(second+1, len);
		
		CourseId = CourseId.trim();
		CourseName = CourseName.trim();
		Tuition = Tuition.trim();
		
		int courseIdLen= CourseId.length();
		int courseNameLen = CourseName.length();
		int tuition = Integer.parseInt(Tuition);
		tuition = tuition - (tuition/4);
				
		
		System.out.println("First Comma Position:" + first + ", Course Id:" + CourseId + ", Length:" + courseIdLen);
		System.out.println("Second Comma Position:" + second + ", Course Name:" + CourseName + ", Length:" + courseNameLen);
		System.out.println("Regular Tuition $" + Tuition + ", Discount Tution $" + tuition);
		}
		catch (NullPointerException e) { //if cancel is clicked
			JOptionPane.showMessageDialog(null, "You chose to cancel");
			System.exit(0);
		}
	
		catch (NumberFormatException e) {//if the last statement is not a number
			JOptionPane.showMessageDialog(null, "Please enter a valid number for tuition");
			System.exit(0);
		}			
	}

}
