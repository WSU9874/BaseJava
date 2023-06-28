package day7;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		int[] numbers = new int[100];
		String line = null;
		while (true) {
			int num = scanner.nextInt();
		line = line + "," +num;//			
		i++;
		if (num == 7) {
			break;
		}

		}
		String[] history = line.split(",");
		for (int j = 0; j < history.length; j++) {
			System.out.println(j);
			}

		}

}






//Scanner scanner = new Scanner(System.in);
//
//int i = 0;
//int[] numbers = new int[100];
//while (true) {
//	int num = scanner.nextInt();
//	numbers[i] = num;
//	i++;
//	if (num == 7) {
//		break;
//	}
//
//}
//i = 0;
//while (true) {
//	if (numbers[i] == 7) {
//		break;
//	}
//	i++;
//}
//System.out.println(i + 7);
//
//}
//
//}
