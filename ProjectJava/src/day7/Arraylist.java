package day7;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		/*name.add("kim");
		name.add("lee");
		name.add("john");

		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));

		name.remove(1);
		System.out.println(name);

		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());

		name.add("lee");
		System.out.println(name);

		Collections.sort(name);
		System.out.println(name);

		Collections.reverse(name);
		System.out.println(name);*/
		
		for (int i = 0; i < 10; i++) {
			data.add((int)Math.random() * 10);
		}
		System.out.println(data);
		Collection.sort(data);
		System.out.println(data);
		Collections.reverse(data);
		System.out.println(data);

	}

}
//for 10번 math.random 추가 -> 정렬
