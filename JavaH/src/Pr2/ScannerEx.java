package Pr2;

import java.util.Scanner; //��ĳ�� ����� �ҷ��´�

public class ScannerEx {	//Ŭ���� ����

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ��ĳ�� Ŭ������ ȣ���Ѵ�

		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���.>"); // ���ڿ��� ���

		String k20_input = scanner.nextLine(); // ����ڿ��� ���ڿ�input�� ���������Ͽ� �Է¹޴´�.
		int k20_num = Integer.parseInt(k20_input); // �Է� ���� ���ڿ��� ������ ��ȯ�Ͽ� num�� ����

		System.out.println("�Է³��� :" + k20_input); // input�� ���
		System.out.printf("num=%d%n", k20_num); // num�� ���

	}

}
