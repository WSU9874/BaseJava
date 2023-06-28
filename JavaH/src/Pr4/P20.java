package Pr4;

public class P20 {	//클래스선언

	public static void main(String[] args) {
		for (int k20_i = 1; k20_i < 13; k20_i++) {
		//변수 i를 정의하고 값을 1로 초기화한후 
		//1이 12될때까지 반복하고,i는 루프마다 1씩 증가
			System.out.print(k20_i + "월 => ");	//i를 출력
			LOOP: for (int k20_j = 1; k20_j < 32; k20_j++) {
				//변수 j를 정의하고 값을 1로 초기화한후 
				//1이 31될때까지 반복하고,j는 루프마다 1씩 증가 

				System.out.printf("%d.", k20_j);	//j를 출력

				switch (k20_i) {	//변수i에 대한 스위치문 선언
				case 4:		//변수i가 4인경우
				case 6:		//변수i가 6인경우
				case 9:		//변수i가 9인경우
				case 7:		//변수i가 7인경우
				case 11:	//변수i가 11인경우
					if (k20_j == 30)	//만약 j가 30이면 루프를 멈춘다
						break LOOP;
					break;	//루프를 멈춘다
				case 2:	//변수i가 2인경우
					if (k20_j == 28)	//만약j가 28이라면 루프를 멈춘다
						break LOOP;		
					break;	//루프를 멈춘다
				}

			}
			System.out.println();	//줄바꿈

		}
	}
}
