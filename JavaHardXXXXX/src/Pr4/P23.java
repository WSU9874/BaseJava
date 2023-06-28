package Pr4;

public class P23 {

	public static void main(String[] args) {
		int k20_iNumVal = 1001034567;

		String k20_sNumVal = String.valueOf(k20_iNumVal);

		String k20_sNumVoice = "";

		System.out.printf("==> %s [%d자리]\n", k20_sNumVal, k20_sNumVal.length());

		int k20_i, k20_j;

		String[] k20_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] k20_unitx = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };

		k20_i = 0;
		k20_j = k20_sNumVal.length() - 1;

		while (true) {
			if (k20_i >= k20_sNumVal.length())
				break;

			System.out.printf("%s[%s]", k20_sNumVal.substring(k20_i, k20_i + 1),
					k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]);

			if (k20_sNumVal.substring(k20_i, k20_i + 1).equals("0")) {
				if (k20_unitx[k20_j].equals("만") || k20_unitx[k20_j].equals("억")) {
					k20_sNumVoice = k20_sNumVoice + "" + k20_unitx[k20_j];
				} else {

				}
			} else {
				k20_sNumVoice = k20_sNumVoice + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]
						+ k20_unitx[k20_j];
			}
			k20_i++;
			k20_j--;
		}
		System.out.printf("\n %s[%s]\n", k20_sNumVal, k20_sNumVoice);

	}

}
