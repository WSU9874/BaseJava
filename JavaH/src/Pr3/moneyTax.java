package Pr3;

public class moneyTax {

	public static void main(String[] args) {
		int k20_val = 271;	//������ ���� ���� �� �� ����
		int k20_rate = 3;	//������ ���� ���� �� �� ����
		
		int k20_tax = k20_taxcal(k20_val, k20_rate);	//�Լ� taxcal�� ����ϰ� ���� �� ����
		
		System.out.println("*********************************************");	//���ʼ� ���
		System.out.println("**             �ܼ� ���� ���              **");	//���� ���
		System.out.printf("���� ���ݰ��: %f\n", k20_val * k20_rate / 100.0);	//������ ���� * ���� / 100
		System.out.printf("��������; % d ���� : %d �����԰���: %d\n", k20_val, k20_tax, k20_val + k20_tax);
		//�������ݰ� ���ݰ� ������ ������ ���
		System.out.println("*********************************************");	//�Ʒ��� ���
		

	}
	//static �޸𸮿� ������
	//������ �Լ��� ȣ�� �� ���� ���� 
	public static int k20_taxcal(int k20_val, int k20_rate) {	//������ ���� ���� �Լ� ���� 
		int k20_ret20;	//������ �Լ� ����
		
		if(((double)k20_val * (double)k20_rate / 100.0) == k20_val * k20_rate / 100) {	
			//�Ǽ����� val�� rate / 100�� ������ val * k20/100�� ������
			k20_ret20 = k20_val * k20_rate / 100;	//ret20�� �Ҽ��� �Ʒ��� ���� ������
		} else {	//���� ���ǽ��� �ƴϸ�
			k20_ret20 = k20_val * k20_rate / 100 + 1;	//�Ҽ����Ʒ��� ������ 1�� ����
		}
		return k20_ret20;	//���� ��ȯ
	}

}
