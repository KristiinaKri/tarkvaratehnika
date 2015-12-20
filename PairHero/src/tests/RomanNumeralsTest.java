package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import numberGenerator.RomanNumerals;

public class RomanNumeralsTest {
	@Test
	public void numbersTest() {
		String romanNum = "";
		romanNum = RomanNumerals.numbers(1);
		assertEquals("i", romanNum);
		romanNum = RomanNumerals.numbers(2);
		assertEquals("ii", romanNum);
		romanNum = RomanNumerals.numbers(3);
		assertEquals("iii", romanNum);
		romanNum = RomanNumerals.numbers(4);
		assertEquals("iv", romanNum);
		romanNum = RomanNumerals.numbers(5);
		assertEquals("v", romanNum);
		romanNum = RomanNumerals.numbers(9);
		assertEquals("ix", romanNum);
		romanNum = RomanNumerals.numbers(12);
		assertEquals("xii", romanNum);
		romanNum = RomanNumerals.numbers(20);
		assertEquals("xx", romanNum);
		romanNum = RomanNumerals.numbers(40);
		assertEquals("xl", romanNum);
	}
}