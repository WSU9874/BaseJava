package Pr2;

public class CastingEx2 { // Ŭ���� ����

	public static void main(String[] args) {
		int k20_i = 10; // i��� ���������� �����ϰ� 10���� �ʱ�ȭ
		byte k20_b = (byte) k20_i; // b��� byte������ �����ϰ� i�� byteȭ �ؼ� ����
		System.out.printf("[int -> byte] k20_i=%d -> k20_b=%d%n", k20_i, k20_b);
		// ���� i�� b ���� ���

		k20_i = 300; // i��� ���������� �������ϰ� 300���� �ʱ�ȭ
		k20_b = (byte) k20_i; // b��� byte������ �������ϰ� i�� byteȭ �ؼ� ����
		System.out.printf("[int -> byte] k20_i=%d ->k20_ b=%d%n", k20_i, k20_b);
		// ���� i�� b ���� ���

		k20_b = 10; // b��� ���������� �������ϰ� 10���� �ʱ�ȭ
		k20_i = (int) k20_b; // i��� int������ �������ϰ� b�� intȭ �ؼ� ����
		System.out.printf("[byte -> int] b=%d -> k20_i=%d%n", k20_b, k20_i);
		// ���� i�� b ���� ���

		k20_b = -2; // b��� ���������� �������ϰ� -2���� �ʱ�ȭ
		k20_i = (int) k20_b; // i��� int������ �������ϰ� b�� intȭ �ؼ� ����
		System.out.printf("[byte -> int] k20_b=%d -> k20_i=%d%n", k20_b, k20_i);
		// ���� i�� b ���� ���

		System.out.println("i=" + Integer.toBinaryString(k20_i));
		// ���� 2������ ���

	}

}
