package Pr6;

public class P5 {
	static int iStatic;
	
	public static void add(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("add메소드에서 -> i=[%d]\n", i);
	}
	
	public static int add2(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("add메소드에서 -> i=[%d]\n", i);
		return i;
	}


	public static void main(String[] args) {
		int iMain;
		
		iMain = 1;
		iStatic = 1;
		
		System.out.println("********************************");
		System.out.printf("메소드 호출전 메인에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("메소드 호출전 메인에서 -> iMain=[%d]\n", iMain);
		System.out.println("********************************");

		add(iMain);
		
		System.out.println("********************************");
		System.out.printf("메소드 호출전 메인에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("메소드 호출전 메인에서 -> iMain=[%d]\n", iMain);
		System.out.println("********************************");

		iMain = add2(iMain);
		
		System.out.println("********************************");
		System.out.printf("메소드 호출전 메인에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("메소드 호출전 메인에서 -> iMain=[%d]\n", iMain);
		System.out.println("********************************");

	}

}
