package d6JAVA04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String date1 = scanner.next();
		String date2 = scanner.next();
		DateFormat format = new SimpleDateFormat("ss");
		
		Date d1 = format.parse(date1);
		Date d2 = format.parse(date2);
		
		long Sec = (d2.getTime() - d1.getTime()) / 1000;
		
		
		System.out.println(Sec);
	}
}