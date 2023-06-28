package day3;

import java.util.*;

class N2 {
	public int solution(int[] keypad, String password) {
		int answer = 0;
		int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
		int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

		int[][] pad = new int[3][3];
		int[][] dist = new int[10][10];
		for (int i = 0; i < keypad.length; i++) {
			pad[i / 3][i % 3] = keypad[i];

		}
		for (int i = 0; i < 10; i++) {
			Arrays.fill(dist[i], 2);
		}
		for (int i = 0; i < 10; i++)
			dist[i][i] = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int from = pad[i][j];
				for (int k = 0; k < 8; k++) {
					if (i + dx[k] >= 0 && i + dx[k] < 3 && j + dy[k] >= 0 && j + dy[k] < 3) {
						int to = pad[i + dx[k]][j + dy[k]];
						dist[from][to] = 1;
					}
				}
			}
		}
		for (int i = 1; i < password.length(); i++) {
			int from = (int) password.charAt(i - 1) - 48;
			int to = (int) password.charAt(i) - 48;
			answer += dist[from][to];
		}

		return answer;
	}

	public static void main(String[] args){
		N2 T = new N2();
		System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}


/*2*2�迭
 * ����Ʈ 0���� �ʱ�ȭ
 * 2���� 5����
 * �ƽ�Ű�� ���ڿ��� ���ڿ��� �ص���
 * 
 * pad 33Ű�е�  dist 1010Ű�е� 2���� ����
 * 2��for�� 33�е� ����
 * 00 01 02    2 5 3 ��
 * 10 11 12    7 1 6
 * 20 21 22    4 9 8
 * 
 * 2�� ä��� �밢���� 0���� ä��
 * pad������ ���ڷ� ���� 2�� 1�� �ٲ�
 * 8������ ���鼭 0����ũ�ų� 3����ũ�ٸ�(���)�̸�
 * -�̸�
 * ���ڸ� 1�� 9�� ����
 * �ƽ�Ű 0�� 48 
 */

