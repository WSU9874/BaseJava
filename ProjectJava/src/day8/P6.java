package day8;

import java.text.*;
import java.util.*;


public class P6 {
	public static void main(String[] args) {
	SimpleDateFormat format = new SimpleDateFormat ("dd:mm:ss");
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
