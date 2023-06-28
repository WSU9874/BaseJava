package day3;

import java.util.*;

//class N4 {
//	public int[] solution(int[] nums) {
//		int[] answer = new int[nums.length];
//		// ArrayList<Integer> ans = new ArrayList<>();
//
//		Arrays.sort(nums);
//		answer[0] = nums[0];
//		// ans.add(nums[0]);
//		for (int i = 1; i < nums.length; i++) {
//			if (nums[i] % 2 == 1) {
//				answer[i] = nums[i];
//
//				// ans.add(nums[i]);
//
//			}
//
//		}
//
//		return answer;
//	}
	

class N4{
	public int[] solution(int[] nums) {
		int[] answer = new int[nums.length / 2];
		HashMap<Integer, Integer> nH = new HashMap<>();
		for(int x : nums) nH.put(x,  nH.getOrDefault(x, 0)+1);
		Arrays.sort(nums);
		int idx = 0;
		for(int x : nums) {
			if(nH.get(x) ==0)continue;
			answer[idx]=x;
			idx++;
			nH.put(x,nH.get(x)-1);
			nH.put(x*2, nH.get(x*2)-1);
		}
		return answer;
	}

	
	
	

	public static void main(String[] args){
		N4 T = new N4();
		System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
	}
}

/* 
 * 1 10 2 3 5 6에서 어떤건 선생 /현수는 *2
 * 가장작은값은 선생님꺼
 * 오름차순으로 정렬해보면 보인다
 * 1 2 3 4 5 10
 * 
 * 1   3   5
 * 
 * 
 * 
 * 1 1 6 2 2 7 3 14
 * 
 * 1 1 2 2 3 6 7 14
 * map생성
 * nh에 키에 요소들 밸류에 중복이면 1 아니면 0
 * 
 * 1 2
 * 6 1
 * 2 2
 * 7 1
 * 14 1
 * 3 1
 * 맵 생성됨
 * 
 * nums로 반복
 * nh0개냐 컨티뉴
 * 최소값을 answer에 추가
 * 인덱스 올림
 * 
 * 
 * 
 */