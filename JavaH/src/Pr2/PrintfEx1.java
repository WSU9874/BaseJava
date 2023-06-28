package Pr2;

public class PrintfEx1 { // 클래스 선언

	public static void main(String[] args) {
		byte k20_b = 1; // b라는 바이트형 변수를 정의하고 1으로 초기화
		short k20_s = 2; // s라는 short형 변수를 정의하고 2으로 초기화
		char k20_c = 'A'; // c라는 캐릭터형 변수를 정의하고 A으로 초기화

		int k20_finger = 10; // finger라는 정수형 변수를 정의하고 10으로 초기화
		long k20_big = 100000000000L; // big라는 long형 변수를 정의하고 100000000000L으로 초기화
		long k20_hex = 0xFFFFFFFFFFFFFFFL; // hex라는 long형 변수를 정의하고 0xFFFFFFFFFFFFFFFL으로 초기화

		int k20_octNum = 010; // octNum라는 정수형 변수를 정의하고 010으로 초기화(8진수)
		int k20_hexNum = 0x10; // hexNum라는 정수형 변수를 정의하고 0x10으로 초기화(16진수)
		int k20_binNum = 0b10; // binNum라는 정수형 변수를 정의하고 0b10으로 초기화(2진수)

		System.out.printf("b=%d%n", k20_b); // b변수를 출력
		System.out.printf("s=%d%n", k20_s); // s변수를 출력
		System.out.printf("c=%c, %d %n", k20_c, (int) k20_c); // 문자c를 출력, c를 정수형으로 변환하여 출력
		System.out.printf("k20_finger=[%5d]%n", k20_finger); // 총 5칸중 정수finger 앞 나머지 3칸 띄고 출력
		System.out.printf("k20_finger=[%-5d]%n", k20_finger); // 총 5칸중 정수finger 뒤 나머지 3칸 띄고 출력
		System.out.printf("k20_finger=[%05d]%n", k20_finger); // 총 5칸중 정수finger 앞 나머지 3칸 0 출력
		System.out.printf("big=%d%n", k20_big); // long변수 big 출력
		System.out.printf("hex=%#x%n", k20_hex); // long변수 hex출력
		System.out.printf("k20_octNum=%o, %d%n", k20_octNum, k20_octNum);// octNum변수의 10진수, 8진수값 출력
		System.out.printf("k20_hexNum=%x, %d%n", k20_hexNum, k20_hexNum);// hexNum변수의 10진수, 16진수값 출력
		System.out.printf("k20_binNum=%s, %d%n", Integer.toBinaryString(k20_binNum), k20_binNum);
		// binNum변수의 10진수, 2진수값 출력

	}

}
