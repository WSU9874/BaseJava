package Pr2;

public class CastingEx4 { // 클래스 선언

	public static void main(String[] args) {
		int k20_i = 91234567; // i라는 정수변수를 정의하고 9.1234567로 초기화
		float k20_f = (float) k20_i; // 실수 f에 i의 실수화를 대입
		int k20_i2 = (int) k20_f; // 실수 i2에 f의 정수화를 대입

		double k20_d = (double) k20_i; // double d에 i의 double화를 대입
		int k20_i3 = (int) k20_d; // 정수 i3에 d의 정수화를 대입
		float k20_f2 = 1.666f; // f라는 float변수를 정의하고 1.666f로 초기화
		int k20_i4 = (int) k20_f2; // 정수 i4에 f2의 정수화를 대입

		System.out.printf("i=%d\n", k20_i);
		// 변수 i를 출력
		System.out.printf("f=%f i2=%d\n", k20_f, k20_i2);
		// 변수 f와 i2를 출력
		System.out.printf("d=%f i3=%d\n", k20_d, k20_i3);
		// 변수 d와 i3를 출력
		System.out.printf("(int)%f=%d\n", k20_f2, k20_i4);
		// 변수 f2와 i4를 출력

	}

}
