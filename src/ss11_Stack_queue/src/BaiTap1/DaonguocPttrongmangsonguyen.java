package BaiTap1;

import java.util.Stack;

public class DaonguocPttrongmangsonguyen {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Mảng ban đầu: ");
		printArray(arr);
		reverseArray(arr);
		System.out.println("Mảng sau khi đảo ngược: ");
		printArray(arr);
	}

	public static void reverseArray(int[] array) {
		Stack<Integer> stack = new Stack<>();
		for (int num : array) {
			stack.push(num);

		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();

		}
	}

	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.println(" " + num);
		}
		System.out.println();

	}
}
