package com.oneChallengePerDay.elevenMarch2018;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PlusMinusTest {

	@Test
	void testPlusMinusMethod() {
		assertTrue(Arrays.equals(new PlusMinus().plusMinusMethod(new int[] {2,0}),new double[] {0.5,0.0,0.5}));
	}

}
