package Pr2;

public class PrintfEx2 { // Ŭ���� ����

	public static void main(String[] args) {
		String k20_url = "www.codechobo.com"; // ���ڿ�url�� �����ϰ� ������ �ʱ�ȭ

		float k20_f1 = .10f; // �Ǽ��� f1�� �����ϰ� ���� 10f�� �ʱ�ȭ
		float k20_f2 = 1e1f; // �Ǽ��� f2�� �����ϰ� ���� 1e1f�� �ʱ�ȭ
		float k20_f3 = 3.14e3f; // �Ǽ��� f3�� �����ϰ� ���� 3.14e3f�� �ʱ�ȭ
		double k20_d = 1.23456789;// �Ǽ��� d�� �����ϰ� ���� 1.23456789�� �ʱ�ȭ

		System.out.printf("k20_f1=%f, %e, %g%n", k20_f1, k20_f1, k20_f1);
		// ���� f1�� �Ǽ���, ������, ����ȭ�� ����Ѵ�.
		System.out.printf("k20_f2=%f, %e, %g%n", k20_f2, k20_f2, k20_f2);
		// ���� f2�� �Ǽ���, ������, ����ȭ�� ����Ѵ�.
		System.out.printf("k20_f3=%f, %e, %g%n", k20_f3, k20_f3, k20_f3);
		// ���� f3�� �Ǽ���, ������, ����ȭ�� ����Ѵ�.
		System.out.printf("k20_d=%f%n", k20_d);
		// ���� d�� float�� ����Ѵ�
		System.out.printf("k20_d=%14.10f%n", k20_d);
		// ���� d�� 14�ڸ����� ����ϰ� �Ҽ��� 10°�ڸ����� ����Ѵ�

		System.out.printf("[12345678901234567890]%n");
		// []�� ����Ѵ�
		System.out.printf("[%s]%n", k20_url);
		// ���� url�� ����Ѵ�
		System.out.printf("[%20s]%n", k20_url);
		// url�� ����ϰ� 20ĭ�� ����� �������� ä������ ����ĭ�� ��ĭ���� ���
		System.out.printf("[%-20s]%n", k20_url);
		// url�� ����ϰ� 20ĭ�� ����� ���������� ä������ ����ĭ�� ��ĭ���� ���
		System.out.printf("[%.8s]%n", k20_url);
		// url�� ����ϰ� 8ĭ�� ����� �������� ������.

	}

}
