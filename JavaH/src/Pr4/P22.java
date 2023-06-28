package Pr4;

public class P22 {

	public static void main(String[] args) {
		String[] k20_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		//문자열 배열 units를 정의하고 배열에 문자를 넣는다
		for (int k20_i = 0; k20_i < 101; k20_i++) {
			//변수 i를 정의하고 값을 0로 초기화한후 
			//0이 100될때까지 반복하고,i는 루프마다 1씩 증가

			if (k20_i >= 0 && k20_i < 10) {
				//만약 i가 0이상 10미만이면
				System.out.printf("일의자리 : %s\n", k20_units[k20_i]);
				//i번째 배열을 출력한다
			} else if (k20_i >= 10 && k20_i < 100) {
				//또한 만약 i가 10이상 100이만이면
				int k20_i10, k20_i0;	//정수 변수 i10,i0을 정의한다
				k20_i10 = k20_i / 10;	//i10은 i/10
				k20_i0 = k20_i % 10;	//i0은 i/10의 나머지
				if (k20_i0 == 0) {	//만약 i0가 0이면
					System.out.printf("십의자리 : %s십\n", k20_units[k20_i10]);
					//units배열의 i10번째 배열을 출력
				} else {	//그외에는
					System.out.printf("십의자리 : %s십%s\n", k20_units[k20_i10], k20_units[k20_i0]);
					//units배열의 i10번째 배열과 i0번째 배열을 출력
				}
			} else	//그 외에는
				System.out.printf("==> %d\n", k20_i);
			//i를 출력
		}
	}

}
