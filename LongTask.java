package cs520.hw6.part1;

public class LongTask extends Thread{
//2a
	private SharedResults sharedData;
	private int start, end; 
	
	public LongTask(SharedResults sharedData, int start, int end){ //2b
		super.setName(start + "_" + end);//create name for thread as Thread_<start>_<end>
		this.sharedData = sharedData;
		this.start = start;
		this.end = end;
		
	}
	

	public void run(){ //2c
		int sum=0;
		
		for (int counter = start; counter <= end; counter++){
			sum = sum + counter;
			long time = (long) (Math.random() * .001); //0 to 10 milliseconds
			try {
				Thread.sleep(time);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			
		}
		sharedData.addToResults(sum); //provide accumulated sum to addToResults
	}
}
