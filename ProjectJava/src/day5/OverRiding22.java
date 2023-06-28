package day5;

public class OverRiding22 extends Doing {
	public OverRiding22(String name, double version) {
	}

	public static void main(String[] args) {
		OverRiding22 nm = new OverRiding22("아빠", 1.2);
		nm.getName();
		OverRiding22 nm1 = new OverRiding22("아엄마", 1.2);
		nm1.getName();

	}

	@Override
	public void getName() {
		super.getName();
		System.out.println("Child");
	}
	
}