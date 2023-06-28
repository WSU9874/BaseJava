package Pr3;

public class MyTest { // 클래스 선언

	public static void main(String[] args) {
		int k20_price = 1234; // price라는 int변수를 정의하고 1234로 초기화
		double k20_tax_rate = 0.1; // tax_rate라는 double변수를 정의하고 0.1로 초기화

		int k20_netprice = netprice(k20_price, k20_tax_rate);
		// netprice라는 int변수를 정의하고 함수netprice의 리턴값을 대입
		int k20_tax = k20_price - k20_netprice;
		// tax라는 int변수를 정의하고 소비자가 - 세전가격의 값을 대입

		System.out.println("************************************************");
		// 선 출력
		System.out.printf("*소비자가,        세전가격,       세금 계산  *\n");
		// 항목 출력
		System.out.printf("소비자가격: %d, 세전가격: %d, 세금: %d\n", k20_price, k20_netprice, k20_tax);
		// 소비자가격, 세전가격, 세금 출력
		System.out.println("************************************************");
		// 선 출력
	}

	public static int netprice(int k20_price, double k20_rate) {
		// int값을 반환하는 함수 생성
		return (int) (k20_price / (1 + k20_rate));
		// 리턴 값은 (소비자가격 / (1 + 세율)) -> 정수형태
	}

}
