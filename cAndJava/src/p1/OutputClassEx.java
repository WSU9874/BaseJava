package p1;

public class OutputClassEx {
	
	private void printResultUSD(int returnRealUSD, 
								int outputUSD100, int outputUSD50, int outputUSD10,
								int outputUSD5, int outputUSD2, int outputUSD1) {
		System.out.println(returnRealUSD + " doller");
		System.out.println("100 �޷� ���� " 
							+ outputUSD100 + " �� ");
		System.out.println("50 �޷� ����" 
							+ outputUSD50 + " �� ");
		System.out.println("10 �޷� ���� " 
							+ outputUSD10 + " �� ");
		System.out.println("5 �޷� ���� " 
							+ outputUSD5 + " �� ");
		System.out.println("2 �޷� ���� " 
							+ outputUSD2 + " �� ");
		System.out.println("1 �޷� ���� " 
							+ outputUSD1 + " �� ");
	}
	
	private void printResultWon(int charge, 
								int returnWon1000, int returnWon500, int returnWon100,
								int returnWon50, int returnWon10) {
		System.out.println("\n�ܵ� = " 
				+ charge + " �� ");
		System.out.println("1000 �� ���� " 
						+ returnWon1000 + " �� ");
		System.out.println("500 �� ���� " 
						+ returnWon500  + " �� ");
		System.out.println("100 �� ���� " 
						+ returnWon100  + " �� ");
		System.out.println("50 �� ���� " 
						+ returnWon50 + " �� ");
		System.out.println("10 �� ���� " 
						+ returnWon10 + " �� ");		
	}
	
	private void printResultEUR(int returnRealEUR, 
								int outputEUR500, int outputEUR100,
								int outputEUR50, int outputEUR20, int outputEUR10, 
								int outputEUR5, int outputEUR2,int outputEUR1) {
			 					
		System.out.println(returnRealEUR + " ����");
		System.out.println("500 ���� ���� " 
							+ outputEUR500 + " �� ");
		System.out.println("100 ���� ���� " 
							+ outputEUR100 + " �� ");
		System.out.println("50 ���� ���� " 
							+ outputEUR50 + " �� ");
		System.out.println("20 ���� ���� " 
							+ outputEUR20 + " �� ");
		System.out.println("10 ���� ���� " 
							+ outputEUR10 + " �� ");
		System.out.println("5 ���� ���� " 
							+ outputEUR5 + " �� ");																				
		System.out.println("2 ���� ���� " 
							+ outputEUR2 + " �� ");
		System.out.println("1 ���� ���� " 
							+ outputEUR1 + " �� ");
	}
	
