package javaP2;

public class P4 {

	public static void main(String[] args) {
		
		int j = 1;
		while (j < 10) {
			int i = 2;
			while (i < 6) {
				System.out.print(i + "*" + j + "=" + (i*j)+" ");
				i++;
			}
			System.out.println();
			j++;
			
		}

	}

}
