package d8;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> num = new Stack<Integer>();
		int cnt = 0;
		String text = scanner.nextLine();
		int t = scanner.nextInt();
		String[] arr = text.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			num.push(Integer.parseInt(arr[i]));
		}

		for (int j = 0; j < arr.length; j++) {
			cnt++;
			int number = num.pop();
			if (number == t) {
				System.out.println(cnt);
				break;
			}

		}

	}
}
