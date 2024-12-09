package BaiTap;

import java.util.Scanner;

public class GopMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập kích thước mảng 1:");
		int size1 = Integer.parseInt(sc.nextLine());
		int[] array1 = new int[size1];
		System.out.println("Nhập các phần tử mảng 1:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Nhập phần tử " + (i + 1) + " :");
			array1[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Nhập kích thước mảng 2:");
		int size2 = Integer.parseInt(sc.nextLine());
		int[] array2 = new int[size2];
		System.out.println("Nhập các phần tử mảng 2:");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Nhập phần tử " + (i + 1) + " :");
			array2[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Mảng 1:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("Mảng 2:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		int[] array3 = new int[size1 + size2];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[array1.length + i] = array2[i];
		}
		System.out.println("Mảng 3:");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
	}
}
