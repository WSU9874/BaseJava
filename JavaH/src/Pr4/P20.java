package Pr4;

public class P20 {	//Ŭ��������

	public static void main(String[] args) {
		for (int k20_i = 1; k20_i < 13; k20_i++) {
		//���� i�� �����ϰ� ���� 1�� �ʱ�ȭ���� 
		//1�� 12�ɶ����� �ݺ��ϰ�,i�� �������� 1�� ����
			System.out.print(k20_i + "�� => ");	//i�� ���
			LOOP: for (int k20_j = 1; k20_j < 32; k20_j++) {
				//���� j�� �����ϰ� ���� 1�� �ʱ�ȭ���� 
				//1�� 31�ɶ����� �ݺ��ϰ�,j�� �������� 1�� ���� 

				System.out.printf("%d.", k20_j);	//j�� ���

				switch (k20_i) {	//����i�� ���� ����ġ�� ����
				case 4:		//����i�� 4�ΰ��
				case 6:		//����i�� 6�ΰ��
				case 9:		//����i�� 9�ΰ��
				case 7:		//����i�� 7�ΰ��
				case 11:	//����i�� 11�ΰ��
					if (k20_j == 30)	//���� j�� 30�̸� ������ �����
						break LOOP;
					break;	//������ �����
				case 2:	//����i�� 2�ΰ��
					if (k20_j == 28)	//����j�� 28�̶�� ������ �����
						break LOOP;		
					break;	//������ �����
				}

			}
			System.out.println();	//�ٹٲ�

		}
	}
}
