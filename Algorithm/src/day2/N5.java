package day2;

import java.util.*;

class N5 {
	public String solution(String[] votes, int k) {
		String answer = " ";
		HashMap<String, HashSet<String>> voteHash = new HashMap<>();//딕셔너리타입
		HashMap<String, Integer> candidate = new HashMap<>();
		HashMap<String, Integer> present = new HashMap<>();
		for(String x : votes){
			String a = x.split(" ")[0]; //공백으로 쪼갬 추천
			String b = x.split(" ")[1]; //추천받는사람 
			voteHash.putIfAbsent(a, new HashSet<String>());  //위에거 셋형태로
 			voteHash.get(a).add(b); //추천자 애드
			candidate.put(b, candidate.getOrDefault(b, 0) + 1); //맵형태에 추가 
		}
		int max=Integer.MIN_VALUE; //맥스를 정의
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
			if(present.get(name) == max) tmp.add(name); //맥스와 프레센트 비교
		}
		tmp.sort((a, b) -> a.compareTo(b)); //컴페어투 숫자를 비교 작 크 같에 때라 리턴값이 달라짐
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



/* 캔디 추천받은사람
 * 톰 3 루이스1 존 1
 * 프레센트 투표자이름
 *  존2 다니엘2 루이스1
 * 람다식
 * 간다하게 ab를 비교할때 사용한다.
 * 뱉프를 정렬한다 ab를 비교한값을 정렬한다.
 */































