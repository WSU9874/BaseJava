package d7;

import java.util.Arrays;
import java.util.Collections;

public class P8 {

	public static void main(String[] args) {
		Integer[] arr = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
}
