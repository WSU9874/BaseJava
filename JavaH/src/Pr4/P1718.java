package Pr4;

public class P1718 {	// Ŭ���� ����

	public static void main(String[] args) {
		int k20_iVal;	//iVal��� int������ �����Ѵ�
		for (int k20_i = 0; k20_i < 300; k20_i++) {	
			//i�� 0���� 299�ɶ����� �ݺ�,i�� 1ȸ�������� 1������
			k20_iVal = 5 * k20_i;	//���� iVal�� 5 * i
			if (k20_iVal >= 0 && k20_iVal < 10)	//���� iVal�� 0�̻� 10�̸��̶��
				System.out.println("�� " + k20_iVal);	//��+iVal�� ���
			else if (k20_iVal >= 10 && k20_iVal < 100)
			//���� ���� iVal�� 10�̻� 100�̸��̶��
				System.out.println("��" + k20_iVal);	//��+iVal���
			else if (k20_iVal >= 100 && k20_iVal < 1000)
			//���� ���� iVal�� 100�̻� 1000�̸��̶��
				System.out.println("��" + k20_iVal);	//��+iVal���
			else	//�� �ܿ���
				System.out.println("õ" + k20_iVal);	//õ+iVal���

		}

		for (int k20_i = 1; k20_i < 13; k20_i++) {
		//i�� 1���� 12�ɶ����� �ݺ� i�� 1ȸ�������� 1������
			System.out.printf(" %d�� =>", k20_i);	//�������� i�� ���
			for (int k20_j = 1; k20_j < 32; k20_j++) {
			//j�� 1���� 31�ɶ����� �ݺ� j�� 1ȸ�������� 1�� ����	

				System.out.printf("%d", k20_j);	//j�� ��� (1,...31)

				if (k20_i == 1 && k20_j == 31)	//���ǿ� ������ break(i�� �� j�� ��)
					break;						//						1���� 31����
				if (k20_i == 2 && k20_j == 28)	//���ǿ� ������ break		|
					break;						//						2���� 28����
				if (k20_i == 3 && k20_j == 31)	//���ǿ� ������ break		|
					break;						//						3���� 31����
				if (k20_i == 4 && k20_j == 30)	//���ǿ� ������ break		|
					break;						//						4���� 30����
				if (k20_i == 5 && k20_j == 31)	//���ǿ� ������ break		|
					break;						//						5���� 31����
				if (k20_i == 6 && k20_j == 30)	//���ǿ� ������ break		|
					break;						//						6���� 30����
				if (k20_i == 7 && k20_j == 31)	//���ǿ� ������ break		|
					break;						//						7���� 31����
				if (k20_i == 8 && k20_j == 31)	//���ǿ� ������ break		|
					break;						//						8���� 31����
				if (k20_i == 9 && k20_j == 30)	//���ǿ� ������ break		|
					break;						//						9���� 30����
				if (k20_i == 10 && k20_j == 31)	//���ǿ� ������ break		|
					break;						//						10���� 31����
				if (k20_i == 11 && k20_j == 30)	//���ǿ� ������ break		|
					break;						//						11���� 30����
				if (k20_i == 12 && k20_j == 31)	//���ǿ� ������ break		|
					break;						//						12���� 31����
				System.out.print(",");	//j�� ��µɶ����� ,�� ��´�
										//������ j���� break�⶧���� ,�� ������ �ʴ´�.
			}
			System.out.print(".");	//������j �ڿ� .�� ��´�.
			System.out.println();	//�ٹٲ�
		}
	}

}
