package day3;
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			
		String text = scanner.nextLine();
		//System.out.println(text);
		int a = 0;
		while (a < text.length()) {
		//for (int a = 0; a < text.length(); a+=a+1) {
			int I = text.charAt(a);	
			if (I >= 97 && I < 123) {
				System.out.print((char)(I-32));
			}else if(I >= 65  && I < 91){
				System.out.print((char)(I+32));
				
			} else {
				System.out.print((char)I);
			}
			a++;
		}

	}
}
