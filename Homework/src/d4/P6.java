package d4;

import java.util.Calendar;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();

		int month = scanner.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int startDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		int lastDay = cal.getActualMaximum(Calendar.DATE);

		System.out.println(year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int i = 1; i < startDayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if ((startDayOfWeek + i - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
