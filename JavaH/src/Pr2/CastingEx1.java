package Pr2;

public class CastingEx1 { // 클래스 선언

	public static void main(String[] args) {
		double k20_d = 85.4; // d라는 double변수를 정의하고 85.4로 초기화
		int k20_score = (int) k20_d; 
		// score라는 정수변수를 정의하고 d를 정수형으로 바꿔 대입

		System.out.println("score=" + k20_score);
		// score 변수 출력
		System.out.println("d=" + k20_d);
	} 	// d 변수 출력

}
