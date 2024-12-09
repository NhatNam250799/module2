package BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Phần tử lớn nhất trong mảng là: " + max);

		scanner.close();
	}
}
