package Pr6;

public class P38 {

	public static void main(String[] args) {
		int iPerson = 10;

		InputData inData = new InputData(iPerson);

		for (int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.SetData(i, name, kor, eng, mat);
		}
		for (int i = 0; i < iPerson; i++) {
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d ���:%f\n", i, inData.name[i], inData.kor[i],
					inData.eng[i], inData.mat[i], inData.sum[i], inData.ave[i]);
		}

	}

}