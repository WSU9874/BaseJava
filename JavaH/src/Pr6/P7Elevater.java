package Pr6;

public class P7Elevater {
	int limit_up_floor = 10;
	int limit_down_floor = 0;
	int floor = 1;
	String help;

	void up() {
		if (floor == limit_up_floor) {
			help = "���������Դϴ�";
		} else {
			floor++;
			help = String.format("%d���Դϴ�", floor);
		}
	}

	void down() {
		if (floor == limit_down_floor) {
			help = "ó�����Դϴ�";
		} else {
			floor--;
			help = String.format("%d���Դϴ�", floor);
		}
	}

}
