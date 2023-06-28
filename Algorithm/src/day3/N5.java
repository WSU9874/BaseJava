package day3;

import java.util.*;

class N5 {
	public int solution(int[] nums) {
		int answer = 0;
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] <= 5) {
				answer++;
				left++;
				right--;
			} else {
				answer++;
				right--;
			}
		}

		return answer;
	}

	public static void main(String[] args){
		N5 T = new N5();
		System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
		System.out.println(T.solution(new int[]{2, 3, 4, 5}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
	}
}

/*정렬
* 처음과 끝 인덱스 확인
* 5넘으면 인덱스 1넘김
* 
*
*2 5  3 4 2 3
*2 2 3 3 4 5
*
*인덱스
*0 1 2 3 4 5
*
*2 5 더한게 5보다 작냐
*아니다
*answer 1더함
*right는 1뺌
*다시 루프
*
* 2 left    4right
* 아니다
* 1더하고
* 1뺌
* 
* 이런식으로 left right가 따로 인덱스를 확인한다
* 
* 
*
*/