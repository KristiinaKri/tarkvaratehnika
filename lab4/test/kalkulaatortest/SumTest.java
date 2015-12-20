package kalkulaatortest;

import static org.junit.Assert.*;
import org.junit.Test;
import kalkulaator.Sum;

public class SumTest {
	@Test
	public void test() {
		assertEquals("Input limit reached", -1, Sum.Add("1,2,3,4"));
		assertEquals("Wrong result", 5, Sum.Add("2,3"));
		assertEquals("Wrong input", -1, Sum.Add("1,x"));
		assertEquals("Empty input", 0, Sum.Add(""));
		assertEquals("Wrong result", 3, Sum.Add(",3"));
		assertEquals("Wrong result", 5, Sum.Add("2,3"));
		assertEquals("Wrong result", 5, Sum.Add(",3,2"));
		assertEquals("Wrong input", 5, Sum.Add("2;3"));
		assertEquals("Negative number", -1, Sum.Add("2,-3"));
		// assertEquals("Input limit reached", 10, Sum.Add("1,2,3,4"));
	}
}