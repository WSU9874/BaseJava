package Pr4;

public class P19 { //Ŭ���� ����

	public static void main(String[] args) {
		for (int k20_i = 1; k20_i < 13; k20_i++) {
		//����i�� �����ϰ� 1�� �ʱ�ȭ, i�� 1���� 12�ɶ����� ����, i�� ����1ȸ���� 1������
			System.out.printf("%d�� =>", k20_i);	//i�� ���
			for (int k20_j = 1; k20_j < 32; k20_j++) {	
			//����j�� �����ϰ� 1�� �ʱ�ȭ, j�� 1���� 31�ɶ����� ����,j�� ����1ȸ���� 1������

				System.out.printf("%d,", k20_j);	//j�� ���

				if ((k20_i == 4 || k20_i == 6 || k20_i == 9 || k20_i == 11 || k20_i == 7) && (k20_j == 30))
					break;
				//���� i�� 4 or 6 of 7 or 9 or 9 or 11�̰� ���ÿ� j�� 30�̶�� ������ �����.
				if (k20_i == 2 && k20_j == 28)
				break;
				//���� i�� 2�̰� ���ÿ� j�� 28�̸� ������ �����

			}
			System.out.println();	//�ٹٲ�
		}

	}

}
///////////////////////////////////////////////////////////////
//���õǸ� ���� �ڵ� ���
//if(k20_i == 4|| k20_i==6 || k20_i==7 || k20_i==11) {
//	if(k20_j==30) break;
//}
//
//if(k20_i==2) {
//	if(k20_j==28) break;
//}