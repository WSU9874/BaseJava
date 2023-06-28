package Pr4;

public class forPrac {

	public static void main(String[] args) {
		int k20_sum = 0;

		for (int k20_i = 0; k20_i < 10; k20_i++) {
			k20_sum = k20_sum + 1;
		}
		System.out.printf("sum %d\n", k20_sum);

		for (int k20_i = 1; k20_i < 10; k20_i++) {
			System.out.println("************************");
			System.out.printf("    구구단 %d 단 \n", k20_i);
			System.out.println("************************");
			for (int k20_j = 1; k20_j < 10; k20_j++) {
				System.out.printf("%d * %d = %d \n", k20_i, k20_j, k20_i * k20_j);
			}
		}

	}

}
