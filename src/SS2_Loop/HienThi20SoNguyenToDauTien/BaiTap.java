package HienThi20SoNguyenToDauTien;

public class BaiTap {
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 1) {
				return false;

			}

		}
		return true;

	}

	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		System.out.println("20 số nguyên tố đầu tiên là: ");
		while (count < 20) {
			if (isPrime(number)) {
				System.out.println(" " + number);
				count++;
			}
			number++;
		}
	}
}
