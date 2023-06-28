package Friend;

public class Main3 {

	public static void main(String[] args) {
		
		Fruits f = new Fruits();
		System.out.println(f.getName());
		System.out.println(f.getPrice());
		Fruits f2 = new Fruits("melon", 3000);
		System.out.println(f2.getName());
		System.out.println(f2.getPrice());

	}

} ///////////기존값 덮어쓰기
