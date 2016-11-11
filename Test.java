package cs520.hw5;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
	LinkedList <Student> studentQueue= new LinkedList<Student>(); //declare and initalize and empty queue of student objects
	
	HashMap<String, Student>studentMap = new HashMap<String, Student>(); // names of students, student objects
	
	String inputFileName = "C:\\Users\\KevFe\\Desktop\\Masters\\Java\\JavaProjects\\HW5_Ferri\\src\\cs520\\hw5\\data"; //read the data.txt file
	FileReader fileReader = null;
	try {
		fileReader = new FileReader (inputFileName);
		
	}
	catch (FileNotFoundException e){
		e.printStackTrace();
	}
	BufferedReader reader = new BufferedReader (fileReader);
	String input;
	
	try {
		input = reader.readLine(); // or should input be Student, they want student object
		System.out.println("Printing Process Input Data \n");
		while (input!=null)
		{
			Student currentStudent = processInputData(input);
			
			//add student to the studentQueue
			studentQueue.add(currentStudent);
			
			//insert Student object into the studentMap using the student's name as the key
			String key = currentStudent.getName();
			
			studentMap.put(key, currentStudent); //studentIndex needs to be an object
		
			input = reader.readLine();
		}
		System.out.println("\n Printing StudentQue \n");
		//iterate the studenQueue and print to console
		Iterator<Student> itr1 = studentQueue.iterator();
		while (itr1.hasNext())
			System.out.println((itr1.next()).toString());
		
		//access the keys of the studentMap and assign a variable
		Set keyset = studentMap.keySet();
					
		//create an iterator over the keys
		Iterator<String> itrkey= keyset.iterator();
		System.out.println("\n Printing Student map");

		//iterate over each key and diplay the object in the map to the console
		while (itrkey.hasNext())
		{
			String name = itrkey.next();
			
				System.out.println((studentMap.get(name)).toString());
		}
		 
		}catch (IOException e){
			e.printStackTrace();
		}
		try {
			fileReader.close();
			
		}catch (IOException e){
			e.printStackTrace();
	}// end reading the txt file
		
}

	private static Student processInputData(String data){//return type student and do all under here
						//	private static Student processInputData(Student currentStudent){
StringTokenizer st = new StringTokenizer(data, ","); //tokenize the string argument using the comma as the delimiter
						//	String data = currentStudent.toString()
	String name = st.nextToken();
		Student currentStudent = new Student (name);
		while(st.hasMoreTokens())
			currentStudent.addHomeworkGrade(Integer.parseInt(st.nextToken()));
		System.out.println(currentStudent.toString());
		return currentStudent;
	}
}
