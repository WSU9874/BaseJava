package Pr5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {

	public static void main(String[] args) {
		System.out.println("12345678901234567890123456789012345678901");
		String itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String itemcode1 = "1031615";
		int price1 = 3000;
		int amount1 = 1;
		
		String itemname2 = "�����̵�ĸ���(������)(100ȣ)";
		String itemcode2 = "11008152";
		int price2 = 1000;
		int amount2 = 1;
		
		String itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String itemcode3 = "1020800";
		int price3 = 1000;
		int amount3 = 1;
		
		int iPrice = ((price1 * amount1)+(price2 * amount2)+(price3 * amount3));
		float tax = 0.1f;
		int price = (int) Math.round(iPrice / (1 + tax));
		
		Calendar calt = Calendar.getInstance();
		//Ķ���� Ŭ������ �ҷ��´�
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//simpledateformatŬ������ ��¥ ������ ���Ѵ�
		
		System.out.printf("                 \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������, ��ȣ�� 213-81-52063\n");
		System.out.printf("���� : ��⵵ ������ �д籸 �д��53����1(����\n��)\n");
		System.out.printf("===============================================\n");
		System.out.printf("         �Һ����߽ɰ濵(CCM) �������\n");
		System.out.printf("       ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("===============================================\n");
		System.out.printf("           ��ȯ/ȯ�� 14��(03�� 12��)�̳�,\n");
		System.out.printf("  (����)������,����ī�� �����ı��Ը��忡������\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("===============================================\n");
		System.out.printf("[POS 1058231]              %s\n",  k20_sdt.format(calt.getTime()));
		System.out.printf("===============================================\n");
		System.out.printf("%s          %d %d %d\n[%s]\n", itemname1.substring(0,14), price1, amount1, (price1 * amount1),itemcode1 );
		System.out.printf("%s            %d %d %d\n[%s]\n", itemname2.substring(0,14), price2, amount2, (price2 * amount2),itemcode2 );
		System.out.printf("%s          %d %d %d\n[%s]\n", itemname3.substring(0,14), price3, amount3, (price3 * amount3),itemcode3 );
		System.out.printf("                 �����հ�                  %d\n", price);
		System.out.printf("                   �ΰ���                   %d\n", iPrice-price);
		
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("�Ǹ��հ�                                   %d\n", iPrice);
		System.out.printf("===============================================\n");
		System.out.printf("�ſ�ī��                                   %d\n", iPrice);
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("�츮ī��                       538720**********\n");
		System.out.printf("���ι�ȣ 77982843(0)              ���αݾ� %d\n", iPrice);
		System.out.printf("           %s �д缭����\n",  k20_sdt.format(calt.getTime()));
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("             ||||||||||||||||||||||\n");
		System.out.printf("                 2112820610158231\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("�� ���̼� ����� �� �Ǵ�Ȩ�������� �����ϼż�\n");
		System.out.printf("  ȸ������ �� �پ��� ������ ����������! ��\n");

	}

}
