package c;

public class sam_yukgu {

	public static void main(String[] args) {
		String[] a = new String[101];
		
		for(int i = 1; i <= 100; i++) {
			int length = (int)(Math.log10(i)+1);
		
//			a[i] = Integer.toString(i);
			if(length == 1) {
				if(i == 3 || i == 6 || i ==9) {
					System.out.println("짝");
				
			}else {
				System.out.println(i);
			
		}
			
		}
		}
	}

}
