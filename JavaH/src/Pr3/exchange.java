package Pr3;

import java.text.DecimalFormat;			//	    |
import java.text.SimpleDateFormat;		// ���̺귯�� Ŭ���� �ҷ�����
import java.util.Calendar;				//		|

public class exchange {

	public static void main(String[] args) {
		int k20_MyWon = 1000000;	//������ ������ ���� �� 100�� ����
		double k20_MoneyEx = 1238.21;	//�Ǽ��� ������ ȯ�� ����
		double k20_commission = 0.003;	//�Ǽ��� ������ ������ ����

		int k20_usd = (int) (k20_MyWon / k20_MoneyEx);	//1�޷����� = (������ ������ ȯ��)�� ��  
		int k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx);	//�ܵ� = ������ - 1�޷������ * ȯ��

		System.out.println("******************************************************");	//����������ٶ�
		System.out.println("*                 ������ ���� ���                   *");	//�������
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", k20_MyWon, k20_usd, k20_remain);
		//������, ȯ���� �޷�, �ܵ� ���
		
		System.out.println("******************************************************");	//����������ٶ�

		///1///////////////////////////////////////////////////////////////////////////////////////

		double k20_ComperOne = k20_MoneyEx * k20_commission;	//�޷��� ������ = ȯ�� * ������

		double k20_totalcom = k20_usd * k20_ComperOne;	//�Ѽ����� = 1�޷������ * �޷��������
		System.out.println("******************************************************");	//����������ٶ�
		System.out.println("*                 ������ ���� ���                   *");	//�������
		System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k20_totalcom, k20_usd, k20_ComperOne);
		//�Ѽ�����, ȯ���� �޷�, �޷��� ������
		System.out.println("******************************************************");	//����������ٶ�

		//2///////////////////////////////////////////////////////////////////////////////////////

		int k20_i_totalcom;		//������ �� ������ ����

		if (k20_totalcom != (double) ((int) k20_totalcom)) {	//�Ǽ��� �Ѽ����ᰡ ������ �Ѽ������ ���� �ʴٸ�
			k20_i_totalcom = (int) k20_totalcom + 1;	//������ �Ѽ������ �Ǽ��� �Ѽ������� ������ ��ȯ���� 1�� ���Ѵ�.
		} else {	//�ƴ϶��
			k20_i_totalcom = (int) k20_totalcom;		//�������� �Ǽ����� �Ѽ������ ����
		}
		System.out.println("******************************************************");	//����������ٶ�
		System.out.println("*                 ������ ���� ȯ��                   *");	//�������
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k20_i_totalcom, k20_usd, k20_ComperOne);
		//���� �������� �Ѽ�����, ȯ���� �޷�, �޷��� �����Ḧ ���
		
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		//�ܵ� = ���������� ������ - 1�޷��� * ȯ�� - �������Ѽ����� 

		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������ û��: %d�� �ܵ�: %d��\n", k20_MyWon, k20_usd, k20_i_totalcom,
				k20_remain);
		//������, 1�޷���, �������Ѽ�����, �ܵ� ���   <- �ܵ� Ʋ��
		System.out.println("******************************************************");	//����������ٶ�
		
		//3//////////////////////////////////////////////////////////////////////////////////////////
		
		k20_usd = (int) (k20_MyWon / (k20_MoneyEx + k20_ComperOne));
		//1�޷��� = ���������� ������ / (ȯ�� * �޷��� ������)
		k20_totalcom = k20_usd * k20_ComperOne;
		//�� ������ = 1�޷��� * �޷��������
		
		if(k20_totalcom != (double)((int)k20_totalcom)) {	//���� �Ѽ������ �������Ѽ������� �Ǽ�ȭ�� �ٸ��ٸ�
			k20_i_totalcom = (int)k20_totalcom + 1; //�Ѽ������ �Ѽ������� ������ +1 �̴�
		}else {	//�ݴ���
			k20_i_totalcom = (int)k20_totalcom;		//�Ѽ������ �Ѽ������� �������� ����
		}
		System.out.println("******************************************************");	//����������ٶ�
		System.out.println("*                 (��Ȯ��)������ ���� ȯ��                   *");	//�������
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k20_i_totalcom, k20_usd, k20_ComperOne);
		//�Ѽ�����, 1�޷���, �޷�������� ���
		
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		//������ = ���������� ������ - 1�޷��� * ȯ�� - ������ �Ѽ�����
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������û��: %d�� �ܵ�: %d��\n", k20_MyWon, k20_usd, k20_i_totalcom, k20_remain);
		//������, 1�޷���, �Ѽ�����, �ܵ� ���
		System.out.println("******************************************************");	//����������ٶ�
		
		///////////////////////////////////////////////////////////////////////////////////
		
		DecimalFormat k20_df = new DecimalFormat("###, ###, ###, ###, ###");	//decimalformatŬ������ �̿��� �޸� ������ ���Ѵ�.
		
		System.out.println("******************************************************");	//����������ٶ�
		System.out.println("*                  �޸����, ��¥ ����               *");	//�����Է�
		
		System.out.printf("�Ѽ�����: %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n",
		k20_df.format(k20_i_totalcom), k20_df.format(k20_usd), k20_ComperOne);
		//�Ѽ����� 1�޷��� �޷��� �����Ḧ ���� ���Ŀ� �°� �޸��� ��� ���
		
		k20_remain = (int)(k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		//������ = ���������� ������ - 1�޷��� * ȯ�� - ������ �Ѽ�����
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷�, ������û��: %s�� �ܵ�: %s��\n", 
				k20_df.format(k20_MyWon), k20_df.format(k20_usd), k20_df.format(k20_i_totalcom), k20_df.format(k20_remain));
		//������ 1�޷��� �Ѽ����� �ܵ��� ���� ���Ŀ� �°� �޸��� ��� ���

		///////////////////////////////////////////////////////////////////////////////////////
		
		Calendar calt = Calendar.getInstance();
		//Ķ���� Ŭ������ �ҷ��´�
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//simpledateformatŬ������ ��¥ ������ ���Ѵ�
		System.out.printf("��������ð�: %s\n", k20_sdt.format(calt.getTime()));
		//��������ð��� ����ð����� �Ͽ� ���� ���Ŀ� �°� ����Ѵ�
		
		System.out.println("******************************************************");	//��������ٹٲ�
	}
		
		
		
	

}
