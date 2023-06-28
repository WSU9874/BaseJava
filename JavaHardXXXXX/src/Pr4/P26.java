package Pr4;

public class P26 {

	public static void main(String[] args) {
		double k20_fSin;

		for (int k20_i = 0; k20_i < 360; k20_i++) {

			k20_fSin = Math.sin(k20_i * 3.141592 / 180);

			System.out.printf("%d sin ==> %f\n", k20_i, k20_fSin);

		}
		for (int k20_i = 0; k20_i < 360; k20_i++) {
			k20_fSin = Math.sin(k20_i * 3.141592 / 180);

			int k20_iSpace = (int) ((1.0 - k20_fSin) * 50);
			for (int k20_j = 0; k20_j < k20_iSpace; k20_j++)
				System.out.println(" ");
			System.out.printf("*[%f][%d]\n", k20_fSin, k20_iSpace);
		}

	}

}