	private void printResultJPY(int returnRealJPY,
								int outputJPY10000, int outputJPY5000,int outputJPY1000,
								int outputJPY500,int outputJPY100, int outputJPY50, int outputJPY10, int outputJPY1) {
		
		System.out.println(returnRealJPY + " ��");
		System.out.println("10000 �� ���� " 
							+ outputJPY10000 + " �� ");
		System.out.println("5000 �� ���� " 
							+ outputJPY5000 + " �� ");
		System.out.println("1000 �� ���� " 
							+ outputJPY1000 + " �� ");
		System.out.println("500 �� ����" 
							+ outputJPY500 + " �� ");
		System.out.println("100 �� ���� " 
							+ outputJPY100 + " �� ");
		System.out.println("50 �� ���� " 
							+ outputJPY50 + " �� ");
		System.out.println("10 �� ���� " 
							+ outputJPY10 + " �� ");
		System.out.println("1 �� ���� " 
				+ outputJPY1 + " �� ");


	
	}
	
	
	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
			case ConstValueClass.ERR_BALANCE_USD:
				System.out.print("�޷� ");
				break;
			case ConstValueClass.ERR_BALANCE_EUR:
				System.out.print("���� ");
				break;
			case ConstValueClass.ERR_BALANCE_JPY:
				System.out.print("��ȭ ");
				break;
		}
		System.out.println("���� �ܾ��� �����մϴ�.");
	}
	public void outputResultUSD(int returnRealUSD) {
		int outputUSD100, outputUSD50, outputUSD10;
		int outputUSD5, outputUSD2, outputUSD1;
		
		outputUSD100 = (returnRealUSD / ConstValueClass.CHANGE_USD_100);
		outputUSD50 = ((returnRealUSD % ConstValueClass.CHANGE_USD_100)) / 50;
		outputUSD10 = (((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) / 10;
		outputUSD5 = ((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 10) / 5;
		outputUSD2 = (((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 10) % 5) / 2;
		outputUSD1 = ((((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 10) % 5) % 2);
		
		printResultUSD(returnRealUSD, 
						outputUSD100, outputUSD50, outputUSD10, 
						outputUSD5, outputUSD2, outputUSD1);
		
	}
	public void outputResultEUR(int returnRealEUR) {
		int outputEUR500, outputEUR100, outputEUR50;
		int outputEUR20, outputEUR10, outputEUR5, outputEUR2, outputEUR1;
		
		outputEUR500 = (returnRealEUR / ConstValueClass.CHANGE_EUR_500);
		outputEUR100 = (returnRealEUR % ConstValueClass.CHANGE_EUR_500) / 100;
		outputEUR50 = ((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) / 50;
		outputEUR20 = (((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) / 20;
		outputEUR10 = ((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) / 10;
		outputEUR5 = (((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) % 10) / 5;
		outputEUR2 = ((((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) % 10) % 5) / 2;
		outputEUR1 = (((((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) % 10) % 5) % 2);
		
		printResultEUR(returnRealEUR, 
				outputEUR500, outputEUR100, outputEUR50,outputEUR20, outputEUR10, 
				outputEUR5, outputEUR2, outputEUR1);
		
	}
	public void outputResultJPY(int returnRealJPY) {
		int outputJPY10000, outputJPY5000, outputJPY1000, outputJPY500, ouputJPY100,
			outputJPY50, outputJPY10, outputJPY1;
		
		outputJPY10000 = (returnRealJPY / ConstValueClass.CHANGE_JPY_10000);
		outputJPY5000 = (returnRealJPY % ConstValueClass.CHANGE_JPY_10000) / 5000;
		outputJPY1000 = ((returnRealJPY % ConstValueClass.CHANGE_JPY_10000) % 5000) / 1000;
		outputJPY500 = (((returnRealJPY % ConstValueClass.CHANGE_JPY_10000) % 5000) % 1000) / 500;
		ouputJPY100 = ((((returnRealJPY % ConstValueClass.CHANGE_JPY_10000) % 5000) % 1000) % 500) / 100;
		outputJPY50 = (((((returnRealJPY % ConstValueClass.CHANGE_JPY_10000) % 5000) % 1000) % 500) % 100) / 50;
		outputJPY10 = ((((((returnRealJPY % ConstValueClass.CHANGE_JPY_10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		outputJPY1 = (((((((returnRealJPY % ConstValueClass.CHANGE_JPY_10000) % 5000) % 1000) % 500) % 100) % 50) % 10);
		
		printResultJPY(returnRealJPY, 
				outputJPY10000, outputJPY5000, outputJPY1000,outputJPY500, ouputJPY100, outputJPY50, outputJPY10, outputJPY1);
	
	}
		

	public void outputResultWon(int charge) {
		int returnWon1000, returnWon500, returnWon100, returnWon50, returnWon10;
		returnWon1000 = charge / 1000;
		returnWon500 = (charge % 1000) / 500;
		returnWon100 = ((charge % 1000) % 500) / 100;
		returnWon50 = (((charge % 1000) % 500) % 100) / 50;
		returnWon10 = ((((charge % 1000) % 500) % 100) % 50) / 10;
		
		printResultWon(charge, 
						returnWon1000, returnWon500, returnWon100, 
						returnWon50, returnWon10);
	}
}

