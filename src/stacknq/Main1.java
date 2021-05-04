package stacknq;

public class Main1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 3 };

		int[] anw = solution(arr);
		
		for (int i = 0; i < anw.length; i++) {
			System.out.print(anw[i] + " ");
		}
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] <= prices[j]) {
					count++;
					answer[i] = count;

				} else {
					count++;
					answer[i] = count;
					break;
				}
			}
		}

		return answer;
	}

}
