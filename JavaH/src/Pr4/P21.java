package Pr4;

public class P21 {

	public static void main(String[] args) {
		int[] k20_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//정수 배열 iLMD를 정의하고 배열에 숫자를 넣는다

		for (int k20_i = 1; k20_i < 13; k20_i++) {
			//변수 i를 정의하고 값을 1로 초기화한후 
			//1이 12될때까지 반복하고,i는 루프마다 1씩 증가
			System.out.printf("%d월 => ", k20_i);
			//변수i를 출력
			for (int k20_j = 1; k20_j < 32; k20_j++) {
			//변수 j를 정의하고 값을 1로 초기화한후 
			//1이 31될때까지 반복하고,j는 루프마다 1씩 증가
				System.out.printf("%d", k20_j);
				//j를 출력

				if (k20_iLMD[k20_i - 1] == k20_j)
					break;
				//만약 i-1이 j와 같다면 루프를 멈춘다

				System.out.print(".");
				//.을 출력한다
			}
			System.out.println();	//줄바꿈
		}

	}

}
