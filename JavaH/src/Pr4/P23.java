package Pr4;

public class P23 {

	public static void main(String[] args) {
		int k20_iNumVal = 2000000000;
		// iNumVal��� int������ �����ϰ� ���� 1001034567�� �Ѵ�

		String k20_sNumVal = String.valueOf(k20_iNumVal);
		// ���ڿ� ���� sNumVal�� �����ϰ� �������� iNumVal�� ���ڿ��� ��ȯ�� ����

		String k20_sNumVoice = "";
		// ���ڿ� ���� sNumVoice�� �����Ѵ�.

		System.out.printf("==> %s [%d�ڸ�]\n", k20_sNumVal, k20_sNumVal.length());
		// ���� sNumVal�� �� ������ ���̸� ���

		int k20_i, k20_j; // ������ ���� i,j�� ����

		String[] k20_units = { "��", "", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// ���ڿ� �迭 units�� �����ϰ� ���ڸ� �迭�� �ִ´�.
		String[] k20_unitx = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���ڿ� �迭 units�� �����ϰ� ���ڸ� �迭�� �ִ´�.

		k20_i = 0; // i�� 0���� �ʱ�ȭ
		k20_j = k20_sNumVal.length() - 1;
		// j�� ���ڿ� sNumVal�� ���� -1�� �ʱ�ȭ
		int k20_cnt = 0;

		while (true) { // ���ѷ���
			if (k20_i >= k20_sNumVal.length()) // ���� ���� i�� ���ڿ� sNumVal�� ���̿� ���ٸ� ���� ����
				break;
			if (k20_sNumVal.length() == 9 && k20_sNumVal.charAt(0) == '1') {
				// ���� sNumVal�� ���̰� 9�̰� ù��°�ڸ��� 1�̸�
				k20_units[1] = "��"; // units�迭�� �߰��Ѵ�
			}
			System.out.printf("%s[%s]", k20_sNumVal.substring(k20_i, k20_i + 1),
					k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]);
			// ���ڿ� sNumVal�� i��°���� i+1��°������ �ڸ���, units�迭���� ���ڿ� sNumVal��
			// i��°���� i+1��°������ �ڸ����� ������ ��ȯ�Ͽ� ����Ѵ�.

			if (k20_sNumVal.substring(k20_i, k20_i + 1).equals("0")) {
				// ���� ���ڿ� sNumVal�� i��°���� i+1��°������ �ڸ����� 0�̶��

				if (k20_unitx[k20_j].equals("��")) {

					// ���� �迭unitx�� j��°�� '��'�̰ų� ���̶��
					k20_sNumVoice = k20_sNumVoice + "" + k20_unitx[k20_j];
					// sNumVoice�� sNumVoice+unitx�迭�� j��°�� ���̴�

				} else if (k20_sNumVal.length() < 9 && k20_unitx[k20_j].equals("��")) { 
					// �׿ܿ� ���� sNumVal�� ���̰� 9�̸� ���ÿ� '��'�� �����ϸ�
					k20_sNumVoice = k20_sNumVoice + "" + k20_unitx[k20_j];
					// sNumVoice�� sNumVoice+unitx�迭�� j��°�� ���̴�

				}

			} else { // �׿ܿ���
				if (k20_j == k20_cnt - 1) { // ���� j(sNumVal���ڿ��� ���� -1)�� ���� cnt�� �� -1���
											// -> �ݺ��Ŀ� ������ ���ڰ� 1�̸� �迭���� 1�� �߰��Ѵ�
											// ���������� ���� �ʿ����
					if (k20_sNumVal.charAt(k20_sNumVal.length() - 1) == '1') { // ���� sNumVal�� ������ ���� 1�̶��
						k20_units[1] = "��";// �׿ܿ��� //units�迭�� 2��° ���� "��"�� �����Ѵ�.
					}
				}
				k20_sNumVoice = k20_sNumVoice + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]
						+ k20_unitx[k20_j];
				// sNumVoice�� sNumVoice�� units�迭���� ���ڿ� sNumVal��
				// i��°���� i+1��°������ �ڸ����� ������ ��ȯ�� ���� ���� ���ڿ��̴�.

			}
			k20_cnt++; // �������� cnt�� 1������Ų��

			k20_i++; // i�� 1���Ѵ�
			k20_j--; // j�� 1����
		}
		System.out.printf("\n %s[%s]\n", k20_sNumVal, k20_sNumVoice);
		// ���ڿ� sNumVal�� sNumVoice�� ����Ѵ�.

	}

}
