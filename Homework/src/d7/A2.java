package d7;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		char[] arr = new char[a.length()];
		String b = scanner.next();
		char[] arr2 = new char[b.length()];
		
		int cnt = 0;
		int cnt2 = 0;

		for (int j = 0; j < b.length(); j++) {
			arr2[j] = b.charAt(j);
			for (int i = 0; i < a.length(); i++) {
				arr[i] = a.charAt(i);
				if (arr[i] == arr2[j]) {
					cnt++;
					if (arr[i] == arr2[j+1]) {				
					cnt2++;
				}System.out.print(cnt2);
				
			}System.out.print(cnt);
			
			
			
		}
		
	}

}
}

/*counting();
counting();

}

public static void counting() {
Scanner scanner = new Scanner(System.in);
String a = scanner.nextLine();
char[] arr = new char[a.length()];
String b = scanner.next();
char b1 = b.charAt(0);
int cnt = 0;

for (int i = 0; i < a.length(); i++) {
	arr[i] = a.charAt(i);
	if (arr[i] == b1) {
		cnt++;
	}

}
System.out.println(cnt);
}
*/