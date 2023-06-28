package day3;

import java.util.*;

class N1 {
	public String solution(String s) {
		String answer = "";
		Stack<String> st = new Stack<>();

		for (Character x : s.toCharArray()) {
			if (x == ')') {
				String tmp = "";
				while (!st.empty()) {
					String c = st.pop();
					if (c.equals("(")) {
						String num = "";
						while (!st.empty() && Character.isDigit(st.peek().charAt(0))) {
							num = st.pop() + num;
						}
						String res = "";
						int cnt = 0;
						if (num.equals(""))
							cnt = 1;
						else
							cnt = Integer.parseInt(num);
						for (int i = 0; i < cnt; i++)
							res += tmp;
						st.push(res);
						break;
					}
					tmp = c + tmp;
				}
			} else
				st.push(String.valueOf(x));
		}
		for (String x : st)
			answer += x;

		return answer;
	}

	public static void main(String[] args) {
		N1 T = new N1();
		System.out.println(T.solution("3(a2(b))ef"));
		System.out.println(T.solution("2(ab)k3(bc)"));
		System.out.println(T.solution("2(ab3((cd)))"));
		System.out.println(T.solution("2(2(ab)3(2(ac)))"));
		System.out.println(T.solution("3(ab2(sg))"));
	}
}
/* Stack�� ����Ѵ�
 * ĳƽ�������� �ѹ��ھ� �޴´�
 * )
 * b
 * (
 * 2
 * a
 * (
 * 3
 * 
 * (������ ������ ����
 * b, (, 2,
 * bb
 * 
 * bb ������
 * a  ������
 * (  ������ ����
 * 3 3���ݺ�
 * 
 * (������ ������ ����
 * bb,a,(,3
 * abbabbabb
 * 
 * 
 * ����Ұ� ���ڿ��� ����Ǿ��� �����°� ĳ����������
 * 
 * 
 * 
 * 
 * 
 * pair ��Ȳ�϶� ������ ����Ѵ�
 * ĳ���������λ̾Ƴ�
 * )��
 * tmp�� ����
 * ������ ������� ���������� �ݺ�
 * �ϳ��� pop�Ѵ�
 * 
 * if ������ (�̸�
 * 
 * ���� ���������� �����ΰ����� 
 * pop�� �ϰ� 
 * num���� ���Ѵ�
 * 
 * 
 * 
 * 
 * 
 * (�ƴϸ� �ƴϸ� ���ڿ��� ���Ѵ�
 * tmp = c + tmp  c�� ��ġ �߿�            b��
 * 
 * 
 * else: )�ƴϸ�
 * ���ÿ� Ǫ���Ѵ�
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

