package Pr2;

public class VarEx2 {	//Ŭ���� ����

	public static void main(String[] args) {
		int x = 10;		//x��� ������ �����ϰ� 10���� �ʱ�ȭ
		int y = 20;		//y��� ������ �����ϰ� 20���� �ʱ�ȭ
		int tmp = 0;	//tmp��� ������ �����ϰ� 0���� �ʱ�ȭ
		
		System.out.println("x:" + x + " y:" + y);	//x������ y������ ȭ�鿡 ���
		
		tmp = x;	//tmp�� x��(10) �ʱ�ȭ
		x = y;		//x�� y��(20) �ʱ�ȭ
		y = tmp;	//y�� tmp��(10) �ʱ�ȭ
		
		System.out.println("x:" + x + " y:" + y);	//x������ y������ ȭ�鿡 ���

	}

}
