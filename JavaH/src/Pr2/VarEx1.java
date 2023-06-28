package Pr2;

public class VarEx1 {	//클래스 선언

	public static void main(String[] args) {
		int k20_year = 0;	//year라는 변수를 정의하고 0으로 초기화
		int k20_age = 14;	//age라는 숫자형 변수를 정의하고 14로 초기화
		
		System.out.println("결과1 :" + k20_year);	//year변수를 화면에 출력
		System.out.println("결과2 :" + k20_age);	//age변수를 화면에 출력
		
		k20_year = k20_age + 2000;	//변수 age의 값에 2000을 더해서 변수 year에 저장
		k20_age = k20_age + 1;		//변수 age에 저장된 값을 1증가시킨다.
		
		System.out.println("결과3 :" + k20_year);	//다시 year변수를 화면에 출력
		System.out.println("결과4 :" + k20_age);	//다시 age변수를 화면에 출력
	}

}
