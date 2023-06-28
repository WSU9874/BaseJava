package day2;
import java.util.Scanner;
public class p4Base3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int base10 = scanner.nextInt();
		int digit4 = base10 / 27;
		int digit3 = (base10 - digit4 * 27);
		digit3 = digit3 / 9;
		int digit2 = base10 - (digit4 * 27) - (digit3 * 9);
		digit2 = digit2 / 3;
		int digit1 = base10 - (digit4 * 27) - (digit3 * 9) - (digit2 * 3);
		digit1 = digit1 % 3;
		
		System.out.print(digit4);
		System.out.print(digit3);
		System.out.print(digit2);
		System.out.print(digit1);

	}
}
