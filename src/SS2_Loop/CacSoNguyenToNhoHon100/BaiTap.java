package CacSoNguyenToNhoHon100;

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
		System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
		for (int number = 1; number < 100; number++) {
			if (isPrime(number)) {
				System.out.println(" " + number);
			}
		}
	}
}
