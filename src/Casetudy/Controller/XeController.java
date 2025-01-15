package Controller;

import java.util.Scanner;

import Service.IXeMayService;
import Service.IXeOToService;
import Service.IXeTaiService;

public class XeController {
	public static void showProductMenu() {
		Scanner scanner = new Scanner(System.in);
		IXeOToService oTo = new IXeOToService();
		IXeMayService xeMay = new IXeMayService();
		IXeTaiService xeTai = new IXeTaiService();
		int choose = 0;

		while (true) {
			System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG--" + "\n" + "  Chọn chức năng:" + "\n"
					+ "  1. Thêm mới phương tiện" + "\n" + "  2. Hiển thị phương tiện" + "\n" + "  3. Xóa phương tiện"
					+ "\n" + "  4. Thoát");
			choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
			case 1:
				System.out.println("   Thêm mới phương tiện:" + "\n" + "   1. Thêm xe tải" + "\n" + "   2. Thêm ô tô"
						+ "\n" + "   3. Thêm xe máy");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
				case 1:
					if (!xeTai.addXe()) {
						System.out.println("Thêm xe tải thất bại");
					} else {
						System.out.println("Thêm xe tải thành công");
					}
					break;
				case 2:
					if (!oTo.addXe()) {
						System.out.println("Thêm ô tô thất bại");
					} else {
						System.out.println("Thêm ô tô thành công");
					}
					break;
				case 3:
					if (!xeMay.addXe()) {
						System.out.println("Thêm xe máy thất bại");
					} else {
						System.out.println("Thêm xe máy thành công");
					}
					break;
				}
				break;
			case 2:
				System.out.println("   Hiển thị phương tiện:" + "\n" + "   1. Hiển thị xe tải" + "\n"
						+ "   2. Hiển thị ô tô" + "\n" + "   3. Hiển thị xe máy");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
				case 1:
					xeTai.showXe();
					break;
				case 2:
					oTo.showXe();
					break;
				case 3:
					xeMay.showXe();
					break;
				}
				break;
			case 3:
				System.out.println("   Xóa phương tiện:" + "\n" + "   1. Xóa xe tải" + "\n" + "   2. Xóa ô tô" + "\n"
						+ "   3. Xóa xe máy");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
				case 1:
					if (!xeTai.addXe()) {
						System.out.println("Xóa xe tải thất bại");
					} else {
						System.out.println("Xóa xe tải thành công");
					}
					break;
				case 2:
					if (!oTo.addXe()) {
						System.out.println("Xóa ô tô thất bại");
					} else {
						System.out.println("Xóa ô tô thành công");
					}
					break;
				case 3:
					if (!xeMay.addXe()) {
						System.out.println("Xóa xe máy thất bại");
					} else {
						System.out.println("Xóa xe máy thành công");
					}
					break;
				}
				break;
			case 4:
				System.out.println("Thoát");
				System.exit(0);
			}
		}
	}
}
