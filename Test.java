package cs520.hw6.part2;

public class Test {

	public static void main(String[] args) {
		SharedResults test= new SharedResults(); //5a
		LongTask t1 = new LongTask(test, 1, 100, 0);
		t1.start();
		LongTask t2 = new LongTask(test, 101, 200, 1);
		t2.start();
		LongTask t3 = new LongTask(test, 201, 300, 2);
		t3.start();
		LongTask t4 = new LongTask(test, 301, 400, 3);
		t4.start();
		LongTask t5 = new LongTask(test, 401, 500, 4);
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
		System.out.println("Result = " + (test.getResult()));	
	}

}
