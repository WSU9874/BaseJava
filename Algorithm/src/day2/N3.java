package day2;

class N3 {
	public int getMin(int[] fruit) {
		int min = 100;
		for (int x : fruit) {
			min = Math.min(min, x);
		}
		return min;
	}

	public Boolean isMinUnique(int[] fruit) {
		int cnt = 0;
		int min = getMin(fruit);
		for (int x : fruit) {
			if (x == min)
				cnt++;
		}
		return cnt == 1;
	}

	public int getMinIndex(int[] fruit) {
		int min = getMin(fruit);
		for (int i = 0; i < 3; i++) {
			if (fruit[i] == min)
				return i;
		}
		return 0;
	}

	public int solution(int[][] fruit) {
		int answer = 0;
		int n = fruit.length;
		int[] ch = new int[n];
		for (int i = 0; i < n; i++) {
			if (ch[i] == 1)
				continue;
			if (isMinUnique(fruit[i]) == false)
				continue;
			for (int j = i + 1; j < n; j++) {
				if (ch[j] == 1)
					continue;
				if (isMinUnique(fruit[j]) == false)
					continue;
				int a = getMinIndex(fruit[i]);
				int b = getMinIndex(fruit[j]);
				if (a != b && fruit[i][b] > 0 && fruit[j][a] > 0) {
					if (fruit[i][a] + 1 <= fruit[i][b] - 1 && fruit[j][b] + 1 <= fruit[j][a] - 1) {
						fruit[i][a]++;
						fruit[i][b]--;
						fruit[j][b]++;
						fruit[j][a]--;
						ch[i] = 1;
						ch[j] = 1;
						break;
					}
				}
			}
		}
		for (int[] x : fruit) {
			answer += getMin(x);
		}
		return answer;
	}

	public static void main(String[] args) {
		N3 T = new N3();
		System.out.println(T.solution(
				new int[][] { { 10, 20, 30 }, { 12, 15, 20 }, { 20, 12, 15 }, { 15, 20, 10 }, { 10, 15, 10 } }));
		System.out.println(T.solution(new int[][] { { 10, 9, 11 }, { 15, 20, 25 } }));
		System.out.println(T.solution(
				new int[][] { { 0, 3, 27 }, { 20, 5, 5 }, { 19, 5, 6 }, { 10, 10, 10 }, { 15, 10, 5 }, { 3, 7, 20 } }));
		System.out.println(T.solution(new int[][] { { 3, 7, 20 }, { 10, 15, 5 }, { 19, 5, 6 }, { 10, 10, 10 },
				{ 15, 10, 5 }, { 3, 7, 20 }, { 12, 12, 6 }, { 10, 20, 0 }, { 5, 10, 15 } }));
	}
}



//바구니 3개중 가장작은 바구니
//내 최소 과일+1 여도 여전히 3개 최소값인가 (증가해야함)
//상대방도 마찬가지


//	int answer = 0;
//	ArrayList<Integer> arraybask = new ArrayList<>();
//	for (int[] bask : fruit) {
//		for (int x : bask) {
//			//System.out.print(x+" ");
//		}
//			
//	arraybask.add(bask[0]);
//		
//	
//	System.out.print(arraybask);
//	
//	
//	
//	
//	
//	}
//	
//	return answer;
//}