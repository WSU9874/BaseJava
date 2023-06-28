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
/* Stack을 사용한다
 * 캐틱터형으로 한문자씩 받는다
 * )
 * b
 * (
 * 2
 * a
 * (
 * 3
 * 
 * (나오기 전까지 꺼냄
 * b, (, 2,
 * bb
 * 
 * bb 꺼내고
 * a  꺼내고
 * (  꺼내기 중지
 * 3 3번반복
 * 
 * (나오기 전까지 꺼냄
 * bb,a,(,3
 * abbabbabb
 * 
 * 
 * 모든요소가 문자열로 저장되야함 꺼내는건 캐릭터형으로
 * 
 * 
 * 
 * 
 * 
 * pair 상황일때 스택을 사용한다
 * 캐릭터형으로뽑아냄
 * )면
 * tmp를 생성
 * 스택이 비어있지 않을때까지 반복
 * 하나를 pop한다
 * 
 * if 꺼낸게 (이면
 * 
 * 스택 맨위에것이 숫자인가보고 
 * pop울 하고 
 * num값에 더한다
 * 
 * 
 * 
 * 
 * 
 * (아니면 아니면 빈문자열에 더한다
 * tmp = c + tmp  c의 위치 중요            b됨
 * 
 * 
 * else: )아니면
 * 스택에 푸쉬한다
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

