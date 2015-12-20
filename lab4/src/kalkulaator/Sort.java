package kalkulaator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
	public static List<Integer> sort(int[] integers) {
		List<Integer> sorted = new ArrayList<>();
		Arrays.sort(integers);
		for (int integer : integers) {
			sorted.add(integer);
		}
		return sorted;
	}

	public static void main(String[] args) {
		System.out.println(sort(new int[] {}));
		System.out.println(sort(new int[] { 3 }));
		System.out.println(sort(new int[] { 7, -8 }));
		System.out.println(sort(new int[] { -8, 7 }));
		System.out.println(sort(new int[] { 4, 5, 6 }));
		System.out.println(sort(new int[] { 4, 6, 5 }));
		System.out.println(sort(new int[] { 5, 4, 6 }));
		System.out.println(sort(new int[] { 5, 6, 4 }));
		System.out.println(sort(new int[] { 6, 4, 5 }));
		System.out.println(sort(new int[] { 6, 5, 4 }));
		System.out.println(sort(new int[] { -2, 5, 200, 15 }));
		System.out.println(sort(new int[] { -28, 1, 144, 2, 9, 0, -4, 15 }));
	}
}