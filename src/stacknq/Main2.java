package stacknq;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {

	public static void main(String[] args) {
		int arr[] = { 95, 90, 99, 99, 80, 99 };
		int arr2[] = { 1, 1, 1, 1, 1, 1 };
		int[] result = solution(arr, arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
	public static int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> ratio = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			int temp = (100 - progresses[i]);
			if (temp % speeds[i] != 0) {
				q.add(temp / speeds[i] + 1);
			} else {
				q.add(temp / speeds[i]);
			}
		}
		int count = 1;
		int first = q.poll();
		while (!q.isEmpty()) {

			// System.out.println(first);

			if (q.peek() <= first) {

				q.poll();
				count++;

				// System.out.println("count:" + count);

			} else {
				ratio.add(count);
				first = q.poll();
				count = 1;
				// System.out.println("count:" + count);

			}

		}
		ratio.add(count);
		int[] answer = new int[ratio.size()];
		for (int i = 0; i < ratio.size(); i++) {
			answer[i] = ratio.get(i);
		}

		return answer;
	}

}
