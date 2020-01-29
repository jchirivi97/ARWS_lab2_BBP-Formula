package edu.eci.arsw.math;

import edu.eci.arsw.math.*;

public class Threads implements Runnable{
	

	int a,b;
	byte[] d;
	
	public Threads (int a,int b) {
		this.a = a;
		this.b = b;			
	}
	
	public void run() {
		d = PiDigits.getDigits(a, b);
	}
	
	public byte[] getDat() {
		return d;
	}
}
