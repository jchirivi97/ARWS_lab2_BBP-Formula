package edu.escuelaing.arem.lab2.app;

import edu.escuelaing.arem.lab2.app.CountThread;

public class CountMainThreads extends Thread {

	public static void main(String[] args) {
		
		CountThread c1 = new CountThread (0,99);
		CountThread c2 = new CountThread (99,199);
		CountThread c3 = new CountThread (200,299);
		
		Thread t1 = new Thread (c1);
		Thread t2 = new Thread (c2);
		Thread t3 = new Thread (c3);
		
		//t1.start();
		//t2.start();
		//t3.start();
		
		t1.run();
		t2.run();
		t3.run();
		
	}

}
