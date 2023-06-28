package day7;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);
	}
}
