package Pr2;

public class CastingEx3 { // 클래스 선언

	public static void main(String[] args) {
		float k20_f = 9.1234567f; // f라는 float변수를 정의하고 9.1234567f로 초기화
		double k20_d = 9.1234567; // d라는 double변수를 정의하고 9.1234567로 초기화
		double k20_d2 = (double) k20_f; // double d2를 정의하고 f를 double화하여 대입

		System.out.printf("k20_f =%20.18f\n", k20_f);
		// 변수 f출력
		System.out.printf("k20_d =%20.18f\n", k20_d);
		// 변수 d출력
		System.out.printf("k20_d2 =%20.18f\n", k20_d2);
		// 변수 d2출력

	}

}
