package BaiTap2;

import java.util.Stack;

public class HethapphansanghenhiphanStack {
	public static void main(String[] args) {
		int decimalNumber = 19;
		System.out.println("Sô thập phân: " + decimalNumber);
		System.out.println("Số nhị phân: " + decimalToBinary(decimalNumber));
	}

	public static String decimalToBinary(int decimalNumber) {
		Stack<Integer> stack = new Stack<>();
		while (decimalNumber > 0) {
			int remainder = decimalNumber % 2;
			stack.push(remainder);
			decimalNumber = decimalNumber / 2;

		}
		StringBuilder binaryNumber = new StringBuilder();
		while (!stack.isEmpty()) {
			binaryNumber.append(stack.pop());
		}
		return binaryNumber.toString();

	}
}
