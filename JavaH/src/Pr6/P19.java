package Pr6;

public class P19 {

	public static void main(String[] args) {

		P16Elevater3 elev3;

		elev3 = new P16Elevater3();
		for (int i = 0; i < 10; i++) {
			elev3.up();
			System.out.printf("MSG elev3[%s]\n", elev3.help);
		}
		for (int i = 0; i < 10; i++) {
			elev3.down();
			System.out.printf("MSG elev3[%s]\n", elev3.help);
		}
		elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", elev3.help);

	}

}
