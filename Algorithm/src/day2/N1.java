package day2;

import java.util.*;

class N1 {
	public int[] solution(int c, int r, int k) {
		int[] answer = new int[2];	//���� �迭 2ĭ¥�� ����
		if (k > c * r)				//�� Ƚ���� �迭�� ũ�⺸�� ũ�� 00�� ��ȯ
			return new int[] { 0, 0 };	
		int[][] seat = new int[c][r];	//c*r�迭 ����
		int[] dx = { -1, 0, 1, 0 };		//���� �迭 ����
		int[] dy = { 0, 1, 0, -1 };	
		int x = 0, y = 0, count = 1, d = 1;		//���� �ʱ�ȭ
		while (count < k) {						//kȸ �ݺ�
			int nx = x + dx[d];					
			int ny = y + dy[d];
			
			if (nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] > 0) {
				// nx,y�� ���� / �迭ũ�� ����� / count�� 0���� ũ�� ���� ��ȯ
				d = (d + 1) % 4;
				continue;
			}
			seat[x][y] = count;		//���� ��ο�  count �ο�
			count++;
			x = nx;		//���� ��ȯ ���ϸ� x,y�� �� ����
			y = ny;
		}
		answer[0] = x + 1;	//
		answer[1] = y + 1;
		return answer;
	}

	public static void main(String[] args) {
		N1 T = new N1();
		System.out.println(Arrays.toString(T.solution(6, 5, 10)));
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
	}
}

//int[] answer = new int[2];
//int[][] seat = new int[r][c];
//int[] dx = { -1, 0, 1, 0 };
//int[] dy = { 0, 1, 0, -1 };
//int x = 1, y = 1, d = 1, cnt = 0;
//while (cnt < k) {
//	cnt++;
//	int nx = x + dx[d];
//	int ny = y + dy[d];
//	if (nx < 0 || nx >= r || ny < 0 || ny >= c || seat[nx][ny] > 1) {
//		d = (d + 1) % 4;
//		continue;
//	}
//	x = nx;
//	y = ny;
//	
//	answer[0] = x;
//	answer[1] = y;
//}
//
//return answer;
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
