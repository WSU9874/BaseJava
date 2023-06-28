package Pr4;

public class P16 { // 클래스 선언

	public static void main(String[] args) {
		int k20_il; // il라는 int변수를 정의한다
		double k20_iD; // iD라는 double변수를 정의한다

		k20_il = 10 / 3; // il은 10/3의 몫이다
		k20_iD = 10 / 3.0; // iD는 10/3의 실수 값이다

		if (k20_il == k20_iD) // 만약 il과 iD가 같다면
			System.out.println("equal"); // 문장을 출력한다
		else // 그외에는
			System.out.printf("Not equal[%f][%f]\n", (double) k20_il, k20_iD);
		// 같지않다는 문장을 출력하고 il과 iD의 실수값을 출력

		if (k20_iD == 3.333333) // 만약 iD가 3.333333라면
			System.out.println("equal"); // 문장을 출력한다
		else // 그외에는
			System.out.printf("Not equals[3.333333][%f]\n", k20_iD);
		// 같지 않다는 문장을 출력하고 두 수를 출력

		k20_iD = (int) k20_iD; // doubleiD를 정수로 형변환시킨다.
		if (k20_il == k20_iD) // 만약 il과 iD가 같다면
			System.out.printf("equal\n"); // 문장을 출력
		else // 그외에는
			System.out.printf("Not equal[%f][%f]\n", (double) k20_il, k20_iD);
		// 같지 않다는 문장을 출력하고 il과 iD의 실수값을 출력

		System.out.printf("int로 인쇄[%d][%f]\n", k20_il, k20_iD);
		// 두 수의 소수점을 버린 정수값으로 출력
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k20_il, k20_iD);
		// 두 수를 실수 값으로 출력 (iD는 이미 소수점이하를 버리고 정수화)

		char k20_a = 'c'; // a라는 char변수를 정의하고 값은 'c'이다
		if (k20_a == 'b') // 만약 a가 b라면
			System.out.printf("a는 b이다\n"); // 문장을 출력
		if (k20_a == 'c') // 만약 a가 c라면
			System.out.printf("a는 c이다\n"); // 문장을 출력
		if (k20_a == 'd') // 만약 a가 d라면
			System.out.printf("a는 d이다\n"); // 문장을 출력

		String k20_aa = "abcd"; // aa라는 String변수를 정의하고 값은 'abcd'이다

		if (k20_aa.equals("abcd")) // 만약 aa가 abcd라면
			System.out.printf("aa는 abcd이다\n"); // 문장을 출력
		else // 그외에는
			System.out.println("aa는 abcd이 아니다\n"); // 문장을 출력

		boolean k20_bb = true; // bb라는 boolean변수를 정의하고 값은 true다

		if (!!k20_bb) // 만약 bb가 참이 아니라면
			System.out.printf("bb가 아니고 아니면 참이다\n"); // 문장을 출력
		else // 그외에는
			System.out.printf("bb가 아니고 아니면 거짓이다\n"); // 문장을 출력

	}
}