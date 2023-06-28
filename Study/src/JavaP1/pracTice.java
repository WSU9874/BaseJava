package JavaP1;

public class pracTice {

	public static void main(String[] args) {
		String t1 = "I go to school by subway but it takes a very long time to go to school.";
		String t2 = "cool";
		int cnt = 0;

		for (int i = 0; i < t1.length(); i++) {
			if (t1.charAt(i) == t2.charAt(0)) {
				cnt++;
				i++;
				int j = 0;
				while (j < t2.length()) {
					if (t1.charAt(i) == t2.charAt(j)) {
						cnt++;
						j++;
					}
					if (j == t2.length()) {
						break;
					}
					i++;
				}

			}
		}
		System.out.println(cnt);
	}

}
