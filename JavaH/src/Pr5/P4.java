package Pr5;

public class P4 {

	public static void main(String[] args) {
		for (int i = 1; i < 8; i = i + 3) {
			System.out.println("**************\t**************\t**************");
			System.out.printf("备备窜 %d窜	备备窜 %d窜	备备窜 %d窜\n", i, i + 1, i + 2);
			System.out.println("**************\t**************\t**************");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d	 %d * %d = %d	%d * %d = %d\n",
						i, j, i * j, i + 1, j, (i + 1) * j, i + 2, j, (i + 2) * j);
			}

		}

	}

}
