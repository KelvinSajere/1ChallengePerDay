package com.oneChallengePerDay.elevenMarch2018;

import java.util.*;

public class PlusMinus {

	public double[] plusMinusMethod(int[] arr) {
		// Complete this function
		double zeroCount =  (Arrays.stream(arr).filter(i -> i == 0).count() / (double)arr.length);
		double positiveCount = (Arrays.stream(arr).filter(i -> i > 0).count() / (double) arr.length);
		double negativeCount = (Arrays.stream(arr).filter(i -> i < 0).count() / (double) arr.length);
		double[] array = new double[] {positiveCount,negativeCount,zeroCount};
		return array;

	}
}