package Pr3;

public class moneyTax2 {

	public static void main(String[] args) {
		String[] k20_item = { "����", "����", "�Ի�", "����", "���" };
		// ���ڿ� �迭�� ���� �̸��� �ִ´�.
		int[] k20_price = { 1000, 2000, 3000, 2500, 1450 };
		// ���� �迭�� ���� ������ �ִ´�.
		int[] k20_amount = { 10, 2, 1, 3, 5 };
		// ���� �迭�� ������ ������ �ִ´�.
		double k20_tax_rate = 0.1; // �Ǽ����� ������ �����ϰ� ���� �ִ´�. (����)
		int k20_total_sum = 0; // ���հ踦 �ʱ�ȭ�Ѵ�.

		System.out.println("*********************************"); // ���� ���� ���
		System.out.println("�� ���ڵ�"); // ���ڿ� ���
		System.out.println("�׸�    �ܰ� ����    �հ�"); // �׸� �ܰ� ���� �հ踦 ���
		for (int k20_i = 0; k20_i < k20_item.length; k20_i++) {
			// item�迭�� �׸�� ��ŭ �ݺ�, �ݺ��Ҷ����� i�� 1�� ����
			int k20_sum = k20_price[k20_i] * k20_amount[k20_i];
			// sum�� price * amount - > i���� �迭
			k20_total_sum = k20_total_sum + k20_sum;
			// total_sum�� sum���� ��� ���Ѵ�
			System.out.printf("%.5s %7d %2d %9d\n", k20_item[k20_i], k20_price[k20_i], k20_amount[k20_i], k20_sum);
			// i��° �迭�� �׸� �ܰ� ���� �հ踦 ���
			// �ݺ�
		}
		System.out.println("*********************************"); // �ؿ� �� ���
		System.out.printf("���� �ݾ� :  %15d\n", k20_total_sum); // �հ� ���

		int k20_total_net_price = (int) (k20_total_sum / (1 + k20_tax_rate));
		// ���� �ݾ��� ������ ���տ� ����+1�� ���� ���� ��
		System.out.printf("���� �ݾ� :  %15d\n", k20_total_net_price);
		// ���� �ݾ� ���
		int k20_tax = k20_total_sum - k20_total_net_price;
		// ������ ���� - ���� �ݾ�
		System.out.printf("���� :  %20d\n", k20_tax);
		// ���� ���

	}

}
