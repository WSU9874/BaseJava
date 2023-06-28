package day8;
//앱, 시스템에서 쓰레드 많이씀
//인터페이스에서 씀
public class Thread4 implements Runnable {

	public static void main(String[] args) {
		Thread4 main = new Thread4();
		Thread thread = new Thread(main);
		thread.start();

	}

	@Override
	public void run() {
		System.out.println("Thread");
	}

}
//runable 실행 중 또는 실행 가능한 상태
