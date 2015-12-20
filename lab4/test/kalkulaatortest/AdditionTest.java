package kalkulaatortest;

import static org.junit.Assert.*;
import org.junit.Test;
import kalkulaator.Addition;

public class AdditionTest {
	@Test
	public void test() {
		assertEquals("Error", 2, Addition.addition(new int[] { 2 }));
		assertEquals("Error", 12, Addition.addition(new int[] { 2, 4, 6 }));
		assertEquals("Error", 12,
				Addition.addition(new int[] { -2, -4, 2, 4, 6 }));
		assertEquals("Error", 12, Addition.addition(new int[] { 1, 2, 4, 6 }));
		assertEquals("Error", 12,
				Addition.addition(new int[] { -2, -4, 1, 2, 4, 6 }));
	}
}