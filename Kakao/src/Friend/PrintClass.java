package Friend;

public class PrintClass {
	
	int a;
	int b;
	
	public PrintClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/*public int printAdd(int a, int b) {
		int sum;
		sum = a + b;
		return sum;*/
		
	
	
	public int printAdd() {
		return this.a + this.b;

}
	public int printMul() {
		return this.a * this.b;
}
}


//this 없어도 됨 명확하게 하기위해서 사용