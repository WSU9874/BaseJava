package day5;

public class Doing {
	public Doing() {
		String name = "";
		double version = 1.2;
	}
		public Doing(String name, double version) {
			this.name = name;
			this.version = version;
		}
	}
	
	public void getName() {
		System.out.println(name);
	}
	public void getVersion() {
		System.out.println(version);

}
}