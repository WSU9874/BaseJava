package Pr4;

public class P23 {

	public static void main(String[] args) {
		int k20_iNumVal = 2000000000;
		// iNumVal라는 int변수를 정의하고 값은 1001034567로 한다

		String k20_sNumVal = String.valueOf(k20_iNumVal);
		// 문자열 변수 sNumVal을 정의하고 정수변수 iNumVal을 문자열로 변환후 대입

		String k20_sNumVoice = "";
		// 문자열 변수 sNumVoice를 정의한다.

		System.out.printf("==> %s [%d자리]\n", k20_sNumVal, k20_sNumVal.length());
		// 변수 sNumVal와 그 변수의 길이를 출력

		int k20_i, k20_j; // 정수인 변수 i,j를 정의

		String[] k20_units = { "영", "", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 문자열 배열 units를 정의하고 문자를 배열에 넣는다.
		String[] k20_unitx = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 문자열 배열 units를 정의하고 문자를 배열에 넣는다.

		k20_i = 0; // i를 0으로 초기화
		k20_j = k20_sNumVal.length() - 1;
		// j를 문자열 sNumVal의 길이 -1로 초기화
		int k20_cnt = 0;

		while (true) { // 무한루프
			if (k20_i >= k20_sNumVal.length()) // 만약 정수 i가 문자열 sNumVal의 길이와 같다면 루프 종료
				break;
			if (k20_sNumVal.length() == 9 && k20_sNumVal.charAt(0) == '1') {
				// 만약 sNumVal의 길이가 9이고 첫번째자리가 1이면
				k20_units[1] = "일"; // units배열에 추가한다
			}
			System.out.printf("%s[%s]", k20_sNumVal.substring(k20_i, k20_i + 1),
					k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]);
			// 문자열 sNumVal의 i번째부터 i+1번째까지를 자른값, units배열에서 문자열 sNumVal의
			// i번째부터 i+1번째까지를 자른값을 정수로 변환하여 출력한다.

			if (k20_sNumVal.substring(k20_i, k20_i + 1).equals("0")) {
				// 만약 문자열 sNumVal의 i번째부터 i+1번째까지를 자른값이 0이라면

				if (k20_unitx[k20_j].equals("억")) {

					// 만약 배열unitx의 j번째가 '만'이거나 억이라면
					k20_sNumVoice = k20_sNumVoice + "" + k20_unitx[k20_j];
					// sNumVoice는 sNumVoice+unitx배열의 j번째의 합이다

				} else if (k20_sNumVal.length() < 9 && k20_unitx[k20_j].equals("만")) { 
					// 그외에 만약 sNumVal의 길이가 9미만 동시에 '만'을 포함하면
					k20_sNumVoice = k20_sNumVoice + "" + k20_unitx[k20_j];
					// sNumVoice는 sNumVoice+unitx배열의 j번째의 합이다

				}

			} else { // 그외에는
				if (k20_j == k20_cnt - 1) { // 만약 j(sNumVal문자열의 길이 -1)의 값이 cnt의 값 -1라면
											// -> 반복후에 마지막 숫자가 1이면 배열에서 1을 추가한다
											// 나머지경우는 일이 필요없음
					if (k20_sNumVal.charAt(k20_sNumVal.length() - 1) == '1') { // 만약 sNumVal의 마지막 값이 1이라면
						k20_units[1] = "일";// 그외에는 //units배열의 2번째 값을 "일"로 변경한다.
					}
				}
				k20_sNumVoice = k20_sNumVoice + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]
						+ k20_unitx[k20_j];
				// sNumVoice는 sNumVoice와 units배열에서 문자열 sNumVal의
				// i번째부터 i+1번째까지를 자른값을 정수로 변환한 값을 이은 문자열이다.

			}
			k20_cnt++; // 루프끝에 cnt를 1증가시킨다

			k20_i++; // i를 1더한다
			k20_j--; // j를 1뺀다
		}
		System.out.printf("\n %s[%s]\n", k20_sNumVal, k20_sNumVoice);
		// 문자열 sNumVal과 sNumVoice를 출력한다.

	}

}
