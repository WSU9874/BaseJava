package Pr4;

public class P16 { // Ŭ���� ����

	public static void main(String[] args) {
		int k20_il; // il��� int������ �����Ѵ�
		double k20_iD; // iD��� double������ �����Ѵ�

		k20_il = 10 / 3; // il�� 10/3�� ���̴�
		k20_iD = 10 / 3.0; // iD�� 10/3�� �Ǽ� ���̴�

		if (k20_il == k20_iD) // ���� il�� iD�� ���ٸ�
			System.out.println("equal"); // ������ ����Ѵ�
		else // �׿ܿ���
			System.out.printf("Not equal[%f][%f]\n", (double) k20_il, k20_iD);
		// �����ʴٴ� ������ ����ϰ� il�� iD�� �Ǽ����� ���

		if (k20_iD == 3.333333) // ���� iD�� 3.333333���
			System.out.println("equal"); // ������ ����Ѵ�
		else // �׿ܿ���
			System.out.printf("Not equals[3.333333][%f]\n", k20_iD);
		// ���� �ʴٴ� ������ ����ϰ� �� ���� ���

		k20_iD = (int) k20_iD; // doubleiD�� ������ ����ȯ��Ų��.
		if (k20_il == k20_iD) // ���� il�� iD�� ���ٸ�
			System.out.printf("equal\n"); // ������ ���
		else // �׿ܿ���
			System.out.printf("Not equal[%f][%f]\n", (double) k20_il, k20_iD);
		// ���� �ʴٴ� ������ ����ϰ� il�� iD�� �Ǽ����� ���

		System.out.printf("int�� �μ�[%d][%f]\n", k20_il, k20_iD);
		// �� ���� �Ҽ����� ���� ���������� ���
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k20_il, k20_iD);
		// �� ���� �Ǽ� ������ ��� (iD�� �̹� �Ҽ������ϸ� ������ ����ȭ)

		char k20_a = 'c'; // a��� char������ �����ϰ� ���� 'c'�̴�
		if (k20_a == 'b') // ���� a�� b���
			System.out.printf("a�� b�̴�\n"); // ������ ���
		if (k20_a == 'c') // ���� a�� c���
			System.out.printf("a�� c�̴�\n"); // ������ ���
		if (k20_a == 'd') // ���� a�� d���
			System.out.printf("a�� d�̴�\n"); // ������ ���

		String k20_aa = "abcd"; // aa��� String������ �����ϰ� ���� 'abcd'�̴�

		if (k20_aa.equals("abcd")) // ���� aa�� abcd���
			System.out.printf("aa�� abcd�̴�\n"); // ������ ���
		else // �׿ܿ���
			System.out.println("aa�� abcd�� �ƴϴ�\n"); // ������ ���

		boolean k20_bb = true; // bb��� boolean������ �����ϰ� ���� true��

		if (!!k20_bb) // ���� bb�� ���� �ƴ϶��
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n"); // ������ ���
		else // �׿ܿ���
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n"); // ������ ���

	}
}