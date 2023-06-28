package d4;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I go to school";

		System.out.println("O - " + number(s, 'o'));

	}

	public static int number(String s, char c) {
		int n = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				n++;
			}
		}
		return n;

	}

}
