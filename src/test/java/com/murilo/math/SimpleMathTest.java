package com.murilo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test with SimpleMath class and operations")
class SimpleMathTest {

	SimpleMath math;

	@BeforeAll
	static void setup() {
		System.out.println("Running @BeforeALL method!");
	}

	@AfterAll
	static void cleanup() {
		System.out.println("Running @AfterAll method!");
	}

	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @BeforeEach method!");
	}
	@AfterEach
	void afterEachMethod() {
		System.out.println("Running @AfterEach method!");
	}

	@Test
	@DisplayName("Test sum 6.2+2.0 = 8.2")
	void testSum() {

		double firstNumber = 6.2D;
		double secondNumber = 2.0D;
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		Assertions.assertEquals(expected, actual,
				() -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(3.0D, actual, () -> actual + "was equal " + 2.0D);
		assertNotNull(actual);
	}

	@Test
	@DisplayName("Test subtraction 6.2-2.0 = 4.2")
	void testSubtraction() {

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		Assertions.assertEquals(expected, actual,
				() -> firstNumber + "-" + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(3.0D, actual, () -> actual + "was equal " + 2.0D);
		assertNotNull(actual);
	}

	@Test
	@DisplayName("Test multiplication 6.2*2.0 = 12.4")
	void testMultiplication() {

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		Assertions.assertEquals(expected, actual,
				() -> firstNumber + "*" + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(3.0D, actual, () -> actual + "was equal " + 2.0D);
		assertNotNull(actual);
	}

	//@Disabled("TODO: We need still work on it!")
	@Test
	@DisplayName("Test Division by Zero")
	void testDivision() {

		//given
		double firstNumber = 6.2D;
		double secondNumber = 0D;
		
		var expectedMessage = "Impossible to divide by zero!";
		
		
		//when & then 
		ArithmeticException actual = assertThrows(ArithmeticException.class,() -> { 
			//when & then 
		math.division(firstNumber, secondNumber);
		}, () -> "Division by zero should throw an ArithmeticException");
		
		assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected excpetion message!");
	}

	@Test
	@DisplayName("Test Mean (6.2+2.0)/2 = 4.1")
	void testMean() {

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		Assertions.assertEquals(expected, actual,
				() -> firstNumber + "μ" + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(3.0D, actual, () -> actual + "was equal " + 2.0D);
		assertNotNull(actual);
	}

	@Test
	@DisplayName("Test SquareRoot of 4 = 2")
	void testSquareRoot() {

		double firstNumber = 4.0D;
		Double actual = math.squareRoot(firstNumber);
		double expected = 2.0D;
		Assertions.assertEquals(actual, expected,
				() -> firstNumber + " squareRoot" + " did not produce " + expected + "!");
		assertNotEquals(3.0D, actual, () -> actual + "was equal " + 2.0D);
		assertNotNull(actual);
	}

}
