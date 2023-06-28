package Pr4;

public class P1718 {	// 클래스 선언

	public static void main(String[] args) {
		int k20_iVal;	//iVal라는 int변수를 정의한다
		for (int k20_i = 0; k20_i < 300; k20_i++) {	
			//i는 0부터 299될때까지 반복,i는 1회루프마다 1씩증가
			k20_iVal = 5 * k20_i;	//변수 iVal은 5 * i
			if (k20_iVal >= 0 && k20_iVal < 10)	//만약 iVal이 0이상 10미만이라면
				System.out.println("일 " + k20_iVal);	//일+iVal을 출력
			else if (k20_iVal >= 10 && k20_iVal < 100)
			//또한 만약 iVal이 10이상 100미만이라면
				System.out.println("십" + k20_iVal);	//십+iVal출력
			else if (k20_iVal >= 100 && k20_iVal < 1000)
			//또한 만약 iVal이 100이상 1000미만이라면
				System.out.println("백" + k20_iVal);	//백+iVal출력
			else	//그 외에는
				System.out.println("천" + k20_iVal);	//천+iVal출력

		}

		for (int k20_i = 1; k20_i < 13; k20_i++) {
		//i는 1부터 12될때까지 반복 i는 1회루프마다 1씩증가
			System.out.printf(" %d월 =>", k20_i);	//루프마다 i를 출력
			for (int k20_j = 1; k20_j < 32; k20_j++) {
			//j는 1부터 31될때까지 반복 j는 1회루프마다 1씩 증가	

				System.out.printf("%d", k20_j);	//j를 출력 (1,...31)

				if (k20_i == 1 && k20_j == 31)	//조건에 맞으면 break(i는 월 j는 일)
					break;						//						1월은 31까지
				if (k20_i == 2 && k20_j == 28)	//조건에 맞으면 break		|
					break;						//						2월은 28까지
				if (k20_i == 3 && k20_j == 31)	//조건에 맞으면 break		|
					break;						//						3월은 31까지
				if (k20_i == 4 && k20_j == 30)	//조건에 맞으면 break		|
					break;						//						4월은 30까지
				if (k20_i == 5 && k20_j == 31)	//조건에 맞으면 break		|
					break;						//						5월은 31까지
				if (k20_i == 6 && k20_j == 30)	//조건에 맞으면 break		|
					break;						//						6월은 30까지
				if (k20_i == 7 && k20_j == 31)	//조건에 맞으면 break		|
					break;						//						7월은 31까지
				if (k20_i == 8 && k20_j == 31)	//조건에 맞으면 break		|
					break;						//						8월은 31까지
				if (k20_i == 9 && k20_j == 30)	//조건에 맞으면 break		|
					break;						//						9월은 30까지
				if (k20_i == 10 && k20_j == 31)	//조건에 맞으면 break		|
					break;						//						10월은 31까지
				if (k20_i == 11 && k20_j == 30)	//조건에 맞으면 break		|
					break;						//						11월은 30까지
				if (k20_i == 12 && k20_j == 31)	//조건에 맞으면 break		|
					break;						//						12월은 31까지
				System.out.print(",");	//j가 출력될때마다 ,를 찍는다
										//마지막 j에는 break기때문에 ,가 찍히지 않는다.
			}
			System.out.print(".");	//마지막j 뒤에 .을 찍는다.
			System.out.println();	//줄바꿈
		}
	}

}
