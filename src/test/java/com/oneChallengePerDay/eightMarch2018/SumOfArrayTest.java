package com.oneChallengePerDay.eightMarch2018;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.oneChallengePerDay.eightMarch2018.SumOfArray;

class SumOfArrayTest {

	@Test
	void simpleArraySumStream() {
		assertEquals(5, new SumOfArray().simpleArraySumStream(new int[] {2,3}));
	}
	
	@Test
	void testSimpleArraySumForLoop() {
		assertEquals(5, new SumOfArray().simpleArraySumForLoop(new int[] {2,3}));
	}

}
