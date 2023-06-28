package Friend;

import java.util.Scanner;

public class Main2Fruit {
	Fruits apple;
	Fruits strawberry;
	Fruits grape;
	Fruits watermelon;
	public static void main(String[] args) {		
		Main2Fruit main = new Main2Fruit();
		main.initializing();
		
		
		
		while (true) {
			int num = main.showMenu();
			main.showInformation(num);
		}	
	}

	public void showInformation(int number) {
		String name = "";
		int price = 0;
		
		if (number == 1) {
			name = apple.getName();
			price = apple.getPrice();

		} else if (number == 2) {
			name = strawberry.getName();
			price = strawberry.getPrice();

		} else if (number == 3) {
			name = grape.getName();
			price = grape.getPrice();

		} else if (number == 4) {
			name = watermelon.getName();
			price = watermelon.getPrice();
			
		}
		System.out.println("This fruit if " + name + ", and the price of it is " + price);
	}
	

	public void initializing() {
		apple = new Fruits("red apple", 1000);
		strawberry = new Fruits("blue strawberry", 2000);
		grape = new Fruits("white grape", 3000);
		watermelon = new Fruits("yello watermelon", 4000);
		grape.setName("Black grape");          	///////////**********
		grape.setPrice(5000);					///////////**********

	}

	public int showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Price\n1. Apple\n2. Strawberry\n3. Grape\n4. Watermelon");
		int n = scanner.nextInt();
		return n;

	}

}
