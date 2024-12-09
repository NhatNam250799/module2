package BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập phần tử của mảng: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Phần tử thứ n: " + (i + 1));
			array[i] = sc.nextInt();

		}
		System.out.println("Thêm phần tử vào mảng: ");
		int value = sc.nextInt();
		System.out.println("Thêm phần tử vào mảng từ 0 đến: " + n);
		int add = sc.nextInt();
		if (add < 0 || add > n) {
			System.out.println("Vị trí không hợp lệ: ");

		} else {
			int[] newArray = new int[n + 1];
			for (int i = 0, j = 0; i < newArray.length; i++) {
				if (i == add) {
					newArray[i] = value;
				} else {
					newArray[i] = array[j];
					j++;
				}
			}
			System.out.println("Mảng sau khi thêm giá trị: ");
			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i] + " ");

			}
		}
		sc.close();
	}
}
