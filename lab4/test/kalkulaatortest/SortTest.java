package kalkulaatortest;

import static org.junit.Assert.*;
import org.junit.Test;
import kalkulaator.Sort;
import java.util.Arrays;

public class SortTest {
	@Test
	public void test() {
		assertEquals("Error", Arrays.asList(), Sort.sort(new int[] {}));
		assertEquals("Error", Arrays.asList(3), Sort.sort(new int[] { 3 }));
		assertEquals("Error", Arrays.asList(-8, 7),
				Sort.sort(new int[] { 7, -8 }));
		assertEquals("Error", Arrays.asList(-8, 7),
				Sort.sort(new int[] { -8, 7 }));
		assertEquals("Error", Arrays.asList(4, 5, 6),
				Sort.sort(new int[] { 4, 5, 6 }));
		assertEquals("Error", Arrays.asList(4, 5, 6),
				Sort.sort(new int[] { 4, 6, 5 }));
		assertEquals("Error", Arrays.asList(4, 5, 6),
				Sort.sort(new int[] { 5, 4, 6 }));
		assertEquals("Error", Arrays.asList(4, 5, 6),
				Sort.sort(new int[] { 5, 6, 4 }));
		assertEquals("Error", Arrays.asList(4, 5, 6),
				Sort.sort(new int[] { 6, 4, 5 }));
		assertEquals("Error", Arrays.asList(4, 5, 6),
				Sort.sort(new int[] { 6, 5, 4 }));
		assertEquals("Error", Arrays.asList(-2, 5, 15, 200),
				Sort.sort(new int[] { -2, 5, 200, 15 }));
		assertEquals("Error", Arrays.asList(-28, -4, 0, 1, 2, 9, 15, 144),
				Sort.sort(new int[] { -28, 1, 144, 2, 9, 0, -4, 15 }));
	}
}