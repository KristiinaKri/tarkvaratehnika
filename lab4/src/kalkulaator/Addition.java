package kalkulaator;

public class Addition {
	public static int addition(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			if (number < 0) {
				continue;
			}
			if (number % 2 == 0) {
				sum += number;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(addition(new int[] { 1, 2, 4 }));
		System.out.println(addition(new int[] { 2 }));
		System.out.println(addition(new int[] { 3, 4, 7 }));
		System.out.println(addition(new int[] { -2, -5, 2, 5, 8 }));
		System.out.println(addition(new int[] { 1, 2, 12, 13 }));
		System.out.println(addition(new int[] { -2, -4, 1, 2, 6, 20 }));
	}
}