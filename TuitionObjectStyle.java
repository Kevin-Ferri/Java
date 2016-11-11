package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course();
		
		course1.printTuitionDetails();
		course2.printTuitionDetails();
		
		int difference=0;
		
		if ((course1.getTotalTuition()) < (course2.getTotalTuition()))
		{
		difference = (course2.getTotalTuition()) - (course1.getTotalTuition());
			JOptionPane.showMessageDialog(null, "The second course is more, the difference is $" + difference);
		}
		else if ((course1.getTotalTuition()) > (course2.getTotalTuition()))
		{
			difference = (course1.getTotalTuition()) - (course2.getTotalTuition());
			JOptionPane.showMessageDialog(null, "The first course is more, the difference is $" + difference);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The courses cost the same amount.");
		}

	}
}
