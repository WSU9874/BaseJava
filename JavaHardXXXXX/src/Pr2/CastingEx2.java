package Pr2;

public class CastingEx2 { // 클래스 선언

	public static void main(String[] args) {
		int k20_i = 10; // i라는 정수변수를 정의하고 10으로 초기화
		byte k20_b = (byte) k20_i; // b라는 byte변수를 정의하고 i를 byte화 해서 대입
		System.out.printf("[int -> byte] k20_i=%d -> k20_b=%d%n", k20_i, k20_b);
		// 변수 i와 b 값을 출력

		k20_i = 300; // i라는 정수변수를 재정의하고 300으로 초기화
		k20_b = (byte) k20_i; // b라는 byte변수를 재정의하고 i를 byte화 해서 대입
		System.out.printf("[int -> byte] k20_i=%d ->k20_ b=%d%n", k20_i, k20_b);
		// 변수 i와 b 값을 출력

		k20_b = 10; // b라는 정수변수를 재정의하고 10으로 초기화
		k20_i = (int) k20_b; // i라는 int변수를 재정의하고 b를 int화 해서 대입
		System.out.printf("[byte -> int] b=%d -> k20_i=%d%n", k20_b, k20_i);
		// 변수 i와 b 값을 출력

		k20_b = -2; // b라는 정수변수를 재정의하고 -2으로 초기화
		k20_i = (int) k20_b; // i라는 int변수를 재정의하고 b를 int화 해서 대입
		System.out.printf("[byte -> int] k20_b=%d -> k20_i=%d%n", k20_b, k20_i);
		// 변수 i와 b 값을 출력

		System.out.println("i=" + Integer.toBinaryString(k20_i));
		// 값을 2진수로 출력

	}

}
