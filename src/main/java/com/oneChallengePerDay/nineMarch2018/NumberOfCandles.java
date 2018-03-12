/**
 * 
 */
package com.oneChallengePerDay.nineMarch2018;

import java.util.Arrays;

/**
 * @author Kelvin sajere
 *
 */
public class NumberOfCandles {
	
	public int noOfCandles(int[] arr) {
		
		int max=Arrays.stream(arr).max().getAsInt();
		return (int) Arrays.stream(arr).filter(i-> i==max).count();
		
		
		
	}

}
