package Pr4;

import java.text.DecimalFormat;

public class P28 {

	public static void main(String[] args) {
		String k20_item = "사과";
		int k20_unit_price = 5000;
		int k20_num = 500;
		int k20_total = 0;

		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");

		System.out.println("====================================================");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");
		System.out.println("====================================================");

		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", k20_item, k20_df.format(k20_unit_price),
				k20_df.format(k20_num), k20_df.format(k20_unit_price * k20_num));
		System.out.println("====================================================");

	}

}
