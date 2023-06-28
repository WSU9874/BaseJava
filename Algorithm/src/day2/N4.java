package day2;

import java.util.*;

class N4 {
	public int solution(int[] nums, int m) {
		int answer = 0;
		HashMap<Integer, Integer> nH = new HashMap<>();
		int sum = 0;
		nH.put(0, 1);
		for (int x : nums) {
			sum += x;
			 System.out.println("sum = "+(sum));
			if (nH.containsKey(sum - m)) {
				// System.out.println("sum-m =" + (sum-m));
				answer += nH.get(sum - m);
				// System.out.println("answer =" + answer);
			}
			nH.put(sum, nH.getOrDefault(sum, 0) + 1);
			// System.out.println("nH ="+nH);
		}

		return answer;
	}

	public static void main(String[] args){
		N4 T = new N4();
		System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));	
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));	
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));	
		System.out.println(T.solution(new int[]{-1, 0, 1}, 0));	
		System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));	
	}
}



//sum num[i] ´©ÀûÇÕ
//

//k = sum - M