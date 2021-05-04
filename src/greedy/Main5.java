package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Main5 {
	public static int[] parent;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };
		System.out.println(solution(4, arr));
	}

	public static int solution(int n, int[][] costs) {
		// costs[i][0] 와 costs[i] [1]에는 다리가 연결되는 두 섬의 번호가 들어있고
		// costs[i] [2] = cost

		Arrays.sort(costs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {

				return o1[2] - o2[2];
			}
		});
		int answer = 0;
		parent = new int[n];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < costs.length; i++) {
			int first = find(costs[i][0]);
			int second = find(costs[i][1]);
			if (first != second) {
				parent[second] = first;
				answer = answer + costs[i][2];
			}

		}

		return answer;
	}

	public static int find(int n) {
		if (parent[n] == n) {
			return n;
		} else {
			return parent[n] = find(parent[n]);
		}
	}
}
