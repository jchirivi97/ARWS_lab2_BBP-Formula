package edu.eci.arsw.primefinder;

public class Main {
	
	public static void main(String[] args) {
		
		PrimeFinderThread pft = new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft2 = new PrimeFinderThread(10000001,20000000);
		PrimeFinderThread pft3 = new PrimeFinderThread(20000001,30000000);
		pft.start();
		pft2.start();
		pft3.start();
		long inicio = System.currentTimeMillis();
		
		long transcurrido = System.currentTimeMillis() - inicio;
		
		if (transcurrido > 5000) {
			try {
				pft.wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				pft2.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				pft3.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
