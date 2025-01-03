package BaiTap;

public class Thuattoansapxepchen {
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 5, 9, 1, 8 };
		System.out.println("Mảng trước khi sắp xếp: ");
		for (int num : arr) {
			System.out.println(" " + num);
		}
		insertionSort(arr);
		System.out.println("Mảng sau khi sắp xếp: ");
		for (int num : arr) {
			System.out.println(" " + num);
		}
	}
}