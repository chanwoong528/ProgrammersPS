package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 4 };
		int arr2[] = { 3 };
		int arr3[] = { 2, 4 };
		int arr4[] = { 1, 3, 5 };
		int arr5[] = { 1, 2, 3 };
		int arr6[] = { 2, 3, 4 };
		// System.out.println(solution(5, arr1, arr2));
		// System.out.println(solution(5, arr3, arr4));
		System.out.println(solution(5, arr5, arr6));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int total = n;
		
		ArrayList<Integer> los = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < lost.length; i++) {
			los.add(lost[i]);
		}
		for (int i = 0; i < reserve.length; i++) {
			res.add(reserve[i]);
		}
		for (int i = 0; i < reserve.length; i++) {
			if (los.contains(reserve[i])) {
				los.remove(los.indexOf(res.get(i)));
			}
		}
		for (int i = 0; i < lost.length; i++) {
			if (res.contains(lost[i])) {
				res.remove(res.indexOf(lost[i]));
			}
		}
		System.out.println(res.toString());
		System.out.println(los.toString());
		
		int able = total - los.size();

		for (int i = 0; i < los.size(); i++) {

			if (total == able) {
				break;
			}

			int plus = los.get(i) + 1;
			int minus = los.get(i) - 1;

			if (res.contains(plus)) {
				res.remove(res.indexOf(plus));
				System.out.println("plusremoved");
				able++;

			}
			if (res.contains(minus)) {
				res.remove(res.indexOf(minus));
				System.out.println("minusremoved");
				able++;

			}
			System.out.println("count " + able);
		}

		return able;
	}
}
