package greedy;

import java.util.ArrayList;
import java.util.HashSet;

public class Main2 {
	public static void main(String[] args) {

	}

	public static String solution(String number, int k) {
		
		int resultLen = number.length() - k;
		int idx = 0;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < resultLen; i++) {
			int max = 0;
			for (int j = idx; j <= k + i; j++) {
				if (max < number.charAt(j) - '0') {
					max = number.charAt(j) - '0';
					idx = j + 1;
				}

			}
			sb.append(max);
		}

		return sb.toString();
	}

}
