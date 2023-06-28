package Pr6;

public class InputData {
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] ave;
	String[] name;

	public InputData(int iPerson) {
		kor = new int[iPerson];
		eng = new int[iPerson];
		mat = new int[iPerson];
		sum = new int[iPerson];
		ave = new double[iPerson];
		name = new String[iPerson];
	}

	public void SetData(int i, String name, int kor, int eng, int mat) {
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng;
		this.mat[i] = mat;
		this.sum[i] = kor + eng + mat;
		this.ave[i] = (double) sum[i] / 3.0;
	}
}
