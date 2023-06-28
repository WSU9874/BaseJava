package day3;

public class AAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0;i <3; i++) {
			for(int j =0; j < i + 1; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i==1) {
					System.out.print("@");
				}else {
					System.out.print("#");
				}
			}System.out.println();
		}
	}
}