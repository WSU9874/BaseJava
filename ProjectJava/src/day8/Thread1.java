package day8;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Thread1 {
	public static void main(String[] args) {
	SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd:mm:ss");
	Date time = new Date();
	String dateAndTime = format.format(time);
	
	System.out.println(dateAndTime);
	System.out.println("start");
	
	try {
		Thread.sleep(3000);
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	time = new Date();
	dateAndTime = format.format(time);
	System.out.println(dateAndTime);
	System.out.println("end");
	}
}

// sleep은 지정한 시간동안 쓰레드를 멈추게 한다.