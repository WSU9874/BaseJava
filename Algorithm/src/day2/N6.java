package day2;

import java.util.ArrayList;
import java.util.Arrays;
//class N6 {
//	public String[] solution(String[] reports, String times){
//		String[] answer = {};
//		HashMap<String,Integer> enter = new HashMap<>();
//		String starthours = times.split(" ")[0];
//		String startmins = times.split(" ")[1];
//		String endhours = times.split(":")[0];
//		String endmins = times.split(":")[1];
//		int totalstarthour = Integer.parseInt(starthours);
//		int totalstartmin = Integer.parseInt(startmins);
//		int totalendhours = Integer.parseInt(endhours);
//		int totalendmins = Integer.parseInt(endmins);
//		
//		int stmin = totalstarthour*60+totalstartmin;
//		int edmin = totalendhours*60+totalendmins;
//		
//		
//
//		for (String x : reports) {
//			String a = x.split(" ")[0];
//			String b = x.split(" ")[1];
//			String c = b.split(":")[0];
//			String d = b.split(":")[1];
//			int hours = Integer.parseInt(c);
//			int minutes = Integer.parseInt(d);
//			int totalmin = hours * 60 + minutes;
//			enter.put(a, totalmin);
//		}
//		enter.forEach((key, value) -> {
//            System.out.println(key + " : " + value);
//        });
		
		
	class Info implements Comparable<Info>{
		public String name;
		public int time;
		Info(String name,int time){
			this.name = name;
			this.time = time;
		}
		@Override
		public int compareTo(Info o) {
			return 0;
		}
	}
	class N6 {
		public int getTime(String time) {
			int H = Integer.parseInt(time.split(":")[0]);
			int M = Integer.parseInt(time.split(":")[1]);
			return H*60+M;
		}
		
		public String[] solution(String[] reports, String times){
			Arraylist<Info> tmp = new ArrayList<>();
			for(String x : reports) {
				String a = x.split(" ")[0];
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	public static void main(String[] args){
		N6 T = new N6();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
	}
}

/* hh:mm 형식
 * 이걸 고친다 pasing 분단위로 바꾼다
 * 존15:23 -> 15*60 + 23 = 923
 * 다니엘 9*60+30 = 570
 * 타입 8*60+33 = 513
 * 		9*60+45 = 585
 * 이사이의 정수값을 
 * 솔트해서 get(0)값을 출력한다
 * 
 * 인터페이스 내용물을 구현해야함
 * 
 */
