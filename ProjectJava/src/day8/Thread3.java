package day8;

import java.text.*;
import java.util.*;

public class Thread3 {

	public static void main(String[] args) {
		Thread thread11 = new MultiThreadTest("[ Thread " + 1 + "]");
		thread11.setPriority(Thread.MIN_PRIORITY );
		thread11.start();
		Thread thread22 = new MultiThreadTest("[ Thread " + 2 + "]");
		thread22.setPriority(Thread.MAX_PRIORITY);
		thread22.start();

	}
}

class MultiThreadTest extends Thread {
	public MultiThreadTest(String threadName) {
		this.setName(threadName);
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_Start ");
	}
}
//thread11.setPriority(Thread.MIN_PRIORITY ); 쓰레드의 우선순위를 지정한 값으로 변경한다.