package cs520.hw2.part2;

public class Test {

	public static void main(String[] args) {
		Course currentCourse;
		
	System.out.println("Taking a regular course...");
	currentCourse = new Course("CS520", 390, 4);
	System.out.println("Printing... \n"+ currentCourse);
	
	System.out.println("\nTaking an online course...");
	currentCourse = new OnlineCourse("CS520", 760, 4, 15);
	System.out.println("Printing... \n" + currentCourse);
	
	}

}
