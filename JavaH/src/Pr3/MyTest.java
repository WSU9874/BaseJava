package Pr3;

public class MyTest { // Ŭ���� ����

	public static void main(String[] args) {
		int k20_price = 1234; // price��� int������ �����ϰ� 1234�� �ʱ�ȭ
		double k20_tax_rate = 0.1; // tax_rate��� double������ �����ϰ� 0.1�� �ʱ�ȭ

		int k20_netprice = netprice(k20_price, k20_tax_rate);
		// netprice��� int������ �����ϰ� �Լ�netprice�� ���ϰ��� ����
		int k20_tax = k20_price - k20_netprice;
		// tax��� int������ �����ϰ� �Һ��ڰ� - ���������� ���� ����

		System.out.println("************************************************");
		// �� ���
		System.out.printf("*�Һ��ڰ�,        ��������,       ���� ���  *\n");
		// �׸� ���
		System.out.printf("�Һ��ڰ���: %d, ��������: %d, ����: %d\n", k20_price, k20_netprice, k20_tax);
		// �Һ��ڰ���, ��������, ���� ���
		System.out.println("************************************************");
		// �� ���
	}

	public static int netprice(int k20_price, double k20_rate) {
		// int���� ��ȯ�ϴ� �Լ� ����
		return (int) (k20_price / (1 + k20_rate));
		// ���� ���� (�Һ��ڰ��� / (1 + ����)) -> ��������
	}

}
