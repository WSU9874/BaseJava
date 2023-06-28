package day3;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			sum = sum + 1;
		}
		System.out.println(sum);
		
		sum = 0;
		int i = 1;
		while (i < n + 1) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);

	}

}
