package Pr4;

public class P19 { //클래스 선언

	public static void main(String[] args) {
		for (int k20_i = 1; k20_i < 13; k20_i++) {
		//정수i를 정의하고 1로 초기화, i가 1부터 12될때까지 루프, i는 루프1회마다 1씩증가
			System.out.printf("%d월 =>", k20_i);	//i를 출력
			for (int k20_j = 1; k20_j < 32; k20_j++) {	
			//정수j를 정의하고 1로 초기화, j가 1부터 31될때까지 루프,j는 루프1회마다 1씩증가

				System.out.printf("%d,", k20_j);	//j를 출력

				if ((k20_i == 4 || k20_i == 6 || k20_i == 9 || k20_i == 11 || k20_i == 7) && (k20_j == 30))
					break;
				//만약 i가 4 or 6 of 7 or 9 or 9 or 11이고 동시에 j가 30이라면 루프를 멈춘다.
				if (k20_i == 2 && k20_j == 28)
				break;
				//만약 i가 2이고 동시에 j가 28이면 루프를 멈춘다

			}
			System.out.println();	//줄바꿈
		}

	}

}
///////////////////////////////////////////////////////////////
//숙련되면 위의 코드 사용
//if(k20_i == 4|| k20_i==6 || k20_i==7 || k20_i==11) {
//	if(k20_j==30) break;
//}
//
//if(k20_i==2) {
//	if(k20_j==28) break;
//}