package Pr2;

public class CastingEx4 { // Ŭ���� ����

	public static void main(String[] args) {
		int k20_i = 91234567; // i��� ���������� �����ϰ� 9.1234567�� �ʱ�ȭ
		float k20_f = (float) k20_i; // �Ǽ� f�� i�� �Ǽ�ȭ�� ����
		int k20_i2 = (int) k20_f; // �Ǽ� i2�� f�� ����ȭ�� ����

		double k20_d = (double) k20_i; // double d�� i�� doubleȭ�� ����
		int k20_i3 = (int) k20_d; // ���� i3�� d�� ����ȭ�� ����
		float k20_f2 = 1.666f; // f2��� float������ �����ϰ� 1.666f�� �ʱ�ȭ
		int k20_i4 = (int) k20_f2; // ���� i4�� f2�� ����ȭ�� ����

		System.out.printf("i=%d\n", k20_i);
		// ���� i�� ���
		System.out.printf("f=%f i2=%d\n", k20_f, k20_i2);
		// ���� f�� i2�� ���
		System.out.printf("d=%f i3=%d\n", k20_d, k20_i3);
		// ���� d�� i3�� ���
		System.out.printf("(int)%f=%d\n", k20_f2, k20_i4);
		// ���� f2�� i4�� ���

	}

}
