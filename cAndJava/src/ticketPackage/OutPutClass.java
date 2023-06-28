package ticketPackage;

import java.util.Scanner;

public class OutPutClass {
	inputClass ipc = new inputClass();
	RunTicketClass rtc = new RunTicketClass();
	
	
	
	
	Scanner scanner = new Scanner(System.in);

	public void pricePrint(int priceResult) {
		System.out.printf("������ %d �� �Դϴ�.\n", priceResult);
		System.out.printf("�����մϴ�.\n\n");
	}
	
	public void orderPrint(int priceResult, int[][] orderList, int totalPrice, int cnt) {
		System.out.printf("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n");
		System.out.printf("\n");
		System.out.printf("===============��������===============\n");

		
		for (int i = 0; i < cnt; i++) {
			switch (orderList[i][0]) {
			case 1:
				System.out.printf("�ְ���  ");
				break;
			case 2:
				System.out.printf("�߰���  ");
				break;
			default:
				break;
			}

			if (rtc.calcAgeGroup(orderList[i][1]) == TicketConstValueClass.BABY) {
				System.out.printf("���� ");
			} else if (rtc.calcAgeGroup(orderList[i][1]) == TicketConstValueClass.CHILD) {
				System.out.printf("��� ");
			} else if (rtc.calcAgeGroup(orderList[i][1]) == TicketConstValueClass.TEEN) {
				System.out.printf("û�ҳ� ");
			} else if (rtc.calcAgeGroup(orderList[i][1]) == TicketConstValueClass.ADULT) {
				System.out.printf("� ");
			} else {
				System.out.printf("���� ");
			}
			System.out.printf("X %3d", orderList[i][2]);
			System.out.printf("%8d��    ", orderList[i][3]);

			switch (orderList[i][4]) {
			case 1:
				System.out.printf("*������� ����\n");
				break;
			case 2:
				System.out.printf("*����� �������\n");
				break;
			case 3:
				System.out.printf("*���������� �������\n");
				break;
			case 4:
				System.out.printf("*���ڳ� �������\n");
				break;
			case 5:
				System.out.printf("*�ӻ�� �������\n");
				break;
			default:
				break;
			}
		}
		
		System.out.printf("\n");
		System.out.printf("����� �Ѿ��� %d�� �Դϴ�.\n", totalPrice);
		System.out.printf("===================================================\n");
		System.out.printf("\n");
}
	
	public int orderContinue() {

		int continueSelect = 0;
		
		System.out.printf("��� �߱� �Ͻðڽ��ϱ�?\n");
		System.out.printf("1. Ƽ�� �߱�\n");
		System.out.printf("2. ����\n");
		while (true) {
			continueSelect = scanner.nextInt();
			if (continueSelect == 1 || continueSelect == 2) {
				break;
			}
			else {
				errorMessagePrint();
			}
		}
		return continueSelect;
	}

	public static void errorMessagePrint() {
		System.out.printf("�߸� �Է��ϼ̽��ϴ�.\n");
	}

}
