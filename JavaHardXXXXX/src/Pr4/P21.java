package Pr4;

public class P21 {

	public static void main(String[] args) {
		int[] k20_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int k20_i = 1; k20_i < 13; k20_i++) {
			System.out.printf("%d월 => ", k20_i);
			for (int k20_j = 1; k20_j < 32; k20_j++) {
				System.out.printf("%d", k20_j);

				if (k20_iLMD[k20_i - 1] == k20_j)
					break;

				System.out.print(".");
			}
			System.out.println();
		}

	}

}
