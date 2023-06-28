package Pr5;

import java.text.NumberFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class P9 {

	public static void main(String[] args) {
		System.out.println("12345678901234567890123456789012345678901");
		NumberFormat df = NumberFormat.getNumberInstance();
		Calendar calt = Calendar.getInstance();
		// Ķ���� Ŭ������ �ҷ��´�
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		SimpleDateFormat k20_sdt2 = new SimpleDateFormat("YYYYMMdd");
		// simpledateformatŬ������ ��¥ ������ ���Ѵ�

		String[] itemname = { "���� Ȩ SAFE365 �ڵ����", "a���ٶ󸶹ٻ�����", "������", "������", "Ȩ����", "���ڸ�", "����", "������", "����Ĩ", "������",
				"�ް�", "������", "������", "������", "����", "������", "�丶��", "���̿�", "������", "�����", "����", "������", "���ĸ�", "���̽�", "���簻",
				"������", "ũ��Ŀ", "�Ҹ���", "ab��b��ek��b���b��ek��", "��īĨ" };
		int[] price = { 10000000, 2500000, 3300, 2500, 100, 50, 600, 800, 1000, 900, 400, 500, 1000, 2000, 5000, 2000,
				3000, 4000, 5000, 6000, 7000, 8000, 7000, 8000, 6000, 2000, 1000, 3000, 4000, 6000, 5000 };
		int[] num = { 2, 4, 1, 1, 10, 5, 6, 4, 2, 6, 1, 2, 6, 4, 5, 4, 1, 2, 3, 4, 3, 4, 5, 1, 8, 6, 4, 1, 2, 5, 7 };
		int sum = 0;
		int taxFree = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		boolean[] taxfree = { true, true, false, true, true, true, true, false, true, true, true, true, false, true,
				true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true };

		int iPrice = 0;

		System.out.printf("    emart     �̸�Ʈ ������(031)888-1234\n");
		System.out.printf("              206-86-50913 ����\n");
		System.out.printf("              ���� ������ ������� 552\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("*�Ϻ� �귣����� ����(���� ����������\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[�� ��]%s  POS:0011-9861\n", k20_sdt.format(calt.getTime()));
		System.out.printf("----------------------------------------\n");
		System.out.printf("   ��ǰ��         �� ��  ����     �� ��\n");
		System.out.printf("----------------------------------------\n");

		for (int i = 1; i < itemname.length + 1; i++) {

			String aa = itemname[i - 1];
			aa = aa + "                         ";
			byte[] bb = aa.getBytes();
			aa = new String(bb, 0, 13);

			if (bb[12] < 0){
				aa = new String(bb, 0, 12) + " ";
			}

			System.out.printf(" %s%11s%3s%11s\n", aa, df.format(price[i - 1]), df.format(num[i - 1]),
					df.format((price[i - 1] * num[i - 1])));
			iPrice = iPrice + (price[i-1] * num[i-1]);

			if (taxfree[i - 1] == false) {
				taxFree = taxFree + (price[i - 1] * num[i - 1]);
			}

			if (i % 5 == 0) {
				System.out.printf("----------------------------------------\n");
			}
		}
		float tax = 0.1f;
		int priceTotal = (int) Math.ceil((iPrice - taxFree) / (1 + tax));

		System.out.printf("           �� ǰ�� ����              %d\n", itemname.length);
		System.out.printf("           (*)�鼼��ǰ      %11s\n", df.format(taxFree));
		System.out.printf("           ������ǰ         %11s\n", df.format(priceTotal));
		System.out.printf("           �ΰ���           %11s\n", df.format(iPrice - priceTotal-taxFree));
		System.out.printf("           ��   ��          %11s\n", df.format(iPrice));
		System.out.printf("�� �� �� �� �� ��           %11s\n", df.format(iPrice));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("0012 KEB �ϳ�      541707**0484/35860658\n");
		System.out.printf("ī�����(IC)       �Ͻú� / %11s \n", df.format(iPrice));
		System.out.printf("----------------------------------------\n");
		System.out.printf("          [�ż�������Ʈ ����]\n");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ      9350**9995       164\n");
		System.out.printf("����(���)����Ʈ       5,637(      5,473)\n");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("    ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("������ȣ :                    34��****\n");
		
		calt.add(Calendar.HOUR_OF_DAY, -2);
		 System.out.println(k20_sdt.format(calt.getTime()));
		  
		System.out.printf("�����ð� :           %s\n", k20_sdt.format(calt.getTime()));
		System.out.printf("----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��00                    1150\n");
		System.out.printf("      %s/00119861/00164980/31\n", k20_sdt2.format(calt.getTime()));

		

		byte[] byteArray = "����ƽ ab��b ��ek��".getBytes();
		  String strValue = new String(byteArray);

		  System.out.println(Arrays.toString(byteArray));
		  System.out.println(strValue);
		  
		  
		
	}

}
