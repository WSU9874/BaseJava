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

		System.out.println("���ұݾ�: " + pay + "��");
		System.out.println("������: " + gain + "��");
		System.out.println("����Ŀ��: " + freecof + "��");
		System.out.println("���ð�: " + (int)(0.05 * 60) * sell + "��");
		
		
		
		

	}

}
