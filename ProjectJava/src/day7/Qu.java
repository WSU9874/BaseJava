package day7;

import java.util.LinkedList;
import java.util.Queue;

public class Qu {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);

	}

}
