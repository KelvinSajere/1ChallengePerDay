package com.oneChallengePerDay.nineMarch2018;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfCandlesTest {

	@Test
	void testNoOfCandles() {
		NumberOfCandles candles=new NumberOfCandles();
		assertEquals(2, candles.noOfCandles(new int[] {3, 2, 1 ,3}));
	}

}
