package Pr4;

public class tri { // 클래스 선언

	public static void main(String[] args) {
		int k20_iA, k20_iB; // iA, iB라는 int변수를 정의하한다

		k20_iA = 0; // iA을 0으로 초기화 한다.
		while (true) { // 무한반복

			k20_iB = 0; // iB을 0으로 초기화 한다.
			while (true) { // 무한반복
				System.out.print("*"); // *을 출력한다

				if (k20_iA == k20_iB) // 만약 iA와 iB가 같다면
					break; // 루프를 종료한다
				k20_iB++; // 그리고 iB의 값을 +1한다

			}
			System.out.println(); // 줄바꿈
			k20_iA++; // iA값을 +1한다
			if (k20_iA == 30) // 만약 iA가 30이라면
				break; // 루프를 종료한다.
		}
	}
}
