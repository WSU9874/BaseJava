package d5Java04;

import java.util.Scanner;



public class NewMember {
	public static final String MotherName = "John" ;
	public static final String FatherName = "Mike";
	public static final String SonName = "James";
	public static final String DaughterName = "April";
	public static final int FATHERINDEX = 1;
	public static final int MOTHERINDEX = 2;
	public static final int SONINDEX = 3;
	public static final int DAUGHTERINDEX = 4;

	public static void main(String[] args) {
		NewMember testC = new NewMember();
		while (true) {
			int n = testC.showMenu();
			String name = testC.addtion(n);
			System.out.println(name);
			break;
		}
		}
		
		public static void print(int a, int b) {
			System.out.println(a + b);
		}
		public static void print(String line) {
			System.out.println(line);
	}
		
	
	
	
	
	public int showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		return scanner.nextInt();
	}
	
	public String addtion(int familyName) {
		String name = "";
		if (familyName == FATHERINDEX) {
			name = FatherName;
		} else if (familyName == MOTHERINDEX) {
			name = MotherName;
		} else if (familyName == SONINDEX) {
			name = SonName;
		} else if (familyName == DAUGHTERINDEX) {
			name = DaughterName;
		}
		return name;
	}
}
