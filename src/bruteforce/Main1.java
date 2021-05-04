package bruteforce;

import java.util.HashSet;

public class Main1 {

	public static void main(String[] args) {
System.out.println((int)Math.sqrt(24));	
		
	}

	public static int solution(String numbers) {
		int answer = 0;
		HashSet<Integer> hs = new HashSet<>();
		permutation("", numbers, hs);
		while (hs.iterator().hasNext()) {
			int target = hs.iterator().next();
			hs.remove(target);
			if (target == 2)
				answer++;
			if (target % 2 != 0 && isPrime(target)) {
				answer++;
			}
		}

		return answer;
	}

	public static void permutation(String prefix, String str, HashSet<Integer> set) {
		int n = str.length();
		if (!prefix.equals("")) {
			set.add(Integer.valueOf(prefix));  
			System.out.println("addd "+prefix);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("comb "+prefix+str.charAt(i)+":"+str.substring(0, i) + str.substring(i + 1, n));
			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
		}

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
