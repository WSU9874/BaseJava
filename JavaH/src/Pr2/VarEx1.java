package Pr2;

public class VarEx1 {	//Ŭ���� ����

	public static void main(String[] args) {
		int k20_year = 0;	//year��� ������ �����ϰ� 0���� �ʱ�ȭ
		int k20_age = 14;	//age��� ������ ������ �����ϰ� 14�� �ʱ�ȭ
		
		System.out.println("���1 :" + k20_year);	//year������ ȭ�鿡 ���
		System.out.println("���2 :" + k20_age);	//age������ ȭ�鿡 ���
		
		k20_year = k20_age + 2000;	//���� age�� ���� 2000�� ���ؼ� ���� year�� ����
		k20_age = k20_age + 1;		//���� age�� ����� ���� 1������Ų��.
		
		System.out.println("���3 :" + k20_year);	//�ٽ� year������ ȭ�鿡 ���
		System.out.println("���4 :" + k20_age);	//�ٽ� age������ ȭ�鿡 ���
	}

}
