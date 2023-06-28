package Pr2;

public class OverflowEx { // 클래스 선언

	public static void main(String[] args) {
		short sMin = -32768; // sMin라는 short변수를 정의하고 -32768로 초기화
		short sMax = 32767; // sMax라는 short변수를 정의하고 32767로 초기화
		char cMin = 0; // cMin라는 char변수를 정의하고 0으로 초기화
		char cMax = 65535; // cMax라는 char변수를 정의하고 65535로 초기화

		System.out.println("sMin =" + sMin);
		// sMin변수를 화면에 출력
		System.out.println("sMin-1 =" + (short) (sMin - 1));
		// sMin변수-1를 화면에 출력 단순 -1이아니고 값이 이상해졌다 범위초과
		System.out.println("sMax =" + sMax);
		// sMax변수를 화면에 출력
		System.out.println("sMax+1 =" + (int) (sMax + 1));
		// sMax변수+1를 화면에 출력 범위를 넘어도 정상출력
		System.out.println("cMin =" + (int) cMin);
		// cMin변수를 화면에 출력
		System.out.println("cMin-1 =" + (int) --cMin);
		// cMin변수-1을 화면에 출력 char0에서 1을 빼면 65535가 나온다
		System.out.println("cMax =" + (int) cMax);
		// cMax변수를 화면에 출력
		System.out.println("cMax +1 =" + (int) ++cMax);
		// cMax변수+1를 화면에 출력 0이 된다

	}

}
