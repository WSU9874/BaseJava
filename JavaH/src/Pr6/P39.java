package Pr6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P39 {

	public static void main(String[] args) {
		int iPerson = 31;
		int sumKor = 0;
		int sumEng = 0;
		int sumMat = 0;
		int sumTotal = 0;
		int sumAvg = 0;


		InputData inData = new InputData(iPerson);

		for (int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.SetData(i, name, kor, eng, mat);
		}
		Calendar calt = Calendar.getInstance();
		// 캘린더 클래스를 불러온다
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		System.out.printf("%20s\n", "성적집계표");
		System.out.printf("%30s : %s\n","출력일자", k20_sdt.format(calt.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("%s%5s%5s%5s%5s%5s%5s\n","번호","이름","국어","영어","수학","총점","평균");
		System.out.printf("=================================================\n");
		
		for (int i = 1; i < iPerson; i++) {
			System.out.printf("%3d %7s %4d %5d %6d %7d %5d\n", i, inData.name[i], inData.kor[i],
					inData.eng[i], inData.mat[i], inData.sum[i], (int)inData.ave[i]);
		}
		System.out.printf("=================================================\n");
		for(int i = 1;i<iPerson;i++) {
			sumKor = sumKor + inData.kor[i];
			sumEng = sumEng + inData.eng[i];
			sumMat = sumMat + inData.mat[i];
			sumTotal = sumTotal + inData.sum[i];
			sumAvg = sumAvg + (int)inData.ave[i];
			
		}
		System.out.printf("%s %15d %5d %6d %6d %6d\n","합계",sumKor,sumEng,sumMat,sumTotal,sumAvg);
		System.out.printf("%s %15d %5d %6d %6d %6d\n","평균",sumKor/30,sumEng/30,sumMat/30,sumTotal/30,sumAvg/30);
		
	}

}
