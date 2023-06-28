package Pr2;

public class StringEx {		//클래스 선언

	public static void main(String[] args) {
		String k20_name = "Ja" + "va";		//문자열 name을 정의하고 두 문자열을 이어붙임
		String k20_str = k20_name + "8.0";	//문자열 str을 정의하고 name과 문자열8.0을 이어붙임
		
		System.out.println(k20_name);		//name변수를 출력
		System.out.println(k20_str);		//str변수를 출력
		System.out.println(7 + " ");		//숫자7과 공백을 이어붙이고 출력
		System.out.println(" " + 7);		//공백과 숫자 7을 이어붙이고 출력
		System.out.println(7 + "");			//숫자 7을 출력
		System.out.println("" + 7);			//숫자 7을 출력
		System.out.println("" + "");		//공백을 출력
		System.out.println(7 + 7 + "");		//7+7을 출력
		System.out.println("" + 7 + 7);		//문자7과 문자7을 이어붙이고 출력

	}

}
