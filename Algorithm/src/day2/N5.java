package day2;

import java.util.*;

class N5 {
	public String solution(String[] votes, int k) {
		String answer = " ";
		HashMap<String, HashSet<String>> voteHash = new HashMap<>();//��ųʸ�Ÿ��
		HashMap<String, Integer> candidate = new HashMap<>();
		HashMap<String, Integer> present = new HashMap<>();
		for(String x : votes){
			String a = x.split(" ")[0]; //�������� �ɰ� ��õ
			String b = x.split(" ")[1]; //��õ�޴»�� 
			voteHash.putIfAbsent(a, new HashSet<String>());  //������ �����·�
 			voteHash.get(a).add(b); //��õ�� �ֵ�
			candidate.put(b, candidate.getOrDefault(b, 0) + 1); //�����¿� �߰� 
		}
		int max=Integer.MIN_VALUE; //�ƽ��� ����
		for(String a : voteHash.keySet()){ //
			int cnt = 0;
			for(String b : voteHash.get(a)){ //
				if(candidate.get(b) >= k) cnt++;
			}
			present.put(a, cnt);
			max = Math.max(max, cnt);
		}
		ArrayList<String> tmp = new ArrayList<>();
		for(String name : present.keySet()){
			if(present.get(name) == max) tmp.add(name); //�ƽ��� ������Ʈ ��
		}
		tmp.sort((a, b) -> a.compareTo(b)); //������� ���ڸ� �� �� ũ ���� ���� ���ϰ��� �޶���
		answer = tmp.get(0);
		return answer;
	}

	public static void main(String[] args) {
		N5 T = new N5();
		System.out.println(T.solution(
				new String[] { "john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john" }, 2));
		System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
		System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
	}
}



/* ĵ�� ��õ�������
 * �� 3 ���̽�1 �� 1
 * ������Ʈ ��ǥ���̸�
 *  ��2 �ٴϿ�2 ���̽�1
 * ���ٽ�
 * �����ϰ� ab�� ���Ҷ� ����Ѵ�.
 * ������ �����Ѵ� ab�� ���Ѱ��� �����Ѵ�.
 */































