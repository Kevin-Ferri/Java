package cs520.hw1.part2;

import javax.swing.*;

public class OddNumbers {

	public static int sumWithLoop(int inputNumber)
	{
		int result1=0;
		for (int n=1; n<=inputNumber; n++) //create loop
			{
			result1=result1 + (((2*n)-1)*((2*n)-1)); //formula on the left side (2n-1)^2
			}
		System.out.println("Sum with Loop = " + result1); //print to the console
			
		return result1; //return result
	}
	public static int sumWithOutLoop(int inputNumber)
	{
		int n=inputNumber, result2=0;

		result2=((n*((2*n)-1)*((2*n)+1))/3); //formula on the right side (n(2n-1)(2n+1))/3
	
		System.out.println("Sum without Loop = " + result2); //print to the console
		return result2; //return result
	
	}
	public static void main(String[] args) {
		String value = JOptionPane.showInputDialog("Enter an integer (>=0)");
		int inputNumber= Integer.parseInt(value);	//convert string to integer
		int result1= sumWithLoop(inputNumber);	//sends users number to withLoop to get result
		int result2= sumWithOutLoop(inputNumber);	//sends users number to withOutLoop to get result
		if (result1==result2) //compare the two results
			System.out.println("Results are the same, my code is correct!"); //print to the console
		else if (result1 != result2) //compare the two results
			System.out.println("My code is incorrect...");
		JOptionPane.showMessageDialog(null, "Requested Number (" + inputNumber + ") \n Sum with loop (" + result1 + ") \n Sum without loop (" + result2 + ") "); //print a message box
	}

}
