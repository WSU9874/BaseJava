package Pr6;

public class P13myTest {

	static P13Elevator2 eLev1;
	static P13Elevator2 eLev2;
	static P13Elevator2 eLev3;

	public static void main(String[] args) {
		eLev1 = new P13Elevator2();
		eLev2 = new P13Elevator2(20, 1, 8);
		eLev3 = new P13Elevator2(50, -3, 5);

		for (int i = 0; i < 20; i++) {
			eLev1.up();
			eLev1.msg("1¹ø¿¤·¹ ÇÑÃþ ¿À¸£±â");
		}
		for (int i = 0; i < 20; i++) {
			eLev1.up(2);
			eLev1.msg("1¹ø¿¤·¹ 2Ãþ ¿À¸£±â");
		}
		for (int i = 0; i < 20; i++) {
			eLev1.down(3);
			eLev1.msg("1¹ø¿¤·¹ 3Ãþ ¿À¸£±â");
		}

	}

}
