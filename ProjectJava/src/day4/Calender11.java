package day4;
import java.util.Calendar;
public class Calender11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar =Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.YEAR) + 1);
		*/int year = 2020;
		int month = Calendar.FEBRUARY;
		int date = 1;
		
		calendar.set(year,  month, date);;
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
				System.out.println(maxDay);

	}

}
