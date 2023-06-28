package Pr5;

public class P10 {

	public static void main(String[] args) {
		System.out.printf("12345678901234567890123456789012345678901\n");
		String itemname1 = "만두";
		int price1 = 1600;
		int amount1 = 3;
		int total1 = price1 * amount1;
		String itemname2 = "만두";
		int price2 = 1000;
		int amount2 = 1;
		int total2= price2 * amount2;
		
		int iPrice = ((price1 * amount1)+(price2 * amount2));
		float tax = 0.1f;
		int price = (int) Math.round(iPrice / (1 + tax));
		
		System.out.printf("SHINSEGAE");
		System.out.printf("(주) 신세계 경기점 T.1588-1234\n");
		System.out.printf("경기 용인 수지구 포은대로 536\n");
		System.out.printf("201-81-32195  차정호\n");
		System.out.printf("구매 2021-03-06 15:06 거래번호:0533-8162\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   상품명               수량         금액\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%d원 / %s             %d         %d\n",price1, itemname1, amount1, total1 );
		System.out.printf("%d원 / %s             %d         %d\n",price2, itemname2, amount2, total2 );
		System.out.printf("       소      계                   %d\n", total1 + total2);
		System.out.printf("과 세 물 품 가 액                   %d\n", price);
		System.out.printf("부      가     세                    %d\n", (int)(price*tax));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("합             계                   %d\n", iPrice);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("카 드 결 제 액                      %d\n", iPrice);
		System.out.printf("비 씨                   538720******4227\n");
		System.out.printf("승인번호            67137812      일시불\n");
		System.out.printf("            캐셔No:409**2 구운몽\n");
		System.out.printf("              주문번호 : 876\n");
		System.out.printf("           2103060533816200005801\n");
		System.out.printf("교환, 환불, 결제변경은 7일내 결제카드  \n");
		System.out.printf("지참하시고, 환불 시 증정사은품은\n");
		System.out.printf("반납하셔야 합니다. (일부 브랜드 제외)\n");
		System.out.printf("구운몽 031-695-2173\n");

	}

}
