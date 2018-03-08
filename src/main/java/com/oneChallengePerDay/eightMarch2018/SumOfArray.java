/**
 * 
 */
package com.oneChallengePerDay.eightMarch2018;

import java.util.Arrays;

/**
 * @author Kelvin sajere
 *
 */
public class SumOfArray {

	public int simpleArraySumStream(int[] ar) {
		// using stream to sum
		return Arrays.stream(ar).sum();
	}
	
	public int simpleArraySumForLoop(int[] arr) {
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return sum;}
}
