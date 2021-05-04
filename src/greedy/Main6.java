package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { -20, 15 }, { -14, -5 }, { -18, -13 }, { -5, -3 } };

		System.out.println(solution(arr));
	}

	public static int solution(int[][] routes) {
		int answer = 0;
		Arrays.sort(routes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {

				return o1[1] - o2[1];
			}
		});

		ArrayList<int[]> list = new ArrayList<>();

		for (int i = 0; i < routes.length; i++) {
			int[] temp = new int[2];
			temp[0] = routes[i][0];
			temp[1] = routes[i][1];
			list.add(temp);

		}

		while (!list.isEmpty()) {
			int first = list.get(0)[1];

			for (int i = 0; i < list.size(); i++) {
				System.out.println("i"+i);
				
				if (first >= list.get(i)[0]) {
					
					System.out.println("first" + first);
					System.out.println("removed" + list.get(i)[0] + "  " + list.get(i)[1]);
					list.remove(i);
					i--;
					System.out.println("i"+i);
					for (int j = 0; j < list.size(); j++) {
						System.out.println("list left"+list.get(j)[0] + "  " + list.get(j)[1]);
					}

				}
			}
			answer++;
		}

		return answer;
	}
}
