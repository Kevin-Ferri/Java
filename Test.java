package cs520.hw3.part2;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {

		//bufferedreader to read data.txt file
		String inputFileName = "data.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(inputFileName);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		try{
			input = reader.readLine(); //make a loop to read contents one at a time
			while (input !=null){ 
				processInputData(input);
				input = reader.readLine();
				}
		}
			catch (IOException e) {
				e.printStackTrace();
			}
		try {
			fileReader.close();
			}
		catch (IOException e){
			e.printStackTrace();
		}
	}
				
		public static void processInputData(String data){
		StringTokenizer st = new StringTokenizer(data, ",");//tokenize the argument and use the comma as the delmiter
		String name = st.nextToken();		//extract the name token
		Student currentStudent = new Student(name);
		String homework1 = st.nextToken();
		currentStudent.setHomework1(Integer.parseInt(homework1));
		String homework2 = st.nextToken();
		currentStudent.setHomework2(Integer.parseInt(homework2));
		String homework3 = st.nextToken();
		currentStudent.setHomework3(Integer.parseInt(homework3));
		String homework4 = st.nextToken();
		currentStudent.setHomework4(Integer.parseInt(homework4));
		String homework5 = st.nextToken();
		currentStudent.setHomework5(Integer.parseInt(homework5));
		String homework6 = st.nextToken();
		currentStudent.setHomework6(Integer.parseInt(homework6));
	
		System.out.println(currentStudent.tostring());//display currentStudent to console
		
		}
		
}
