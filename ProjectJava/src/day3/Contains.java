package day3;
import java.util.Scanner;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text;
		text = scanner.next();
		
		if (text.contains("hello") == true) {
			System.out.println("하이");
		}else {
			System.out.println("바이");
		}

	}

}
