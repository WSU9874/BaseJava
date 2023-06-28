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

/*����
* ó���� �� �ε��� Ȯ��
* 5������ �ε��� 1�ѱ�
* 
*
*2 5  3 4 2 3
*2 2 3 3 4 5
*
*�ε���
*0 1 2 3 4 5
*
*2 5 ���Ѱ� 5���� �۳�
*�ƴϴ�
*answer 1����
*right�� 1��
*�ٽ� ����
*
* 2 left    4right
* �ƴϴ�
* 1���ϰ�
* 1��
* 
* �̷������� left right�� ���� �ε����� Ȯ���Ѵ�
* 
* 
*
*/