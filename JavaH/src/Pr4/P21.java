package Pr4;

public class P21 {

	public static void main(String[] args) {
		int[] k20_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//���� �迭 iLMD�� �����ϰ� �迭�� ���ڸ� �ִ´�

		for (int k20_i = 1; k20_i < 13; k20_i++) {
			//���� i�� �����ϰ� ���� 1�� �ʱ�ȭ���� 
			//1�� 12�ɶ����� �ݺ��ϰ�,i�� �������� 1�� ����
			System.out.printf("%d�� => ", k20_i);
			//����i�� ���
			for (int k20_j = 1; k20_j < 32; k20_j++) {
			//���� j�� �����ϰ� ���� 1�� �ʱ�ȭ���� 
			//1�� 31�ɶ����� �ݺ��ϰ�,j�� �������� 1�� ����
				System.out.printf("%d", k20_j);
				//j�� ���

				if (k20_iLMD[k20_i - 1] == k20_j)
					break;
				//���� i-1�� j�� ���ٸ� ������ �����

				System.out.print(".");
				//.�� ����Ѵ�
			}
			System.out.println();	//�ٹٲ�
		}

	}

}
