package day8; //스레드 동기화는 멀티스레드 환경에서 여러 스레드가 하나의 공유자원에
			//동시에 접근하지 못하도록 막는것을 말합니다.
//은행에서 돈뺄때 내가 빼고있을떄 다른곳에서 접근하지 못하게 잠금을 건다
//한 스레드가 일하고 있을때 다른 쓰레드가 일하면 결과물이 달라질수 있다 이를 방지하기 위해 사용

public class Syncro {

	public static void main(String[] args) {
		StringDisplay sd = new StringDisplay();
		MyThread[] mts = new MyThread[5];
		for (int i=0; i<mts.length; i++) {
			mts[i] = new MyThread(sd, Integer.toString(i));	
			mts[i].start();
		}
	}
}

class StringDisplay {
	synchronized void display(String s) {
		for (int i=0; i<5; i++) {
			System.out.print(s);
		}
		System.out.println("");
	}
}

class MyThread extends Thread {
	StringDisplay sd;
	String s = "";
	
	public MyThread(StringDisplay sd, String s) {
		this.sd = sd;
		this.s = s;
	}
	
	@Override
	public void run() {
		sd.display(s);
	}
}
