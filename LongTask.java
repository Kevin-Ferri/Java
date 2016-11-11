package cs520.hw6.part2;

public class LongTask extends Thread {//4a

	private SharedResults sharedData;
	private int start,end, turn;
	
	public LongTask(SharedResults sharedData, int start, int end, int turn){//4b
		super.setName(start + "_" + end);	
		this.sharedData = sharedData;
		this.start = start;
		this.end = end;
		this.turn = turn;
	}

	public void run(){//4c
		int sum = 0;
		for (int counter = start; counter <= end; counter++){
			long time = (long) (Math.random() * .001); //0 to 10 milliseconds
			try {
				Thread.sleep(time);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			sum = sum + counter;
		}
		sharedData.addToResults(turn, sum);
	}
	
}
