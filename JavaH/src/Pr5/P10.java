package Pr5;

public class P10 {

	public static void main(String[] args) {
		System.out.printf("12345678901234567890123456789012345678901\n");
		String itemname1 = "����";
		int price1 = 1600;
		int amount1 = 3;
		int total1 = price1 * amount1;
		String itemname2 = "����";
		int price2 = 1000;
		int amount2 = 1;
		int total2= price2 * amount2;
		
		int iPrice = ((price1 * amount1)+(price2 * amount2));
		float tax = 0.1f;
		int price = (int) Math.round(iPrice / (1 + tax));
		
		System.out.printf("SHINSEGAE");
		System.out.printf("(��) �ż��� ����� T.1588-1234\n");
		System.out.printf("��� ���� ������ ������� 536\n");
		System.out.printf("201-81-32195  ����ȣ\n");
		System.out.printf("���� 2021-03-06 15:06 �ŷ���ȣ:0533-8162\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ��ǰ��               ����         �ݾ�\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%d�� / %s             %d         %d\n",price1, itemname1, amount1, total1 );
		System.out.printf("%d�� / %s             %d         %d\n",price2, itemname2, amount2, total2 );
		System.out.printf("       ��      ��                   %d\n", total1 + total2);
		System.out.printf("�� �� �� ǰ �� ��                   %d\n", price);
		System.out.printf("��      ��     ��                    %d\n", (int)(price*tax));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("��             ��                   %d\n", iPrice);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ī �� �� �� ��                      %d\n", iPrice);
		System.out.printf("�� ��                   538720******4227\n");
		System.out.printf("���ι�ȣ            67137812      �Ͻú�\n");
		System.out.printf("            ĳ��No:409**2 �����\n");
		System.out.printf("              �ֹ���ȣ : 876\n");
		System.out.printf("           2103060533816200005801\n");
		System.out.printf("��ȯ, ȯ��, ���������� 7�ϳ� ����ī��  \n");
		System.out.printf("�����Ͻð�, ȯ�� �� ��������ǰ��\n");
		System.out.printf("�ݳ��ϼž� �մϴ�. (�Ϻ� �귣�� ����)\n");
		System.out.printf("����� 031-695-2173\n");

	}

}
