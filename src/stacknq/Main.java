package stacknq;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 2, 2, 2, 1, 1, 1, 1, 1};
		System.out.println(solution(5, 5 ,arr));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {

		Queue<Integer> q = new LinkedList<Integer>();
		int time = 0;
		int curWeight = 0;
		for (int i = 0; i < truck_weights.length; i++) {
			while (true) {
				if (q.isEmpty()) {
					 System.out.println("in trucke" + truck_weights[i]);
					q.add(truck_weights[i]);
					curWeight = curWeight + truck_weights[i];
					time++;
					// System.out.println("time" + time);
					break;
				} else if (q.size() == bridge_length) {
					int out = q.poll();
					 System.out.println((out==0?"":"out" + out));
					curWeight = curWeight - out;
				} else {
					if (curWeight + truck_weights[i] > weight) {
						 System.out.println("overWeight add 0");
						q.add(0);
						time++;
						// System.out.println("time" + time);

					} else {
						 System.out.println("in truckn" + truck_weights[i]);
						q.add(truck_weights[i]);
						curWeight = curWeight + truck_weights[i];

						time++;
						// System.out.println("time" + time);
						break;

					}
				}
			}

		}

		return time + bridge_length;
	}
}
