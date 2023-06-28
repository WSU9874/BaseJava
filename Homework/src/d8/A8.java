package d8;

import java.util.Arrays;
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inFisrt = scanner.next();
		String inSecond = scanner.next();
		char[] inF = inFisrt.toCharArray();
		char[] inS = inSecond.toCharArray();
	
		char[] check = new char[inS.length];
		int cnt = 0;
		for (int i = 0; i < inF.length; i++) {
			for (int j = 0; j < inS.length; j++) {
				if(inF[i] == inS[j] && check2(inS[j], check)) {
					check[j] = inS[j];
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		//scholar
		//0123456
		//0000000
		
	}
	
	
	public static boolean check2(char a, char[] b) {
		boolean flag = true;
		for (char b1 : b) {
			if (b1 == a) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	
}
