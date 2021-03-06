package edu.eci.arsw.math;

import java.util.ArrayList;

import edu.eci.arsw.math.*;

///  <summary>
///  An implementation of the Bailey-Borwein-Plouffe formula for calculating hexadecimal
///  digits of pi.
///  https://en.wikipedia.org/wiki/Bailey%E2%80%93Borwein%E2%80%93Plouffe_formula
///  *** Translated from C# code: https://github.com/mmoroney/DigitsOfPi ***
///  </summary>
public class PiDigits extends Thread {

    private static int DigitsPerSum = 8;
    private static double Epsilon = 1e-17;
    
    /**
     * Returns a range of hexadecimal digits of pi.
     * @param start The starting location of the range.
     * @param count The number of digits to return
     * @return An array containing the hexadecimal digits.
     */
    public static byte[] getDigits(int start, int count) {
        if (start < 0) {
            throw new RuntimeException("Invalid Interval");
        }

        if (count < 0) {
            throw new RuntimeException("Invalid Interval");
        }
        byte[] digits = new byte[count];
        double sum = 0;
        for (int i = 0; i < count; i++) {
            if (i % DigitsPerSum == 0) {
                sum = 4 * sum(1, start)
                        - 2 * sum(4, start)
                        - sum(5, start)
                        - sum(6, start);

                start += DigitsPerSum;
            }

            sum = 16 * (sum - Math.floor(sum));
            digits[i] = (byte) sum;
        }

        return digits;
    }
    
    /// <summary>
    /// Returns the sum of 16^(n - k)/(8 * k + m) from 0 to k.
    /// </summary>
    /// <param name="m"></param>
    /// <param name="n"></param>
    /// <returns></returns>
    
    public static byte[] getDigits(int start,int count,int n){
    	ArrayList <Thread> thr =  new ArrayList<>();
    	byte[] arreglo = null;
    	ArrayList <Threads> thrs = new ArrayList<>();
    	
    	for (int i = start; i <= count; i += n){
			int e = Math.min(i + n,count);
			Threads thread = new Threads (i,e);
			Thread th = new Thread (thread);
			thr.add(th);
			thrs.add(thread);
			
		}
    	for (int i = 0 ;i < thr.size();i++) {
    		try {
    			thr.get(i).run();    			
				thr.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		   		
    	}
    	
    	for (int i=0; i < thrs.size(); i++) {
    		thrs.get(i).run();
    		if (i == 0) {
    			arreglo = thrs.get(i).getDat();
    		}
    		else {
    			arreglo = concatenar(arreglo, thrs.get(i).getDat() );
    		}
    		
    	}   			
    	 	
    	
    	return arreglo;
    }
    
    public static byte[] concatenar(byte[] arreglo1, byte[] arreglo2 ) {
    	byte[] bytes = new byte [arreglo1.length + arreglo2.length];
    	int i = 0;
    	for (i = 0; i < arreglo1.length; i++) {
    		bytes[i] = arreglo1[i];
    	}
    	for (int j = 0; j < arreglo2.length; j++) {
    		
    		bytes[i] = arreglo2[j];
    		j++;
    	}
    	return bytes;
    	
    }
    
    
    private static double sum(int m, int n) {
        double sum = 0;
        int d = m;
        int power = n;

        while (true) {
            double term;

            if (power > 0) {
                term = (double) hexExponentModulo(power, d) / d;
            } else {
                term = Math.pow(16, power) / d;
                if (term < Epsilon) {
                    break;
                }
            }

            sum += term;
            power--;
            d += 8;
        }

        return sum;
    }

    /// <summary>
    /// Return 16^p mod m.
    /// </summary>
    /// <param name="p"></param>
    /// <param name="m"></param>
    /// <returns></returns>
    private static int hexExponentModulo(int p, int m) {
        int power = 1;
        while (power * 2 <= p) {
            power *= 2;
        }

        int result = 1;

        while (power > 0) {
            if (p >= power) {
                result *= 16;
                result %= m;
                p -= power;
            }

            power /= 2;

            if (power > 0) {
                result *= result;
                result %= m;
            }
        }

        return result;
    }

}
