package com.oneChallengePerDay.tenMarch2018;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class DiagonalDifferenceTest {

	@Test
	void testDiaDiff() {
		DiagonalDifference sumDiff = new DiagonalDifference();
		int[][] array= { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
		assertEquals(15, sumDiff.diaDiff2(array));
	}

}
