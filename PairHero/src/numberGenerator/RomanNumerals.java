package numberGenerator;

public class RomanNumerals {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println(numbers(i));
		}
		numbers(1);
	}

	public static String numbers(int number) {
		String roman = "";
		if (number <= 3) {
			for (int i = 0; i < number; i++) {
				roman += "i";
			}
		} else if (number <= 8 && number > 3) {
			roman = "v";
			if (number == 4)
				roman = "iv";
			for (int i = 5; i < number; i++) {
				roman += "i";
			}
		} else if (number == 9) {
			roman += "ix";
		} else if (number <= 19 && number > 9) {
			roman += "x";
			roman += numbers(number - 10);
		} else if (number <= 39 && number > 19) {
			roman += "x";
			roman += numbers(number - 10);
		} else if (number <= 49 && number > 39) {
			roman += "xl";
			roman += numbers(number - 40);
		}
		return roman;
	}
}