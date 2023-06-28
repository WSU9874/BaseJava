package Pr5;

public class P6 {

	public static void main(String[] args) {
		int iWeekday = 5;
		int vd_flag = 0;

		int[] iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (vd_flag == 0) {
			iEnd[1] = 28;
		}
		for (int iMon = 0; iMon < 12; iMon++) {
			System.out.printf("\n\n	%d월\n", iMon + 1);
			System.out.println("======================");
			System.out.println(" 일 월 화 수 목 금 토");
			System.out.print(" ".repeat(iWeekday * 3));
			for (int i = 1; i <= iEnd[iMon]; i++) {

				System.out.print(" ");
				System.out.printf("%2d", i);
				iWeekday++;

				if (iWeekday % 7 == 0) {
					iWeekday = 0;
					System.out.println();

				}

			}

		}
	}
}
