package kalkulaatortest;

import static org.junit.Assert.*;
import org.junit.Test;
import kalkulaator.OnePlusOne;

public class OnePlusOneTest {
	@Test
	public void test() {
		assertEquals("Result is different then expected", 2,
				OnePlusOne.onePlusOne());
	}
}