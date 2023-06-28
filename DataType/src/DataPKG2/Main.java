package DataPKG2;

public class Main {

	public static void main(String[] args) {
		int cnt = 2;
		while (cnt < 10) {
			System.out.println("5 X "+ cnt + " = " + (5 * cnt));
			cnt++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

		

	}
}
	class MultiThreadTest extends Thread {

		@Override
		public void run() {
			super.run();
		}
		
		}
	

	
	}
		
	}

}
}
}
/*MultiThreadTest thread2 = new MultiThreadTest("thread2", 2);
thread2.setPriority(Thread.MAX_PRIORITY);
thread2.start();
MultiThreadTest thread3 = new MultiThreadTest("thread3", 3);
thread2.setPriority(5);
thread3.start();
MultiThreadTest thread4 = new MultiThreadTest("thread4", 4);
thread4.setPriority(Thread.MAX_PRIORITY);
thread4.start();
*/

