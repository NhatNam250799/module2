package BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
	private static final String[] UNITS = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
	private static final String[] TENS = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
			"bảy mươi", "tám mươi", "chín mươi" };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên: ");
		long number = scanner.nextLong();

		String result = convertNumberToWords(number);
		System.out.println("Số thành chữ: " + result);

		scanner.close();
	}

	private static String convertNumberToWords(long number) {
		if (number == 0)
			return "không";
		if (number < 0)
			return "âm " + convertNumberToWords(-number);

		StringBuilder words = new StringBuilder();
		int unitIndex = 0;

		while (number > 0) {
			int part = (int) (number % 1000);
			if (part != 0) {
				words.insert(0, convertPart(part) + " " + getUnit(unitIndex) + " ");
			}
			number /= 1000;
			unitIndex++;
		}

		return words.toString().trim().replaceAll("\\s+", " ");
	}

	private static String convertPart(int number) {
		StringBuilder part = new StringBuilder();

		int hundreds = number / 100;
		int tens = (number % 100) / 10;
		int units = number % 10;

		if (hundreds > 0) {
			part.append(UNITS[hundreds]).append(" trăm");
			if (tens == 0 && units > 0) {
				part.append(" linh");
			}
		}

		if (tens > 0) {
			part.append(" ").append(TENS[tens]);
		}

		if (units > 0) {
			if (tens > 1 && units == 5) {
				part.append(" lăm");
			} else if (tens > 0 || hundreds > 0) {
				part.append(" ").append(UNITS[units]);
			} else {
				part.append(UNITS[units]);
			}
		}

		return part.toString().trim();
	}

	private static String getUnit(int index) {
		switch (index) {
		case 1:
			return "nghìn";
		case 2:
			return "triệu";
		case 3:
			return "tỷ";
		case 4:
			return "nghìn tỷ";
		case 5:
			return "triệu tỷ";
		case 6:
			return "tỷ tỷ";
		default:
			return "";
		}
	}
}
