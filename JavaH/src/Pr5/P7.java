package Pr5;

import java.text.NumberFormat;

public class P7 {

	public static void main(String[] args) {

		NumberFormat df = NumberFormat.getNumberInstance();
		System.out.println("�ſ����");
		System.out.println("�ܸ���: 2N68665898      ��ǥ��ȣ: 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("�ּ�: ��� ������ �д籸 Ȳ����� 351����\n10 1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.println("�����:752-53-00558	      TEL:7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		int iPrice = 33000;
		float tax = 0.1f;
		int price = (int) Math.round(iPrice / (1 + tax));
		System.out.printf("�ݾ�                           %-8s��\n", df.format(price));
		System.out.printf("�ΰ���                          %-7s��\n",df.format((int) (price * tax)));
		System.out.printf("�� ��	                       %-8s��\n",df.format(iPrice));
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("�츮ī��");
		System.out.println("ī���ȣ:5387-20**-****-4613(S)    �Ͻú�");
		System.out.println("�ŷ��Ͻ�	");
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.println("����:��ī���	       ����:720068568");
		System.out.println("�˸� : EDC����ǥ");
		System.out.println("���� : TEL)1544-4700");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("	        *�����մϴ�*		");
		System.out.println("		       ǥ��V2.08_20200212");

	}

}
