package Pr4;

public class P24 {

	public static void main(String[] args) {
		for (int k20_i = 0; k20_i < 10; k20_i++) {
			//i는 0부터 9가될때까지 반복 j는 1회루프마다 1씩 증가
			for (int k20_j = 0; k20_j < k20_i; k20_j++)
				//j는 0부터 i가될때까지 반복 j는 1회루프마다 1씩 증가
				System.out.print(" ");
				//공백을 출력
			System.out.printf("%d\n", k20_i);
			//i를 출력한다
		}

	}

}
