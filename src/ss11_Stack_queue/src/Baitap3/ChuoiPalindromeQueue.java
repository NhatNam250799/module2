package Baitap3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ChuoiPalindromeQueue {
	public static void main(String[] args) {
		String input = "PaPa";
		System.out.println("Chuỗi: " + input + " là Palindrome: " + isPalindrome(input));
		input = "Hello";
		System.out.println("Chuỗi: " + input + " là Palindrome: " + isPalindrome(input));
	}

	public static boolean isPalindrome(String input) {
		input = input.replaceAll("\\s+", "").toLowerCase();
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		for (char c : input.toCharArray()) {
			stack.push(c);
			queue.add(c);
		}
		while (!stack.isEmpty() && !queue.isEmpty()) {
			if (!stack.pop().equals(queue.poll())) {
				return false;
			}
		}

		return true;
	}

}
