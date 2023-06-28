package day8;

public class TryCatch11 {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 12 };

		try {
			System.out.println(numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exceptionexception");
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

	}

}
/* 정상  1-4
 * 비정상  1-2or3-4
 *
 *
 *
 * try 처음에 실행
 * catch 안되면
 * catch 또 안되면
 * final 마지막에 실행
 * 
 * 
 * Exception이 제일큼 이거면 거의다 됨
 * 
 * 
 */