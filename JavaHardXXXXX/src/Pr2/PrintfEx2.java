package Pr2;

public class PrintfEx2 { // 클래스 선언

	public static void main(String[] args) {
		String k20_url = "www.codechobo.com"; // 문자열url을 정의하고 문장을 초기화

		float k20_f1 = .10f; // 실수형 f1을 정의하고 값을 10f로 초기화
		float k20_f2 = 1e1f; // 실수형 f2을 정의하고 값을 1e1f로 초기화
		float k20_f3 = 3.14e3f; // 실수형 f3을 정의하고 값을 3.14e3f로 초기화
		double k20_d = 1.23456789;// 실수형 d을 정의하고 값을 1.23456789로 초기화

		System.out.printf("k20_f1=%f, %e, %g%n", k20_f1, k20_f1, k20_f1);
		// 변수 f1을 실수형, 지수형, 간략화로 출력한다.
		System.out.printf("k20_f2=%f, %e, %g%n", k20_f2, k20_f2, k20_f2);
		// 변수 f2을 실수형, 지수형, 간략화로 출력한다.
		System.out.printf("k20_f3=%f, %e, %g%n", k20_f3, k20_f3, k20_f3);
		// 변수 f3을 실수형, 지수형, 간략화로 출력한다.
		System.out.printf("k20_d=%f%n", k20_d);
		// 변수 d를 float로 출력한다
		System.out.printf("k20_d=%14.10f%n", k20_d);
		// 변수 d를 14자리수를 출력하고 소수점 10째자리까지 출력한다

		System.out.printf("[12345678901234567890]%n");
		// []를 출력한다
		System.out.printf("[%s]%n", k20_url);
		// 변수 url을 출력한다
		System.out.printf("[%20s]%n", k20_url);
		// url을 출력하고 20칸이 생기며 왼쪽으로 채워지며 남은칸은 빈칸으로 출력
		System.out.printf("[%-20s]%n", k20_url);
		// url을 출력하고 20칸이 생기며 오른쪽으로 채워지며 남은칸은 빈칸으로 출력
		System.out.printf("[%.8s]%n", k20_url);
		// url을 출력하고 8칸만 생기며 나머지는 버린다.

	}

}
