package Pr4;

public class P20 {

	public static void main(String[] args) {
		for (int k20_i = 1; k20_i < 13; k20_i++) {
			System.out.print(k20_i + "월 => ");
			LOOP: for (int k20_j = 1; k20_j < 32; k20_j++) {

				System.out.printf("%d.", k20_j);

				switch (k20_i) {
				case 4:
				case 6:
				case 9:
				case 7:
				case 11:
					if (k20_j == 30)
						break LOOP;
					break;
				case 2:
					if (k20_j == 28)
						break LOOP;
					break;
				}

			}
			System.out.println();

		}
	}
}
