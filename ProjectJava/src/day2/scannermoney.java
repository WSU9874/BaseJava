package day2;
import java.util.Scanner;
public class scannermoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int paidmoney = scanner.nextInt();
		int change = scanner.nextInt();
		int charge = paidmoney - change;
		System.out.println(charge);
		
		int money10000 = charge / 10000;
		int money5000 =  (charge % 10000) / 5000;
		int money1000 = (charge - 10000 * money10000 - 5000 * money5000);
		money1000 = money1000 / 1000;
		int money500 = (charge - 10000 * money10000 - 5000 * money5000 - 1000 * money1000);
		money500 = money500 / 500;
		int money100 = (charge - 10000 * money10000 - 5000 * money5000 - 1000 * money1000 - 500 * money500);
		money100 = money100 / 100;
		int money50 = (charge - 10000 * money10000 - 5000 * money5000 - 1000 * money1000 - 500 * money500 - 100 * money100);
		money50 = money50 / 50;
		int money10 = (charge - 10000 * money10000 - 5000 * money5000 - 1000 * money1000 - 500 * money500 - 100 * money100 - 50 * money50);
		money10 = money10 / 10;
		
		System.out.println("10000 -" + money10000);
		System.out.println("5000 -" + money5000);
		System.out.println("1000 -" + money1000);
		System.out.println("500 -" + money500);
		System.out.println("100 -" + money100);
		System.out.println("50 -" + money50);
		System.out.println("10 -" + money10);
	}
}
