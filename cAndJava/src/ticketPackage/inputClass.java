package ticketPackage;

import java.util.Scanner;

public class inputClass {
	Scanner scanner = new Scanner(System.in);
	private static int ticketSelect;
	public static int getTicketSelect() {
		return ticketSelect;
		
	}

	public static void setTicketSelect(int ticketSelect) {
		inputClass.ticketSelect = ticketSelect;
	}

	public static long getCustomerIDNumber() {
		return customerIDNumber;
	}

	public static void setCustomerIDNumber(long customerIDNumber) {
		inputClass.customerIDNumber = customerIDNumber;
	}

	public static int getOrderCount() {
		return orderCount;
	}

	public static void setOrderCount(int orderCount) {
		inputClass.orderCount = orderCount;
	}

	public static int getDiscountSelect() {
		return discountSelect;
	}

	public static void setDiscountSelect(int discountSelect) {
		inputClass.discountSelect = discountSelect;
	}

	private static long customerIDNumber;
	private static int orderCount;
	private static int discountSelect;
	

	public int inputTicketSelect() {		
		int ticketSelect = 0;
		System.out.println("������ �����ϼ���.\n1. �ְ���\n2. �߰���\n");
		while (true) {
			ticketSelect = scanner.nextInt();
			if (ticketSelect == 1 || ticketSelect == 2) {
				break;
			} else {
				OutPutClass.errorMessagePrint();
			}
		}
		return ticketSelect;
	}

	public long inputCustomerIDNumber() {
		long customerIDNumber = 0L;
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.\n");
		while (true) {
			customerIDNumber = scanner.nextLong();
			if ((customerIDNumber >= TicketConstValueClass.FULL_DIGIT_MIN
					&& customerIDNumber < TicketConstValueClass.FULL_DIGIT)) {
				break;
			} else {
				OutPutClass.errorMessagePrint();
			}
		}
		return customerIDNumber;
	}

	public int inputOrderCount() {
		int orderCount = 0;

		System.out.println("��� �ֹ��Ͻðڽ��ϱ�(�ִ� 10��)\n");
		while (true) {
			orderCount = scanner.nextInt();
			if ((orderCount <= TicketConstValueClass.MAX_COUNT) && (orderCount >= TicketConstValueClass.MIN_COUNT)) {
				break;
			} else {
				OutPutClass.errorMessagePrint();
			}
		}
		return orderCount;
	}

	public int inputDiscountSelect() {
		int discountSelect = 0;
		System.out.println("�������� �����ϼ���.\n1. ����\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��\n");
		while (true) {
			discountSelect = scanner.nextInt();
			if (discountSelect >= 1 && discountSelect <= 5) {
				break;
			} else {
				OutPutClass.errorMessagePrint();
			}
		}
		return discountSelect;
	}

	public void inputData() {
		ticketSelect = inputTicketSelect();
		customerIDNumber = inputCustomerIDNumber();
		orderCount = inputOrderCount();
		discountSelect = inputDiscountSelect();
	}

}
