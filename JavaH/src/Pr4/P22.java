package Pr4;

public class P22 {

	public static void main(String[] args) {
		String[] k20_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		//���ڿ� �迭 units�� �����ϰ� �迭�� ���ڸ� �ִ´�
		for (int k20_i = 0; k20_i < 101; k20_i++) {
			//���� i�� �����ϰ� ���� 0�� �ʱ�ȭ���� 
			//0�� 100�ɶ����� �ݺ��ϰ�,i�� �������� 1�� ����

			if (k20_i >= 0 && k20_i < 10) {
				//���� i�� 0�̻� 10�̸��̸�
				System.out.printf("�����ڸ� : %s\n", k20_units[k20_i]);
				//i��° �迭�� ����Ѵ�
			} else if (k20_i >= 10 && k20_i < 100) {
				//���� ���� i�� 10�̻� 100�̸��̸�
				int k20_i10, k20_i0;	//���� ���� i10,i0�� �����Ѵ�
				k20_i10 = k20_i / 10;	//i10�� i/10
				k20_i0 = k20_i % 10;	//i0�� i/10�� ������
				if (k20_i0 == 0) {	//���� i0�� 0�̸�
					System.out.printf("�����ڸ� : %s��\n", k20_units[k20_i10]);
					//units�迭�� i10��° �迭�� ���
				} else {	//�׿ܿ���
					System.out.printf("�����ڸ� : %s��%s\n", k20_units[k20_i10], k20_units[k20_i0]);
					//units�迭�� i10��° �迭�� i0��° �迭�� ���
				}
			} else	//�� �ܿ���
				System.out.printf("==> %d\n", k20_i);
			//i�� ���
		}
	}

}
