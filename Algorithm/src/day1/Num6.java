package day1;

import java.util.*;

class Num6 {
	public int solution(String s) {
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		HashSet<Integer> ch = new HashSet<>();
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		// System.out.println("sh = " + sH);
		for (char key : sH.keySet()) {
			// System.out.println("key = " + key);
			while (ch.contains(sH.get(key))) {
				// System.out.println(ch.contains(sH.get(key)));
				answer++;
				// System.out.println("answer =" + answer);
				sH.put(key, sH.get(key) - 1);
				// System.out.println("sH = " +sH);
			}
			if (sH.get(key) == 0)
				continue;
			ch.add(sH.get(key));
		}
		return answer;
	}

	public static void main(String[] args) {
		Num6 T = new Num6();
		System.out.println(T.solution("aaabbbcc"));
		System.out.println(T.solution("aaabbc"));
		System.out.println(T.solution("aebbbbc"));
		System.out.println(T.solution("aaabbbcccde"));
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));
	}
}