package Pr3;

public class moneyTax {

	public static void main(String[] args) {
		int k20_val = 271;	//정수형 변수 선언 후 값 대입
		int k20_rate = 3;	//정수형 변수 선언 후 값 대입
		
		int k20_tax = k20_taxcal(k20_val, k20_rate);	//함수 taxcal을 사용하고 위에 값 대입
		
		System.out.println("*********************************************");	//위쪽선 출력
		System.out.println("**             단순 세금 계산              **");	//문장 출력
		System.out.printf("실제 세금계산: %f\n", k20_val * k20_rate / 100.0);	//세금은 원금 * 세금 / 100
		System.out.printf("세전가격; % d 세금 : %d 세포함가격: %d\n", k20_val, k20_tax, k20_val + k20_tax);
		//세전가격과 세금과 세포함 가격을 출력
		System.out.println("*********************************************");	//아래선 출력
		

	}
	//static 메모리에 저장함
	//없으면 함수가 호출 될 때만 저장 
	public static int k20_taxcal(int k20_val, int k20_rate) {	//정수형 값이 들어가는 함수 선언 
		int k20_ret20;	//정수혀 함수 선언
		
		if(((double)k20_val * (double)k20_rate / 100.0) == k20_val * k20_rate / 100) {	
			//실수형인 val과 rate / 100가 정수형 val * k20/100과 같으면
			k20_ret20 = k20_val * k20_rate / 100;	//ret20은 소수점 아래를 버린 정수값
		} else {	//위의 조건식이 아니면
			k20_ret20 = k20_val * k20_rate / 100 + 1;	//소수점아래를 버리고 1을 더함
		}
		return k20_ret20;	//값을 반환
	}

}
