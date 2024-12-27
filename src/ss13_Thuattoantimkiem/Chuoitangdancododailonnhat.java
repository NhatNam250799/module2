package BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class Chuoitangdancododailonnhat {
	public static int findLISLength(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			int pos = binarySearch(list, num);
			if (pos < list.size()) {
				list.set(pos, num);
			} else {
				list.add(num);
			}
		}
		return list.size();

	}

	private static int binarySearch(List<Integer> list, int num) {
		int low = 0, high = list.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (list.get(mid) >= num) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 15, 22, 30, 41, 55 };
		System.out.println("Tăng dần có độ dài lớn nhất: " + findLISLength(arr));
	}
}
