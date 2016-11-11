package cs520.hw6.part1;

public class Test {

	public static void main(String[] args) {
		SharedResults test= new SharedResults(); //3a
		LongTask t1 = new LongTask(test, 1, 100);
		t1.start();
		LongTask t2 = new LongTask(test, 101, 200);
		t2.start();
		LongTask t3 = new LongTask(test, 201, 300);
		t3.start();
		LongTask t4 = new LongTask(test, 301, 400);
		t4.start();
		LongTask t5 = new LongTask(test, 401, 500);
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n Final Result = "+(test.getResult()));
	}

}
