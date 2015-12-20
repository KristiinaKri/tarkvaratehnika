package kalkulaatortest;

import static org.junit.Assert.*;
import org.junit.Test;
import kalkulaator.Factorial;

public class FactorialTest {
	@Test
	public void test() {
		assertEquals("Result is different than expected", 1,
				Factorial.factorial(1));
		assertEquals("Result is different than expected", 2,
				Factorial.factorial(2));
		assertEquals("Result is different than expected", 6,
				Factorial.factorial(3));
	}
}