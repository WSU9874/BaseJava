package day3;

public class LoopCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		for (a = 1; a <= 3; a++ ) {
			if (a == 1) {
				System.out.println("**");
			} else if (a == 2) {
				System.out.println("@@@@");
			} else {
				System.out.println("%%%%%%");
			}
		}
		
		
		
		
		for (int i = 0;i <3; i++) {
			for(int j =0; j < i + 1; j++) {
				
			}
			System.out.println();
		}
	}
}
