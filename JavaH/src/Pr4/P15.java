package Pr4;

public class P15 { // Ŭ���� ����

	public static void main(String[] args) {
		int k20_iA, k20_iB; // iA, iB��� int������ �����Ѵ�

		k20_iA = 0; // iA�� 0���� �ʱ�ȭ �Ѵ�.
		while (true) { // ���ѹݺ�

			k20_iB = 0; // iB�� 0���� �ʱ�ȭ �Ѵ�.
			while (true) { // ���ѹݺ�
				System.out.print("*"); // *�� ����Ѵ�

				if (k20_iA == k20_iB) // ���� iA�� iB�� ���ٸ�
					break; // ������ �����Ѵ�
				k20_iB++; // iB�� ���� +1�Ѵ� /�ٽ� ����

			}
			System.out.println(); // �ٹٲ�
			k20_iA++; // iA���� +1�Ѵ�
			if (k20_iA == 30) // ���� iA�� 30�̶��
				break; // ������ �����Ѵ�.
		}
	}
}
