package Pr5;

import java.text.NumberFormat;

public class P7 {

	public static void main(String[] args) {

		NumberFormat df = NumberFormat.getNumberInstance();
		System.out.println("신용승인");
		System.out.println("단말기: 2N68665898      전표번호: 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주소: 경기 성남시 분당구 황새울로 351번길\n10 1층");
		System.out.println("대표자 : 유창신");
		System.out.println("사업자:752-53-00558	      TEL:7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		int iPrice = 33000;
		float tax = 0.1f;
		int price = (int) Math.round(iPrice / (1 + tax));
		System.out.printf("금액                           %-8s원\n", df.format(price));
		System.out.printf("부가세                          %-7s원\n",df.format((int) (price * tax)));
		System.out.printf("합 계	                       %-8s원\n",df.format(iPrice));
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("우리카드");
		System.out.println("카드번호:5387-20**-****-4613(S)    일시불");
		System.out.println("거래일시	");
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입:비씨카드사	       가맹:720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL)1544-4700");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("	        *감사합니다*		");
		System.out.println("		       표준V2.08_20200212");

	}

}
