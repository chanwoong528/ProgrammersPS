package greedy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("JEROEN"));
	}

	static public int solution(String name) {
		int answer = 0;

		int len = name.length();

		// �ִ�� ���� �� �ִ� min���� ������ ���°�
		int min_move = len - 1;

		for (int i = 0; i < len; i++) {
			System.out.println("count" + Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1));
			answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

			// �¿�: ���ӵ� A�� ���忡 ���� �ּ� �������� �޶�����
			int next = i + 1;// ���� ���� ��ġ����
			// �� ������ A��� ��� NEXT++
			while (next < len && name.charAt(next) == 'A')
				next++;

			System.out.println("min1 " + min_move);
			System.out.println("min2 " + (i + i + (name.length() - next)));

			min_move = Math.min(min_move, i + len - next + i);
		} // for

		answer += min_move;

		return answer;
	}

}
