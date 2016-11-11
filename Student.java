package cs520.hw5;


import java.util.ArrayList;

public class Student 
{
private String name;
private ArrayList<Integer> homeworks;

public Student (String name){//constructor with name as the argument
	this.name= name;
	homeworks = new ArrayList<Integer>();//initialize homeworks arraylist
	 
} 
	
	
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}
			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}
			
			public void addHomeworkGrade(int homeworkGrade) //takes one arugment, the new homework grade
			{
				homeworks.add(homeworkGrade);
				
			}
			
		
			public int getHomeworkGrade(int index)//takes the homework grade index
			{
				
				try {
					return homeworks.get(index);
				
				}
				catch (IndexOutOfBoundsException e){
					throw e;
				}
			
			}
			public double computeWeightedAverage() //takes no arguments
			{
				int sum=0;
				int counter=0;
				int grade=-1;
				while (counter < homeworks.size()) 
					{
					grade=(getHomeworkGrade(counter));
			
					if ((counter%2)==0)//even homework grades have 2x the wieight
					sum = sum + (grade*2);	
					
					else
						sum = grade + sum;	
					counter++;
					}
		
				
					return (sum/homeworks.size()); //the amount of homework grades, get the average
					

			}
			
			public String toString(){
				return "The " + getName() + "'s weighted grade is " + computeWeightedAverage();
			}
			

}
