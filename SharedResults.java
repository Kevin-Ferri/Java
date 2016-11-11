package cs520.hw6.part2;

import java.util.ArrayList;

public class SharedResults {
	private ArrayList<Integer> results;
	
	public SharedResults(){
		results = new ArrayList<Integer>();
	}
	
	int counter=0;
	public synchronized void addToResults(int turn, int addResult){ //2g
		
while (counter <=results.size()){ 
		
			if (turn == counter) {
				results.add(addResult);
				System.out.println("Calling Thread's Turn " + turn + " Thread " + Thread.currentThread().getName() + " is adding " + addResult + ", \n \t Cumulative Result is " + results);
				notifyAll(); //notify threads turn					
				counter++;

			}
			else if (turn > counter){
				try {
					System.out.println("Calling Thread's Turn " + turn + ", WhoseTurn " + counter + "...Wait");		
					wait();
				} catch (InterruptedException e){
					e.printStackTrace();
				}
				
			}
			 else if (turn < counter){
				 break;
			 }
		}
	}
	
	
	public synchronized int getResult(){
		int sum = 0;
		int x = 0;
		try {
			while (x < results.size()){
				sum = results.get(x) + sum;
				x++;
			}
		} catch (IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		return sum;
	}
	
}
