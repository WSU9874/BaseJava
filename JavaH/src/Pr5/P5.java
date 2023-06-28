package Pr5;

public class P5 {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			System.out.println("**************\t**************\t**************");
			System.out.printf("备备窜 %d窜	备备窜 %d窜	备备窜 %d窜\n", i, i + 3, i + 6);
			System.out.println("**************\t**************\t**************");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d	 %d * %d = %d	%d * %d = %d\n",
						i, j, i * j, i + 3, j, (i + 3) * j, i + 6, j, (i + 6) * j);
			}

		}

	}

}
