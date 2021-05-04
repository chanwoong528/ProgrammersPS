package greedy;

import java.util.Arrays;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 70, 50, 80, 50 };
		System.out.println(solution(arr, 100));
	}

	public static int solution(int[] people, int limit) {

		int result = 0;
		Arrays.sort(people);
		int min = 0;
		for (int i = people.length - 1; min <= i; i--) {
			if (people[i] + people[min] <= limit) {
				min++;
			}
			result++;
		}

		return result;
	}
}
