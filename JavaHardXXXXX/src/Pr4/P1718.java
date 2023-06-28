package Pr4;

public class P1718 {

	public static void main(String[] args) {
//		int k20_iVal;
//		for(int k20_i = 0; k20_i < 300; k20_i++) {
//			k20_iVal = 5 * k20_i;
//			if(k20_iVal>=0 && k20_iVal<10) System.out.println("일 " + k20_iVal);
//			else if(k20_iVal >= 10 && k20_iVal<100) System.out.println("십" + k20_iVal);
//			else if(k20_iVal >= 100 && k20_iVal<1000) System.out.println("백" + k20_iVal);
//			else  System.out.println("천" + k20_iVal);
//			
//				
//		}

		for (int k20_i = 1; k20_i < 13; k20_i++) {
			System.out.printf(" %d월 =>", k20_i);
			for (int k20_j = 1; k20_j < 32; k20_j++) {

				System.out.printf("%d", k20_j);

				if (k20_i == 1 && k20_j == 31)
					break;
				if (k20_i == 2 && k20_j == 28)
					break;
				if (k20_i == 3 && k20_j == 31)
					break;
				if (k20_i == 4 && k20_j == 30)
					break;
				if (k20_i == 5 && k20_j == 31)
					break;
				if (k20_i == 6 && k20_j == 30)
					break;
				if (k20_i == 7 && k20_j == 31)
					break;
				if (k20_i == 8 && k20_j == 31)
					break;
				if (k20_i == 9 && k20_j == 30)
					break;
				if (k20_i == 10 && k20_j == 31)
					break;
				if (k20_i == 11 && k20_j == 30)
					break;
				if (k20_i == 12 && k20_j == 31)
					break;
				System.out.print(",");

			}
			System.out.print(".");
			System.out.println();
		}
	}

}
