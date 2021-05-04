package stacknq;

import java.util.LinkedList;
import java.util.Queue;

public class Main3 {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 9, 1, 1, 1 };
		System.out.println(solution(arr, 0));

	}

	static class Print {
		int v;
		int idx;

		public Print(int v, int idx) {
			this.v = v;
			this.idx = idx;

		}

	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		LinkedList<Print> q = new LinkedList<Print>();
		for (int i = 0; i < priorities.length; i++) {
			q.add(new Print(priorities[i], i));
		}
		int count = 0;
		while (!q.isEmpty()) {
			Print first = q.poll();
			boolean max = true;
			for (int i = 0; i < q.size(); i++) {
				if (first.v < q.get(i).v) {
					q.offer(first);
					for (int j = 0; j < i; j++) {
						q.offer(q.poll());
						// System.out.println(first.idx + ":" + first.v);
					}
					max = false;
					break;

				}

			}
			if (!max) {
				continue;
			}
			count++;

			if (first.idx == location) {

				return count;

			}

		}

		return count;
	}

}
