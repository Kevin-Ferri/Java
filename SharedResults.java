package cs520.hw6.part1;

import java.util.ArrayList;

public class SharedResults {

	private ArrayList<Integer> results; //1a
	
	public SharedResults(){ //1b
		results = new ArrayList<Integer>();
	}
	
	public synchronized void addToResults(int number){ //1c
		try{
		results.add(number);
		System.out.print("\n Thread "  + Thread.currentThread().getName() + " is adding " + number + "\n Cumulative Results are " +  results);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized int getResult (){ //1d
		int sum=0;
		int counter=0;
		
		while (counter < results.size()){
			sum = sum + results.get(counter);
			counter++;
		}
		
		try {
			return sum;
		} catch (IndexOutOfBoundsException e){
			throw e;
		}
		
	}
}
