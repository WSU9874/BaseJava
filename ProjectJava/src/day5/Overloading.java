package day5;

public class Overloading {

	public static void main(String[] args) {

		print("hello world");
		print(3, 6);
	}

	public static void print(int a, int b) {
		System.out.println(a + b);
	}

	public static void print(String line) {
		System.out.println(line);
	}

}
