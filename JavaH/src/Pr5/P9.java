package Pr5;

import java.text.NumberFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class P9 {

	public static void main(String[] args) {
		System.out.println("12345678901234567890123456789012345678901");
		NumberFormat df = NumberFormat.getNumberInstance();
		Calendar calt = Calendar.getInstance();
		// 캘린더 클래스를 불러온다
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		SimpleDateFormat k20_sdt2 = new SimpleDateFormat("YYYYMMdd");
		// simpledateformat클래스로 날짜 형식을 정한다

		String[] itemname = { "해피 홈 SAFE365 핸드워시", "a가다라마바사하자", "건포도", "오렌지", "홈런볼", "감자링", "고래밥", "꼬깔콘", "스윙칩", "다이제",
				"달고나", "공갈빵", "레이즈", "몽쉘통", "맛동", "막과자", "토마토", "뻥이요", "빼빼로", "새우깡", "상어밥", "씨리얼", "양파링", "에이스", "연양갱",
				"오예스", "크래커", "죠리퐁", "ab라b나ek라b라라b나ek라", "포카칩" };
		int[] price = { 10000000, 2500000, 3300, 2500, 100, 50, 600, 800, 1000, 900, 400, 500, 1000, 2000, 5000, 2000,
				3000, 4000, 5000, 6000, 7000, 8000, 7000, 8000, 6000, 2000, 1000, 3000, 4000, 6000, 5000 };
		int[] num = { 2, 4, 1, 1, 10, 5, 6, 4, 2, 6, 1, 2, 6, 4, 5, 4, 1, 2, 3, 4, 3, 4, 5, 1, 8, 6, 4, 1, 2, 5, 7 };
		int sum = 0;
		int taxFree = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		boolean[] taxfree = { true, true, false, true, true, true, true, false, true, true, true, true, false, true,
				true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true };

		int iPrice = 0;

		System.out.printf("    emart     이마트 죽전점(031)888-1234\n");
		System.out.printf("              206-86-50913 강희석\n");
		System.out.printf("              용인 수지구 포은대로 552\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("*일부 브랜드매장 제외(매장 고지물참조\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구 매]%s  POS:0011-9861\n", k20_sdt.format(calt.getTime()));
		System.out.printf("----------------------------------------\n");
		System.out.printf("   상품명         단 가  수량     금 액\n");
		System.out.printf("----------------------------------------\n");

		for (int i = 1; i < itemname.length + 1; i++) {

			String aa = itemname[i - 1];
			aa = aa + "                         ";
			byte[] bb = aa.getBytes();
			aa = new String(bb, 0, 13);

			if (bb[12] < 0){
				aa = new String(bb, 0, 12) + " ";
			}

			System.out.printf(" %s%11s%3s%11s\n", aa, df.format(price[i - 1]), df.format(num[i - 1]),
					df.format((price[i - 1] * num[i - 1])));
			iPrice = iPrice + (price[i-1] * num[i-1]);

			if (taxfree[i - 1] == false) {
				taxFree = taxFree + (price[i - 1] * num[i - 1]);
			}

			if (i % 5 == 0) {
				System.out.printf("----------------------------------------\n");
			}
		}
		float tax = 0.1f;
		int priceTotal = (int) Math.ceil((iPrice - taxFree) / (1 + tax));

		System.out.printf("           총 품목 수량              %d\n", itemname.length);
		System.out.printf("           (*)면세물품      %11s\n", df.format(taxFree));
		System.out.printf("           과세물품         %11s\n", df.format(priceTotal));
		System.out.printf("           부가세           %11s\n", df.format(iPrice - priceTotal-taxFree));
		System.out.printf("           합   계          %11s\n", df.format(iPrice));
		System.out.printf("결 제 대 상 금 액           %11s\n", df.format(iPrice));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("0012 KEB 하나      541707**0484/35860658\n");
		System.out.printf("카드결제(IC)       일시불 / %11s \n", df.format(iPrice));
		System.out.printf("----------------------------------------\n");
		System.out.printf("          [신세계포인트 적립]\n");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트      9350**9995       164\n");
		System.out.printf("누계(기용)포인트       5,637(      5,473)\n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("    구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호 :                    34저****\n");
		
		calt.add(Calendar.HOUR_OF_DAY, -2);
		 System.out.println(k20_sdt.format(calt.getTime()));
		  
		System.out.printf("입차시간 :           %s\n", k20_sdt.format(calt.getTime()));
		System.out.printf("----------------------------------------\n");
		System.out.printf("캐셔:084599 양00                    1150\n");
		System.out.printf("      %s/00119861/00164980/31\n", k20_sdt2.format(calt.getTime()));

		

		byte[] byteArray = "포스틱 ab라b 나ek라".getBytes();
		  String strValue = new String(byteArray);

		  System.out.println(Arrays.toString(byteArray));
		  System.out.println(strValue);
		  
		  
		
	}

}
