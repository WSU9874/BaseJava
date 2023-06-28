package Pr3;

import java.text.DecimalFormat;			//	    |
import java.text.SimpleDateFormat;		// 라이브러리 클래스 불러오기
import java.util.Calendar;				//		|

public class exchange {

	public static void main(String[] args) {
		int k20_MyWon = 1000000;	//정수형 변수에 가진 돈 100만 대입
		double k20_MoneyEx = 1238.21;	//실수형 변수에 환율 대입
		double k20_commission = 0.003;	//실수형 변수에 수수료 대입

		int k20_usd = (int) (k20_MyWon / k20_MoneyEx);	//1달러지폐 = (가진돈 나누기 환율)의 몫  
		int k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx);	//잔돈 = 가진돈 - 1달러지폐수 * 환율

		System.out.println("******************************************************");	//선출력후한줄뜀
		System.out.println("*                 수수료 없이 계산                   *");	//문장출력
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", k20_MyWon, k20_usd, k20_remain);
		//가진돈, 환전한 달러, 잔돈 출력
		
		System.out.println("******************************************************");	//선출력후한줄뜀

		///1///////////////////////////////////////////////////////////////////////////////////////

		double k20_ComperOne = k20_MoneyEx * k20_commission;	//달러당 수수료 = 환율 * 수수료

		double k20_totalcom = k20_usd * k20_ComperOne;	//총수수료 = 1달려지폐수 * 달러당수수료
		System.out.println("******************************************************");	//선출력후한줄뜀
		System.out.println("*                 수수료 없이 계산                   *");	//문장출력
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k20_totalcom, k20_usd, k20_ComperOne);
		//총수수료, 환전한 달러, 달러당 수수료
		System.out.println("******************************************************");	//선출력후한줄뜀

		//2///////////////////////////////////////////////////////////////////////////////////////

		int k20_i_totalcom;		//정수형 총 수수료 선언

		if (k20_totalcom != (double) ((int) k20_totalcom)) {	//실수형 총수수료가 정수형 총수수료와 같이 않다면
			k20_i_totalcom = (int) k20_totalcom + 1;	//정수형 총수수료는 실수형 총수수료의 정수형 변환값에 1을 더한다.
		} else {	//아니라면
			k20_i_totalcom = (int) k20_totalcom;		//정수형과 실수형의 총수수료는 같다
		}
		System.out.println("******************************************************");	//선출력후한줄뜀
		System.out.println("*                 수수료 적용 환전                   *");	//문장출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k20_i_totalcom, k20_usd, k20_ComperOne);
		//위의 최종값인 총수수료, 환전한 달러, 달러당 수수료를 출력
		
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		//잔돈 = 정수형으로 가진돈 - 1달러수 * 환율 - 정수형총수수료 

		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료 청구: %d원 잔돈: %d원\n", k20_MyWon, k20_usd, k20_i_totalcom,
				k20_remain);
		//가진돈, 1달러수, 정수형총수수료, 잔돈 출력   <- 잔돈 틀림
		System.out.println("******************************************************");	//선출력후한줄뜀
		
		//3//////////////////////////////////////////////////////////////////////////////////////////
		
		k20_usd = (int) (k20_MyWon / (k20_MoneyEx + k20_ComperOne));
		//1달러수 = 정수형으로 가진돈 / (환율 * 달러당 수수료)
		k20_totalcom = k20_usd * k20_ComperOne;
		//총 수수료 = 1달러수 * 달러당수수료
		
		if(k20_totalcom != (double)((int)k20_totalcom)) {	//만약 총수수료와 정수형총수수료의 실수화가 다르다면
			k20_i_totalcom = (int)k20_totalcom + 1; //총수수료는 총수수료의 정수형 +1 이다
		}else {	//반대라면
			k20_i_totalcom = (int)k20_totalcom;		//총수수료와 총수수료의 정수형은 같다
		}
		System.out.println("******************************************************");	//선출력후한줄뜀
		System.out.println("*                 (정확한)수수료 적용 환전                   *");	//문장출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k20_i_totalcom, k20_usd, k20_ComperOne);
		//총수수료, 1달러수, 달러당수수료 출력
		
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		//남은돈 = 정수형으로 가진돈 - 1달러수 * 환율 - 정수형 총수수료
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료청구: %d원 잔돈: %d원\n", k20_MyWon, k20_usd, k20_i_totalcom, k20_remain);
		//가진돈, 1달러수, 총수수료, 잔돈 출력
		System.out.println("******************************************************");	//선출력후한줄뜀
		
		///////////////////////////////////////////////////////////////////////////////////
		
		DecimalFormat k20_df = new DecimalFormat("###, ###, ###, ###, ###");	//decimalformat클래스를 이용해 콤마 형식을 정한다.
		
		System.out.println("******************************************************");	//선출력후한줄뜀
		System.out.println("*                  콤마찍기, 날짜 적용               *");	//문장입력
		
		System.out.printf("총수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n",
		k20_df.format(k20_i_totalcom), k20_df.format(k20_usd), k20_ComperOne);
		//총수수료 1달러수 달러당 수수료를 위의 형식에 맞게 콤마를 찍어 출력
		
		k20_remain = (int)(k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		//남은돈 = 정수형으로 가진돈 - 1달러수 * 환율 - 정수형 총수수료
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료청구: %s원 잔돈: %s원\n", 
				k20_df.format(k20_MyWon), k20_df.format(k20_usd), k20_df.format(k20_i_totalcom), k20_df.format(k20_remain));
		//가진돈 1달러수 총수수료 잔돈을 위의 형식에 맞게 콤마를 찍어 출력

		///////////////////////////////////////////////////////////////////////////////////////
		
		Calendar calt = Calendar.getInstance();
		//캘린더 클래스를 불러온다
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//simpledateformat클래스로 날짜 형식을 정한다
		System.out.printf("최종실행시간: %s\n", k20_sdt.format(calt.getTime()));
		//최종실행시간을 현재시간으로 하여 위의 형식에 맞게 출력한다
		
		System.out.println("******************************************************");	//선출력후줄바꿈
	}
		
		
		
	

}
