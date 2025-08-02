package com.murilo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum	() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber =2.0D ;
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		Assertions.assertEquals(expected, actual,
				() ->firstNumber + "+" + secondNumber + " did not produce "+  expected +"!");
		assertNotEquals(3.0D, actual, () ->actual +"was equal "+ 2.0D);
		assertNotNull(actual);
	}
	@Test
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		Assertions.assertEquals(expected, actual,
				() ->firstNumber + "-" + secondNumber + " did not produce "+  expected +"!");
		assertNotEquals(3.0D, actual, () ->actual +"was equal "+ 2.0D);
		assertNotNull(actual);
	}
	@Test
	void testMultiplication() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		Assertions.assertEquals(expected, actual,
				() ->firstNumber + "*" + secondNumber + " did not produce "+  expected +"!");
		assertNotEquals(3.0D, actual, () ->actual +"was equal "+ 2.0D);
		assertNotNull(actual);
	}
	@Test
	void testDivision() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;
		Assertions.assertEquals(expected, actual,
				() ->firstNumber + "/" + secondNumber + " did not produce "+  expected +"!");
		assertNotEquals(3.0D, actual, () ->actual +"was equal "+ 2.0D);
		assertNotNull(actual);
	}
	@Test
	void testMean() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		Assertions.assertEquals(expected, actual,
				() ->firstNumber + "μ" + secondNumber + " did not produce "+  expected +"!");
		assertNotEquals(3.0D, actual, () ->actual +"was equal "+ 2.0D);
		assertNotNull(actual);
	}
	@Test
	void testSquareRoot() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 4.0D;
		Double actual = math.squareRoot(firstNumber);
		double expected = 2.0D;
		Assertions.assertEquals(actual, expected,
				() ->firstNumber + " squareRoot"+ " did not produce "+ expected+"!");
		assertNotEquals(3.0D, actual, () ->actual +"was equal "+ 2.0D);
		assertNotNull(actual);
	}
	

}
