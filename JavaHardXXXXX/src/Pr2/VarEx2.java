package Pr2;

public class VarEx2 {	//클래스 선언

	public static void main(String[] args) {
		int x = 10;		//x라는 변수를 정의하고 10으로 초기화
		int y = 20;		//y라는 변수를 정의하고 20으로 초기화
		int tmp = 0;	//tmp라는 변수를 정의하고 0으로 초기화
		
		System.out.println("x:" + x + " y:" + y);	//x변수와 y변수를 화면에 출력
		
		tmp = x;	//tmp를 x로(10) 초기화
		x = y;		//x를 y로(20) 초기화
		y = tmp;	//y를 tmp로(10) 초기화
		
		System.out.println("x:" + x + " y:" + y);	//x변수와 y변수를 화면에 출력

	}

}
