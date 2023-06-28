package DataPKG;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] nums = new int[num];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + ", ");
		}

	}
}

//public static void main(String[] args) {
//
//	boolean[] checkDuplicated = new boolean[45];
//	for (int i = 0; i < checkDuplicated.length; i++) {
//		
//		int cnt = 0;
//		while (cnt < 6) {
//			int num = getRandomNumber();
//			if(checkDuplicated[num - 1] == true) {
//				continue;
//			}else {
//				checkDuplicated[num - 1] = true;
//				System.out.println(num);
//				cnt++;
//			}
//		}
//	}
//}
//
//	public static int getRandomNumber() {
//		
//		int ret = 0;
//		while (true) {
//			ret = (int) (Math.random() * 45);
//			if(ret != 0 && ret <=45) {
//				break;
//			}
//		}
//		return ret;


//String companyNumber1 = "19001";
//String companyNumber2 = "20002";
//String companyNumber3 = "20003";
//String[] companyNumbers = new String[3];
//companyNumbers[0] = "19001";
//companyNumbers[1] = "20002";
//companyNumbers[2] = "20003";
//
//for (int i = 0; i < companyNumbers.length;i++) {
//	System.out.println(companyNumbers[i]);
