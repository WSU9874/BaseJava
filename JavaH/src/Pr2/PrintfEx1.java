package Pr2;

public class PrintfEx1 { // Ŭ���� ����

	public static void main(String[] args) {
		byte k20_b = 1; // b��� ����Ʈ�� ������ �����ϰ� 1���� �ʱ�ȭ
		short k20_s = 2; // s��� short�� ������ �����ϰ� 2���� �ʱ�ȭ
		char k20_c = 'A'; // c��� ĳ������ ������ �����ϰ� A���� �ʱ�ȭ

		int k20_finger = 10; // finger��� ������ ������ �����ϰ� 10���� �ʱ�ȭ
		long k20_big = 100000000000L; // big��� long�� ������ �����ϰ� 100000000000L���� �ʱ�ȭ
		long k20_hex = 0xFFFFFFFFFFFFFFFL; // hex��� long�� ������ �����ϰ� 0xFFFFFFFFFFFFFFFL���� �ʱ�ȭ

		int k20_octNum = 010; // octNum��� ������ ������ �����ϰ� 010���� �ʱ�ȭ(8����)
		int k20_hexNum = 0x10; // hexNum��� ������ ������ �����ϰ� 0x10���� �ʱ�ȭ(16����)
		int k20_binNum = 0b10; // binNum��� ������ ������ �����ϰ� 0b10���� �ʱ�ȭ(2����)

		System.out.printf("b=%d%n", k20_b); // b������ ���
		System.out.printf("s=%d%n", k20_s); // s������ ���
		System.out.printf("c=%c, %d %n", k20_c, (int) k20_c); // ����c�� ���, c�� ���������� ��ȯ�Ͽ� ���
		System.out.printf("k20_finger=[%5d]%n", k20_finger); // �� 5ĭ�� ����finger �� ������ 3ĭ ��� ���
		System.out.printf("k20_finger=[%-5d]%n", k20_finger); // �� 5ĭ�� ����finger �� ������ 3ĭ ��� ���
		System.out.printf("k20_finger=[%05d]%n", k20_finger); // �� 5ĭ�� ����finger �� ������ 3ĭ 0 ���
		System.out.printf("big=%d%n", k20_big); // long���� big ���
		System.out.printf("hex=%#x%n", k20_hex); // long���� hex���
		System.out.printf("k20_octNum=%o, %d%n", k20_octNum, k20_octNum);// octNum������ 10����, 8������ ���
		System.out.printf("k20_hexNum=%x, %d%n", k20_hexNum, k20_hexNum);// hexNum������ 10����, 16������ ���
		System.out.printf("k20_binNum=%s, %d%n", Integer.toBinaryString(k20_binNum), k20_binNum);
		// binNum������ 10����, 2������ ���

	}

}
