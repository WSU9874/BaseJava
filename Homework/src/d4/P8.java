package d4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String date1 = scanner.next();
		String date2 = scanner.next();
		String result = addDays(date1, date2);
		System.out.println(result);
	}

	public static String addDays(String date1, String date2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		try {
			Date d1 = sdf.parse(date1);
			cal.setTime(d1);
			cal.add(Calendar.DATE, Integer.parseInt(date2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sdf.format(cal.getTime());
	}
}
