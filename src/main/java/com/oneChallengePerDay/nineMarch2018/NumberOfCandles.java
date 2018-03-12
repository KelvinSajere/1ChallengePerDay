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
		//get the max value in the array
		int max=Arrays.stream(arr).max().getAsInt();
		//filter by max value, count
		return (int) Arrays.stream(arr).filter(i-> i==max).count();
		
		
		
	}

}
