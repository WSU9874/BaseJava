package Pr4;

public class P19 {

	public static void main(String[] args) {
		for (int k20_i = 1; k20_i < 13; k20_i++) {
			System.out.printf("%d월 =>", k20_i);
			for (int k20_j = 1; k20_j < 32; k20_j++) {

				System.out.printf("%d,", k20_j);

				if ((k20_i == 4 || k20_i == 6 || k20_i == 9 || k20_i == 11 || k20_i == 7) && (k20_j == 30))
					break;
				if (k20_i == 2 && k20_j == 28)
				break;

			}
			System.out.println();
		}

	}

}

//if(k20_i == 4|| k20_i==6 || k20_i==7 || k20_i==11) {
//if(k20_j==30) break;
//}
//
//if(k20_i==2) {
//if(k20_j==28) break;
//}