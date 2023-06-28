package day4;
import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TimeZone11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		time = TimeZone.getTimeZone("Europe/France");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		

	}

}
