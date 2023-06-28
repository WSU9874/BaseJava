package day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lotto {

	public static void main(String[] args) {

		System.out.println("start");
		int i = 0;
		while (i < 6) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int c = getLottoNumber();
			System.out.println(c);

			i++;

		}
		System.out.println("end");

	}

	public static int getLottoNumber() {
		return (int) (Math.random() * 46);
	}
}
