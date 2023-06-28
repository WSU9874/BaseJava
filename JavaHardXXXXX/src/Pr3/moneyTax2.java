package Pr3;

public class moneyTax2 {

	public static void main(String[] args) {
		String[] k20_item = { "맛동", "웨하", "롯샌", "오땅", "사브" };
		// 문자열 배열에 과자 이름을 넣는다.
		int[] k20_price = { 1000, 2000, 3000, 2500, 1450 };
		// 정수 배열에 과자 가격을 넣는다.
		int[] k20_amount = { 10, 2, 1, 3, 5 };
		// 정수 배열에 과자의 개수를 넣는다.
		double k20_tax_rate = 0.1; // 실수형인 변수를 선언하고 값을 넣는다. (세금)
		int k20_total_sum = 0; // 총합계를 초기화한다.

		System.out.println("*********************************"); // 위에 선을 출력
		System.out.println("산 과자들"); // 문자열 출력
		System.out.println("항목    단가 수량    합계"); // 항목 단가 수량 합계를 출력
		for (int k20_i = 0; k20_i < k20_item.length; k20_i++) {
			// item배열의 항목수 만큼 반복, 반복할때마다 i는 1씩 증가
			int k20_sum = k20_price[k20_i] * k20_amount[k20_i];
			// sum은 price * amount - > i번쨰 배열
			k20_total_sum = k20_total_sum + k20_sum;
			// total_sum은 sum값을 계속 더한다
			System.out.printf("%.5s %7d %2d %9d\n", k20_item[k20_i], k20_price[k20_i], k20_amount[k20_i], k20_sum);
			// i번째 배열의 항목 단각 수량 합계를 출력
			// 반복
		}
		System.out.println("*********************************"); // 밑에 선 출력
		System.out.printf("지불 금액 :  %15d\n", k20_total_sum); // 합계 출력

		int k20_total_net_price = (int) (k20_total_sum / (1 + k20_tax_rate));
		// 과세 금액은 정수형 총합에 세금+1을 나눈 값의 몫
		System.out.printf("과세 금액 :  %15d\n", k20_total_net_price);
		// 과세 금액 출력
		int k20_tax = k20_total_sum - k20_total_net_price;
		// 세금은 총합 - 과세 금액
		System.out.printf("세금 :  %20d\n", k20_tax);
		// 세금 출력

	}

}
