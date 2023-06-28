package day8;

import java.text.*;
import java.util.*;

public class Thread2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread2 Thread = new Thread2();
		Thread.start();
		System.out.println("Chesck i : " + getCurrentTime() + "-" + Thread.isAlive());
		Thread.sleep(3000);
		System.out.println("Chesck i : " + getCurrentTime() + "-" + Thread.isAlive());

	}

	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}

	public void run() {
		int cnt = 0;
		while (true) {
			if (cnt == 5) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
