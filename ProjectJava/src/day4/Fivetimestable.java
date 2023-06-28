package day4;

public class Fivetimestable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		int j = 2;
		
		while (i < 10) {
			while (j < 6) {
				System.out.print(" "+ j + "x" + i + "="+ (i * j));
				j++;
			}
			System.out.println();
			j = 2;
			i++;
		}

	}

}
