package Pr6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P6 {

	public static void main(String[] args) {
		int itemCount=30;
		TitlePrint();
		TimeStemp();
		HeaderPrint();
		
		for(int i = 0; i < itemCount; i++) {
			itemPrint(i);
			
			TotalPrint();
		}

	}
	
	public static void TitlePrint() {
		System.out.println("�̸�Ʈ");
	}
	
	public static void TimeStemp() {
		Calendar calt = Calendar.getInstance();
		// Ķ���� Ŭ������ �ҷ��´�
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.println(k20_sdt);
	}
	public static void HeaderPrint() {
		NumberFormat df = NumberFormat.getNumberInstance();

		String[] itemname = { "���� Ȩ SAFE365 �ڵ����", "a���ٶ󸶹ٻ�����", "������", "������", "Ȩ����", "���ڸ�", "����", "������", "����Ĩ", "������",
				"�ް�", "������", "������", "������", "����", "������", "�丶��", "���̿�", "������", "�����", "����", "������", "���ĸ�", "���̽�", "���簻",
				"������", "ũ��Ŀ", "�Ҹ���", "ab��b��ek��b���b��ek��", "��īĨ" };
		int[] price = { 10000000, 2500000, 3300, 2500, 100, 50, 600, 800, 1000, 900, 400, 500, 1000, 2000, 5000, 2000,
				3000, 4000, 5000, 6000, 7000, 8000, 7000, 8000, 6000, 2000, 1000, 3000, 4000, 6000, 5000 };
		int[] num = { 2, 4, 1, 1, 10, 5, 6, 4, 2, 6, 1, 2, 6, 4, 5, 4, 1, 2, 3, 4, 3, 4, 5, 1, 8, 6, 4, 1, 2, 5, 7 };
		
		for (int i =0; i < itemname.length; i++) {
			System.out.printf("��ǰ��: %s, �ܰ� %d, ����: %d, �ݾ�: %d", itemname[i],price[i],num[i], price[i]*num[i]);
		}
	}
	public static int itemPrint(int i) {
		
		
		return  i;
		
	}
	
	

}
