package day2;

import java.util.*;

class N1 {
	public int[] solution(int c, int r, int k) {
		int[] answer = new int[2];	//정답 배열 2칸짜리 생성
		if (k > c * r)				//총 횟수가 배열의 크기보다 크면 00을 반환
			return new int[] { 0, 0 };	
		int[][] seat = new int[c][r];	//c*r배열 생성
		int[] dx = { -1, 0, 1, 0 };		//방향 배열 생성
		int[] dy = { 0, 1, 0, -1 };	
		int x = 0, y = 0, count = 1, d = 1;		//변수 초기화
		while (count < k) {						//k회 반복
			int nx = x + dx[d];					
			int ny = y + dy[d];
			
			if (nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] > 0) {
				// nx,y가 음수 / 배열크기 벗어나면 / count가 0보다 크면 방향 전환
				d = (d + 1) % 4;
				continue;
			}
			seat[x][y] = count;		//정상 경로에  count 부여
			count++;
			x = nx;		//방향 전환 안하면 x,y에 값 대입
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
