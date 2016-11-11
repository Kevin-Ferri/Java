package cs520.hw1.part1; //part a


import javax.swing.*;

public class Banking { //part b


	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Please enter a dollar amount"); //ask for dollar and store string as input
		System.out.println("Requested Amount " + input);
		int amount = Integer.parseInt(input); //convert string to integer
		int hundreds=0, twenties=0, tens=0, fives=0, ones=0, remainingAmount=amount;
if (amount>0) //check to ensure the amount entered is valid
{
		if (amount<100) //check to see where to begin dividing the original amount
		{
			remainingAmount=amount;
		}
		
		if (amount<20)
			{
			remainingAmount=amount;
			}		
		if (amount<10)
			{
				remainingAmount=amount;
			}
		if (amount<5)
			{
				remainingAmount=amount;
			}
		if (remainingAmount>=100) //begin dividing for 100
			{
			hundreds=remainingAmount/100;
			remainingAmount = remainingAmount%100; //use the remainder for 20s
			}
		System.out.println("Hundreds = " + hundreds + ", Remaining Amount = " + remainingAmount);		
			if (remainingAmount>=20) //check to see if the remaining amount is divisible by 20
				{
				twenties = remainingAmount/20;
				remainingAmount=remainingAmount%20;	//use the remainder for the 10s			
				}
			System.out.println("Twenties = " + twenties + ", Remaining Amount = " + remainingAmount);
				if (remainingAmount>=10)//check to see if the remaining amount is divisible by 10
					{
					tens=remainingAmount/10;
					remainingAmount=remainingAmount%10;
					
					}
				System.out.println("Tens = " + tens + ", Remaining Amount = " + remainingAmount);
				
					if (remainingAmount>=5)//check to see if the remaining amount is divisible by 5
						{
						fives=remainingAmount/5;
						remainingAmount=remainingAmount%5;
						
						}
					System.out.println("Fives = " + fives + ", Remaining Amount = " + remainingAmount);
					
						if (remainingAmount>0) //check to see if the remaining amount is divisible by 1
							{
							ones=remainingAmount;
							System.out.println("Ones = " + ones);
							}
						else
						{
							System.out.println("Ones = " + ones);
						}

JOptionPane.showMessageDialog(null, "Requested Amount (" + input + ") \n Hundreds (" + hundreds + ") \n Twenties (" + twenties + ") \n Tens (" + tens + ") \n Fives (" + fives + ") \n Ones (" + ones + ")");

}
else 
{
	System.out.println("You have entered an invalid amount");
}

	}
	


}
