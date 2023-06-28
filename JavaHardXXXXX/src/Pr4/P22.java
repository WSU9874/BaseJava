package Pr4;

public class P22 {

	public static void main(String[] args) {
		String[] k20_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		for (int k20_i = 0; k20_i < 101; k20_i++) {

			if (k20_i >= 0 && k20_i < 10) {
				System.out.printf("일의자리 : %s\n", k20_units[k20_i]);
			} else if (k20_i >= 10 && k20_i < 100) {
				int k20_i10, k20_i0;
				k20_i10 = k20_i / 10;
				k20_i0 = k20_i % 10;
				if (k20_i0 == 0) {
					System.out.printf("십의자리 : %s십\n", k20_units[k20_i10]);
				} else {
					System.out.printf("십의자리 : %s십%s\n", k20_units[k20_i10], k20_units[k20_i0]);
				}
			} else
				System.out.printf("==> %d\n", k20_i);
		}
	}

}
