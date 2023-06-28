package day5;

public class OverRiding implements Settings{

	public static void main(String[] args) {
		OverRiding nm = new OverRiding();
		nm.getName();
		nm.getValue();
		nm.getVersion();

	}

	@Override
	public void getName() {
		System.out.println("My name is woo");
	}

	@Override
	public void getValue() {
		System.out.println("My name is uk");
	}

	@Override
	public void getVersion() {
		System.out.println("version 1");
	}

}
