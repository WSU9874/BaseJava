package Pr4;

public class P27 {

	public static void main(String[] args) {
		int k20_n, k20_m;

		k20_m = 20;
		k20_n = 1;

		while (true) {

			for (int k20_i = 0; k20_i < k20_m; k20_i++)
				System.out.print(" ");
			for (int k20_i = 0; k20_i < k20_n; k20_i++)
				System.out.print("*");
			System.out.println();

			k20_m = k20_m - 1;
			k20_n = k20_n + 2;
			if (k20_m < 0)
				break;
		}

	}

}
