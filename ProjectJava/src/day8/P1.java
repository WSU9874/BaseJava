package day8;

import java.text.SimpleDateFormat;
import java.util.Date;


public class P1 {
	public static void main(String[] args) {
	SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd:mm:ss");
	Date time = new Date();
	String dateAndTime = format.format(time);
	
	System.out.println(dateAndTime);
	System.out.println("start");
	int i =0;
	while ( i < 6) {
	try {
		Thread.sleep(1000);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	time = new Date();
	dateAndTime = format.format(time);
	
	
	System.out.println(1);
	i++;
	}
	System.out.println("end");
	}
}
