package d4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String date1 = scanner.next();
		String date2 = scanner.next();
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		
		Date d1 = format.parse(date1);
		Date d2 = format.parse(date2);
		
		long Sec = (d2.getTime() - d1.getTime()) / 1000;
		long Days = Sec / (24 * 60 * 60) - 1;
		
		System.out.println(Days);
	}
}