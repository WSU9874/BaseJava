package day5;

public class Recurs {

	public static void main(String[] args) {
		int n = addToOne(5);
		System.out.println(n);

	}
	
	public static int addToOne(int n) {
		if ( n== 1) {
			return 1;
		} else {
			return n * addToOne(n - 1);
		}
	}

}
