package day2;

import java.util.Scanner;

public class Cof {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sell = scanner.nextInt();
		int cof = 2000;
		double alba = (10000);		
		int freecof = sell / 10;
		int pay = cof * (sell-freecof);

		int gain = ((int)(pay * 0.66) - (int)((alba * 0.05)* sell));

		System.out.println("지불금액: " + pay + "원");
		System.out.println("순수익: " + gain + "원");
		System.out.println("무료커피: " + freecof + "개");
		System.out.println("대기시간: " + (int)(0.05 * 60) * sell + "분");
		
		
		
		

	}

}
