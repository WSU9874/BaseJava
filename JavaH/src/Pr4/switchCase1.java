package Pr4;

public class switchCase1 {

	public static void main(String[] args) {
		String k20_jumin = "123456 - 1234567";

		switch (k20_jumin.charAt(7)) {
		case '1':
			System.out.println("20세기전 태어난 남자 사람");
			break;
		case '2':
			System.out.println("20세기전 태어난 여자 사람");
			break;
		case '3':
			System.out.println("20세기후 태어난 여자 사람");
			break;
		case '4':
			System.out.println("20세기후 태어난 남자 사람");
			break;
		default:
			System.out.println("사람");
			break;
		}

	}

}
