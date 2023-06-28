package day7;

public class MulArray2 {

	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		//System.out.println(numbers.length);
		for(int i = 0; i < numbers.length; i++) {
			//System.out.println(numbers[i].length);
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
