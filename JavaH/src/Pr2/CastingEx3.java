package Pr2;

public class CastingEx3 { // Ŭ���� ����

	public static void main(String[] args) {
		float k20_f = 9.1234567f; // f��� float������ �����ϰ� 9.1234567f�� �ʱ�ȭ
		double k20_d = 9.1234567; // d��� double������ �����ϰ� 9.1234567�� �ʱ�ȭ
		double k20_d2 = (double) k20_f; // double d2�� �����ϰ� f�� doubleȭ�Ͽ� ����

		System.out.printf("k20_f =%20.18f\n", k20_f);
		// ���� f���
		System.out.printf("k20_d =%20.18f\n", k20_d);
		// ���� d���
		System.out.printf("k20_d2 =%20.18f\n", k20_d2);
		// ���� d2���

	}

}
