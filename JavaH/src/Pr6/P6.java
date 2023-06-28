package Pr6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P6 {

	public static void main(String[] args) {
		int itemCount=30;
		TitlePrint();
		TimeStemp();
		HeaderPrint();
		
		for(int i = 0; i < itemCount; i++) {
			itemPrint(i);
			
			TotalPrint();
		}

	}
	
	public static void TitlePrint() {
		System.out.println("이마트");
	}
	
	public static void TimeStemp() {
		Calendar calt = Calendar.getInstance();
		// 캘린더 클래스를 불러온다
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.println(k20_sdt);
	}
	public static void HeaderPrint() {
		NumberFormat df = NumberFormat.getNumberInstance();

		String[] itemname = { "해피 홈 SAFE365 핸드워시", "a가다라마바사하자", "건포도", "오렌지", "홈런볼", "감자링", "고래밥", "꼬깔콘", "스윙칩", "다이제",
				"달고나", "공갈빵", "레이즈", "몽쉘통", "맛동", "막과자", "토마토", "뻥이요", "빼빼로", "새우깡", "상어밥", "씨리얼", "양파링", "에이스", "연양갱",
				"오예스", "크래커", "죠리퐁", "ab라b나ek라b라라b나ek라", "포카칩" };
		int[] price = { 10000000, 2500000, 3300, 2500, 100, 50, 600, 800, 1000, 900, 400, 500, 1000, 2000, 5000, 2000,
				3000, 4000, 5000, 6000, 7000, 8000, 7000, 8000, 6000, 2000, 1000, 3000, 4000, 6000, 5000 };
		int[] num = { 2, 4, 1, 1, 10, 5, 6, 4, 2, 6, 1, 2, 6, 4, 5, 4, 1, 2, 3, 4, 3, 4, 5, 1, 8, 6, 4, 1, 2, 5, 7 };
		
		for (int i =0; i < itemname.length; i++) {
			System.out.printf("상품명: %s, 단가 %d, 수량: %d, 금액: %d", itemname[i],price[i],num[i], price[i]*num[i]);
		}
	}
	public static int itemPrint(int i) {
		
		
		return  i;
		
	}
	
	

}
