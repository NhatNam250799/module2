package BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class Chuoilientiepcododailonnhat {
	public static int findLongestIncreasingSubsequence(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int maxLength = 1;
		int currentLength = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				currentLength++;
				maxLength = Math.max(maxLength, currentLength);
			} else {
				currentLength = 1;
			}
		}

		return maxLength;
	}

	public static List<Integer> getLongestIncreasingSubsequence(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new ArrayList<>();
		}

		int maxLength = 1;
		int currentLength = 1;
		int endIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				currentLength++;
				if (currentLength > maxLength) {
					maxLength = currentLength;
					endIndex = i;
				}
			} else {
				currentLength = 1;
			}
		}

		List<Integer> result = new ArrayList<>();
		for (int i = endIndex - maxLength + 1; i <= endIndex; i++) {
			result.add(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 15, 25, 30, 5, 7, 9 };

		int length = findLongestIncreasingSubsequence(arr);
		List<Integer> subsequence = getLongestIncreasingSubsequence(arr);

		System.out.println("Độ dài chuỗi liên tiếp tăng dài nhất: " + length);
		System.out.println("Chuỗi liên tiếp: " + subsequence);
	}

}
