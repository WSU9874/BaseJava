package d8;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> num = new LinkedList<Integer>();
		int cnt = 0;
		String text = scanner.nextLine();
		int t = scanner.nextInt();
		String[] arr = text.split(" ");

		for (int i = 0; i < arr.length; i++) {
			num.add(Integer.parseInt(arr[i]));
		}

		for (int j = 0; j < arr.length; j++) {
			cnt++;
			int number = num.poll();
			if (number == t) {
				System.out.println(cnt);
				break;
			}

		}

	}
}
