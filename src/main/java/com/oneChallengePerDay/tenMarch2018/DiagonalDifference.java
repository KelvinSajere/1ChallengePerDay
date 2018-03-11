/**
 * 
 */
package com.oneChallengePerDay.tenMarch2018;

import java.util.stream.IntStream;

/**
 * @author Kelvin sajere
 *
 */
public class DiagonalDifference {

	public int diaDiff(int[][] a) {

		int arrSize = a.length - 1;

		int sum = 0;
		for (int i = 0; i <= arrSize; i++) {
			sum += a[i][i] - a[i][arrSize - i];
		}

		return Math.abs(sum);

	}

	public int diaDiff2(int[][] a) {
		/*
		 * Loop from 0-3 Map the index values Reduce the sum starting from 0/c and
		 * increase to e
		 */
		return Math.abs(IntStream.range(0, a.length).mapToObj(i -> a[i][i] - a[i][a.length - 1 - i]).reduce(0,
				(c, e) -> c + e));
	}

}
