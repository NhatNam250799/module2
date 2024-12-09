package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Mảng ban đầu" + Arrays.toString(arr));
		System.out.println("Nhập phần tử cần xóa: ");
		int element = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("Phần tử " + element + "không có trong mảng");
		} else {
			int[] newArray = new int[arr.length - 1];
			int index = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != element) {
					newArray[index] = arr[i];
					index++;
				}
			}
			System.out.println("Mảng sau khi xoá phần tử " + element + ": " + Arrays.toString(newArray));
		}
		sc.close();

	}
}
