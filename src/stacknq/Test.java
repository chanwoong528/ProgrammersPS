package stacknq;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 2, 2, 2, 1, 1, 1, 1, 1 };
		System.out.println(solution(5, 5, arr));
	}

	private static class Truck {
		int w, t;

		Truck(int w, int t) {
			this.w = w;
			this.t = t;
		}
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int cur_weight = 0, t = 1;
		LinkedList<Truck> queue = new LinkedList<Truck>();
		for (int w : truck_weights) {
			cur_weight += w;
			while (!queue.isEmpty() && cur_weight > weight) {
				Truck truck = queue.poll();
				System.out.println("out" +truck.w);
				cur_weight -= truck.w;
				t = truck.t + bridge_length;
			}

			Truck truckTest = new Truck(w, t++);
			System.out.println("in truck" + truckTest.w);
			queue.offer(truckTest);

		}

		Truck truck = queue.poll();
		System.out.println("out" + truck.w);
		while (!queue.isEmpty()) {
			truck = queue.poll();
			System.out.println("out" + truck.w);
		}
		return truck.t + bridge_length;
	}
}
