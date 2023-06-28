package day3;
import java.util.Scanner;
public class Chatbot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input  = scanner.next();
			if (input.contains("안녕")) {
				System.out.println("안녕하세요");
			
			} else if (input.contains("몇살")) {
				System.out.println("나는 27살, 너는?");
			} else if (input.contains("취미")) {
				System.out.println("자전거타기야");
			} else if (input.contains("사는곳")) {
				System.out.println("서울이야");
			} else if (input.contains("나갈게")) {
				System.out.println("종료");
				break;
			}
		}

	}

}
