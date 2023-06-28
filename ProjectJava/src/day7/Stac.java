package day7;

import java.util.Stack;

public class Stac {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("kim");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}
