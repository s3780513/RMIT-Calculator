package edu.au.rmit.ct;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MyCalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up Before Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setting up before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tearing Down After each test");
	}

	@Test
	void test() { //Generic test fail
		fail("Not yet implemented");
	}
	@Test
	void testAdditionOfIntegersSimple() {
		MyCalculator mc = new MyCalculator(100, "ee");
		assertEquals(0, mc.addIntegers(2,0));
	}
	@Test
	void testDivideTwoIntegers() {
		MyCalculator mc = new MyCalculator(100, "ee");
		assertEquals(0, mc.divideIntegers(2,0));
	}
	@Test
	void testModulusTwoIntegers() {
		MyCalculator mc = new MyCalculator(100, "ee");
		assertEquals(0, mc.modulusIntegers(2,0));
	}
	@Test
	void testExpectedExceptionWhenDivideByZero() {

	}
}
