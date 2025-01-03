package LopIllegalTriangleException;

import java.util.Scanner;

public class Mian {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Nhập cạnh thứ nhất: ");
			double side1 = scanner.nextDouble();

			System.out.print("Nhập cạnh thứ hai: ");
			double side2 = scanner.nextDouble();

			System.out.print("Nhập cạnh thứ ba: ");
			double side3 = scanner.nextDouble();

			Triangle triangle = new Triangle(side1, side2, side3);
			System.out.println(triangle);

		} catch (IllegalTriangleException e) {
			System.out.println("Lỗi: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Đầu vào không hợp lệ.");
		}
	}
}
