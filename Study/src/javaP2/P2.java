package javaP2;

public class P2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < (2 * i) + 1; j++ ) {
				if (j % 2 ==0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
