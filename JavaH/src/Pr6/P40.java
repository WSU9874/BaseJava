package Pr6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P40 {

	public static void main(String[] args) {
		int iPerson = 46;
		int page = iPerson / 30 + 1;
		int sumKor = 0;
		int sumEng = 0;
		int sumMat = 0;
		int sumTotal = 0;
		int sumAvg = 0;

		InputData inData = new InputData(iPerson);

		for (int i = 1; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.SetData(i, name, kor, eng, mat);
		}
		

			Calendar calt = Calendar.getInstance();
			// Ķ���� Ŭ������ �ҷ��´�
			SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
			System.out.printf("%20s\n\n", "��������ǥ");
			System.out.printf("%s:  %30s : %s\n", "PAGE", "�������", k20_sdt.format(calt.getTime()));
			System.out.printf("=================================================\n");
			System.out.printf("%s%5s%5s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
			System.out.printf("=================================================\n");

			for (int k = 1; k < 31; k++) {
				System.out.printf("%3d %7s %4d %5d %6d %7d %5d\n", k, inData.name[k], inData.kor[k], inData.eng[k],
						inData.mat[k], inData.sum[k], (int) inData.ave[k]);
				
				
				if(k==30) {
					System.out.printf("=================================================\n");
					for (int j = 1; j < 31; j++) {
						sumKor = sumKor + inData.kor[j];
						sumEng = sumEng + inData.eng[j];
						sumMat = sumMat + inData.mat[j];
						sumTotal = sumTotal + inData.sum[j];
						sumAvg = sumAvg + (int) inData.ave[j];
					}
					System.out.printf("����������\n");
					System.out.printf("%s %15d %5d %6d %6d %6d\n", "�հ�", sumKor, sumEng, sumMat, sumTotal, sumAvg);
					System.out.printf("%s %15d %5d %6d %6d %6d\n", "���", sumKor / 30, sumEng / 30, sumMat / 30, sumTotal / 30,
							sumAvg / 30);
					System.out.println("\n\n");
					System.out.printf("%20s\n\n", "��������ǥ");
					System.out.printf("%s:  %30s : %s\n", "PAGE", "�������", k20_sdt.format(calt.getTime()));
					System.out.printf("=================================================\n");
					System.out.printf("%s%5s%5s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
					System.out.printf("=================================================\n");
					
					
					

					for( k = 31;k < iPerson;k++) {
						
						System.out.printf("%3d %7s %4d %5d %6d %7d %5d\n", k, inData.name[k], inData.kor[k], inData.eng[k],
								inData.mat[k], inData.sum[k], (int) inData.ave[k]);
						
					}
				}
			}
			
			
			
			System.out.printf("=================================================\n");
			for (int j = 31; j < iPerson; j++) {
				sumKor = sumKor + inData.kor[j];
				sumEng = sumEng + inData.eng[j];
				sumMat = sumMat + inData.mat[j];
				sumTotal = sumTotal + inData.sum[j];
				sumAvg = sumAvg + (int) inData.ave[j];

			}
			System.out.printf("����������\n");
			System.out.printf("%s %15d %5d %6d %6d %6d\n", "�հ�", sumKor, sumEng, sumMat, sumTotal, sumAvg);
			System.out.printf("%s %15d %5d %6d %6d %6d\n", "���", sumKor / 30, sumEng / 30, sumMat / 30, sumTotal / 30,
					sumAvg / 30);
			System.out.println("\n\n");
		
	}

}