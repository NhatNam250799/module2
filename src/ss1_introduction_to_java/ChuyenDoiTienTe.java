package BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double rate = 11255.0;
	        System.out.print("Nhập số tiền USD: ");
	        double usd = Double.parseDouble(scanner.nextLine());
	        double vnd = usd * rate;
	        System.out.println("Kết quả quy đổi :" + vnd + " VND.");
	    }
}
