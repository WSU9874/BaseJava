package Pr2;

import java.util.Scanner; //스캐너 모듈을 불러온다

public class ScannerEx {	//클래스 선언

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 클래스를 호출한다

		System.out.println("두자리 정수를 하나 입력해주세요.>"); // 문자열을 출력

		String k20_input = scanner.nextLine(); // 사용자에게 문자열input을 띄어쓰기포함하여 입력받는다.
		int k20_num = Integer.parseInt(k20_input); // 입력 받은 문자열을 정수로 변환하여 num에 대입

		System.out.println("입력내용 :" + k20_input); // input을 출력
		System.out.printf("num=%d%n", k20_num); // num을 출력

	}

}
