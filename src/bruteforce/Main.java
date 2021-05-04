package bruteforce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 3, 1, 1, 1, 1, 2, 3, 4, 5 };
		int result[] = solution(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] solution(int[] answers) {
		int student1[] = { 1, 2, 3, 4, 5 };// 5
		int student2[] = { 2, 1, 2, 3, 2, 4, 2, 5 };// 8
		int student3[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };// 10

		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i % student1.length]) {
				result1++;
			}
			if (answers[i] == student2[i % student2.length]) {
				result2++;
			}
			if (answers[i] == student3[i % student3.length]) {
				result3++;
			}

		}
		System.out.println("res1:" + result1);
		System.out.println("res2:" + result2);
		System.out.println("res3:" + result3);
		int[] answer;
		if (result1 == 0 && result2 == 0 && result3 == 0) {
			answer = new int[0];
			return answer;
		} else {
			if (result1 == result2 && result1 == result3) {
				answer = new int[3];
				answer[0] = 1;
				answer[1] = 2;
				answer[2] = 3;
			} else if (result1 == result2 && result1 > result3) {
				answer = new int[2];
				answer[0] = 1;
				answer[1] = 2;
			} else if (result2 == result3 && result2 > result1) {
				answer = new int[2];
				answer[0] = 2;
				answer[1] = 3;
			} else if (result1 == result3 && result1 > result2) {
				answer = new int[2];
				answer[0] = 1;
				answer[1] = 3;
			} else {
				int max = Math.max(result1, Math.max(result2, result3));
				answer = new int[1];
				if (max == result1) {
					answer[0] = 1;
				} else if (max == result2) {
					answer[0] = 2;
				} else {
					answer[0] = 3;
				}

			}
		}

		return answer;
	}
}
