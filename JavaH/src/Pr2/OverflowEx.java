package Pr2;

public class OverflowEx { // Ŭ���� ����

	public static void main(String[] args) {
		short sMin = -32768; // sMin��� short������ �����ϰ� -32768�� �ʱ�ȭ
		short sMax = 32767; // sMax��� short������ �����ϰ� 32767�� �ʱ�ȭ
		char cMin = 0; // cMin��� char������ �����ϰ� 0���� �ʱ�ȭ
		char cMax = 65535; // cMax��� char������ �����ϰ� 65535�� �ʱ�ȭ

		System.out.println("sMin =" + sMin);
		// sMin������ ȭ�鿡 ���
		System.out.println("sMin-1 =" + (short) (sMin - 1));
		// sMin����-1�� ȭ�鿡 ��� �ܼ� -1�̾ƴϰ� ���� �̻������� �����ʰ�
		System.out.println("sMax =" + sMax);
		// sMax������ ȭ�鿡 ���
		System.out.println("sMax+1 =" + (int) (sMax + 1));
		// sMax����+1�� ȭ�鿡 ��� ������ �Ѿ �������
		System.out.println("cMin =" + (int) cMin);
		// cMin������ ȭ�鿡 ���
		System.out.println("cMin-1 =" + (int) --cMin);
		// cMin����-1�� ȭ�鿡 ��� char0���� 1�� ���� 65535�� ���´�
		System.out.println("cMax =" + (int) cMax);
		// cMax������ ȭ�鿡 ���
		System.out.println("cMax +1 =" + (int) ++cMax);
		// cMax����+1�� ȭ�鿡 ��� 0�� �ȴ�

	}

}
