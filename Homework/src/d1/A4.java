package d1;

public class A4 {
//	Constant
	public class ConstantVO {
		public static final String HELLO_WORLD = "Hello World!!";
		public static final String ONE_PLUS_ONE = "1 + 1 = 2";

	}
	public static void main(String[] args) {
		System.out.println(ConstantVO.HELLO_WORLD);
		System.out.println(ConstantVO.ONE_PLUS_ONE + "\n");		
//	variable
		int number1 = 200;
		System.out.println(number1 + "\n");
//	Data type		
		boolean booleanType = true;
		
		char charType = 'a';
		
		byte byteType = 127;
		short shortType = 32767;
		int intType = 214483647;
		long longType = 9223372036854775807L;
		
		float floatType = 3.4028235E38F;
		double doubleType = 1.7976931348623157E308;
		
		System.out.println(booleanType);
		System.out.println(charType);
		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType + "\n");
		
// if문
		int score = 75;
		
		if (score >= 90) {
			 System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
//switch문
		int n = 2;
		switch (n) {	// 조건
		case 1:		// 값 불일치(미실행)
			System.out.println("1");
			break;
		case 2:		// 값 일치
			System.out.println("2"); // 실행
			break; // 종료
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("4이상");
		}
	}
}



