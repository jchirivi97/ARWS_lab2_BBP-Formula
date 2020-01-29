package edu.eci.arsw.threads;

import java.util.ArrayList;
import java.util.List;

public class CountThread implements Runnable {

	int a,b;
	
	public CountThread(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void run () {
		
		while (a <= b ) {
			System.out.println(a++);
		}
		
	}	
	
}