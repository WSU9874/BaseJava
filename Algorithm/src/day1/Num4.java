package day1;

import java.util.HashMap;

//class Num4 {
//	public int solution(String s){
//		
//		
//		int answer = 0;
//		
//
//		int n = s.length();
//		char [] alphabet = new char[26];
//		for(int i =0; i < n;i++) {
//			alphabet[i] = s.charAt(i);			
//		}
//		
//		
//		
//		
//		HashMap<String, Integer> hm = new HashMap<>();
//		for(String key : alphabet) hm.put(key,hm.getOrDefault(key,0)+1);
//
//
//		return answer;
//	}
class Num4 {
	public int solution(String s) {
		HashMap<Character, Integer> sH = new HashMap<>();
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);

		}
		for (int i = 0; i < s.length(); i++) {
			if (sH.get(s.charAt(i)) == 1)
				return i + 1;
		}
		return -1;
	}
	
	
	public static void main(String[] args){
		Num4 T = new Num4();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}