package Friend;

public class MainPC {

	public static void main(String[] args) {
		PrintClass pc = new PrintClass(19, 1);
		int result = pc.printAdd();
		System.out.println(result);
		
		System.out.println(pc.printAdd());
		
		PrintClass pc2 = new PrintClass(19, 2);
		System.out.println(pc2.printAdd());
		System.out.println(pc2.printMul());
		

	}

}
