package greedy;

public class Main1 {

	public static void main(String[] args) {

		System.out.println((int) 'J' - (int) 'A');
		System.out.println((int) 'Z' - (int) 'J');
		System.out.println(solution("JEROEN"));
	}

	public static int solution(String name) {
		int count = 0;

		int min = name.length() - 1;

		for (int i = 0; i < name.length(); i++) {
			char temp = name.charAt(i);
			System.out.println("count" + counter(temp));
			count = count + counter(temp);
			int next = i + 1;
			while (next < name.length() && name.charAt(next) == 'A')
				next++;

			System.out.println("min1 " + min);
			System.out.println("min2 " + (i + i + (name.length() - next)));
			min = Math.min(min, (i + name.length() - next + i));

		}
		System.out.println("min" + min);
		count = count + min;

		return count;
	}

	public static int counter(char val) {
		int tempVal = (int) val;
		int count = 0;
		if (tempVal - (int) 'A' > (int) ('Z' - tempVal) + 1) {// 뒤가 가까우니까 뒤로
			count = (int) 'Z' - tempVal + 1;
		} else {// 앞이 가까움
			count = tempVal - (int) 'A';
		}
		return count;
	}

}
