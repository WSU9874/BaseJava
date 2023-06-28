package Pr6;

public class p8 {
	
	private static int inVal;
	public static void up() {
		inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", inVal);
	}

	public static void main(String[] args) {
		inVal = 0;
		P7Elevater elev;
		
		elev = new P7Elevater();
		
		up();
		for(int i = 0; i < 10; i++) {
			elev.up();
			System.out.printf("MSG[%s]\n", elev.help);
		}
		for(int i = 0; i < 10; i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.help);
		}

	}

}
