package bruteforce;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		int result[] = solution(24, 24);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] solution(int brown, int yellow) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= yellow; i++) {
			if (yellow % i == 0) {

				list.add(i);

			}

		}

		int start = 0;
		int end = list.size() - 1;
		int[] answer = new int[2];
		while (start <= end) {
			if (((list.get(start) + 2) * (list.get(end) + 2)) - (list.get(start) * list.get(end)) == brown) {
				System.out.println("start" + start);
				System.out.println("end" + end);

				answer[0] = list.get(end) + 2;
				answer[1] = list.get(start) + 2;
				break;
			}
			start++;
			end--;

		}

		return answer;
	}
}
