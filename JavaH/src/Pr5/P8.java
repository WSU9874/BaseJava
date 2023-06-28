package Pr5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {

	public static void main(String[] args) {
		System.out.println("12345678901234567890123456789012345678901");
		String itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String itemcode1 = "1031615";
		int price1 = 3000;
		int amount1 = 1;
		
		String itemname2 = "슬라이드식명찰(가로형)(100호)";
		String itemcode2 = "11008152";
		int price2 = 1000;
		int amount2 = 1;
		
		String itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String itemcode3 = "1020800";
		int price3 = 1000;
		int amount3 = 1;
		
		int iPrice = ((price1 * amount1)+(price2 * amount2)+(price3 * amount3));
		float tax = 0.1f;
		int price = (int) Math.round(iPrice / (1 + tax));
		
		Calendar calt = Calendar.getInstance();
		//캘린더 클래스를 불러온다
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//simpledateformat클래스로 날짜 형식을 정한다
		
		System.out.printf("                 \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부, 신호섭 213-81-52063\n");
		System.out.printf("매장 : 경기도 성남시 분당구 분당로53번길1(서현\n동)\n");
		System.out.printf("===============================================\n");
		System.out.printf("         소비자중심경영(CCM) 인증기업\n");
		System.out.printf("       ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("===============================================\n");
		System.out.printf("           교환/환불 14일(03월 12일)이내,\n");
		System.out.printf("  (전자)영수증,결제카드 지참후구입매장에서가능\n");
		System.out.printf("       포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("         체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("===============================================\n");
		System.out.printf("[POS 1058231]              %s\n",  k20_sdt.format(calt.getTime()));
		System.out.printf("===============================================\n");
		System.out.printf("%s          %d %d %d\n[%s]\n", itemname1.substring(0,14), price1, amount1, (price1 * amount1),itemcode1 );
		System.out.printf("%s            %d %d %d\n[%s]\n", itemname2.substring(0,14), price2, amount2, (price2 * amount2),itemcode2 );
		System.out.printf("%s          %d %d %d\n[%s]\n", itemname3.substring(0,14), price3, amount3, (price3 * amount3),itemcode3 );
		System.out.printf("                 과세합계                  %d\n", price);
		System.out.printf("                   부가세                   %d\n", iPrice-price);
		
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("판매합계                                   %d\n", iPrice);
		System.out.printf("===============================================\n");
		System.out.printf("신용카드                                   %d\n", iPrice);
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("우리카드                       538720**********\n");
		System.out.printf("승인번호 77982843(0)              승인금액 %d\n", iPrice);
		System.out.printf("           %s 분당서현점\n",  k20_sdt.format(calt.getTime()));
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("             ||||||||||||||||||||||\n");
		System.out.printf("                 2112820610158231\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("◈ 다이소 멤버십 앱 또는홈페이지에 접속하셔서\n");
		System.out.printf("  회원가입 후 다양한 혜택을 누려보세요! ◈\n");

	}

}
