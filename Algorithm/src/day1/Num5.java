package day1;

import java.util.*;
class Num5 {
//	public int[] solution(String s){
//		int[] answer = new int[5];
//
//		
//			HashMap<Character, Integer> sH = new HashMap<>();
//			for (char x : s.toCharArray()) {
//				sH.put(x, sH.getOrDefault(x, 0) + 1);
//
//			}
//			for (int i = 0; i < s.length(); i++) {
//				answer[i] = sH.get(s.charAt(i));
//					
//			}
//			return answer;
//		}
		
		
	public int[] solution(String s) {
		int[] answer = new int[5];
		HashMap<Character, Integer> sH = new HashMap<>();
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);

		}
		int max = Integer.MIN_VALUE;
		String tmp = "abcde";
		for (char key : tmp.toCharArray()) {
			if (sH.getOrDefault(key, 0) > max) {
				max = sH.getOrDefault(key, 0);
			}
		}
		for (int i = 0; i < tmp.length(); i++) {
			answer[i] = max - sH.getOrDefault(tmp.charAt(i), 0);

		}
		return answer;
	}
		
		
		
		
		
		
		

	public static void main(String[] args){
		Num5 T = new Num5();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
