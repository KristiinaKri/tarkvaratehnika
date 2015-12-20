package kalkulaator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
	public static int Add(String numbers) {
		int sum = 0;
		String[] numbersArray = numbers.split(",|;");
		if (numbers.isEmpty()) {
			return 0;
		}
		for (String number : numbersArray) {
			if (number.equals("")) {
				List<String> list = new ArrayList<>(Arrays.asList(numbersArray));
				list.remove(number);
				numbersArray = list.toArray(new String[0]);
			}
		}
		if (numbersArray.length > 2) {
			System.out.println("Too many numbers!");
			return -1;
		}
		for (String number : numbersArray) {
			if (!number.isEmpty()) {
				if (!number.matches("[0-9-]+")) {
					System.out.println("Not a number!");
					return -1;
				}
				if (Integer.parseInt(number) < 0) {
					System.out.println("Negative number!");
					return -1;
				} else {
					sum += Integer.parseInt(number);
				}
			}
		}
		// for (int i = 0; i < numbersArray.length; i++) {
		// System.out.println(numbersArray[i]);
		// }
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Add("1,2,3,4,5"));
		System.out.println(Add("-2,6"));
		System.out.println(Add("2,6"));
		System.out.println(Add(",2,6"));
		System.out.println(Add("0;4"));
		System.out.println(Add(",3"));
		System.out.println(Add(""));
	}
}