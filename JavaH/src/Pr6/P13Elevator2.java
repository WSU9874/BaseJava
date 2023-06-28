package Pr6;

public class P13Elevator2 {
	public int limit_up_floor;
	public int limit_down_floor;
	public int floor;
	public String help;

	P13Elevator2() {
		limit_up_floor = 10;
		limit_down_floor = 1;
		floor = 1;
		help = "���������� �⺻ �ذ��Ϸ�";
	}

	P13Elevator2(int up_floor, int d_floor, int in_floor) {
		limit_up_floor = up_floor;
		limit_down_floor = d_floor;
		floor = in_floor;
		help = "���������� ���� �ذ��Ϸ�";
	}

	void up() {
		if (floor == limit_up_floor) {
			help = "������ ���Դϴ�";
		} else {
			floor++;
			help = String.format("[%d] ���Դϴ�", floor);
		}
	}

	void down() {
		if (floor == limit_down_floor) {
			help = "ó�� ���Դϴ�";
		} else {
			floor--;
			help = String.format("[%d] ���Դϴ�", floor);
		}
	}

	void up(int u) {
		for (int i = 0; i < u; i++)
			this.up();
	}

	void down(int u) {
		for (int i = 0; i < u; i++)
			down();
	}

	void msg(String id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", id, help, limit_up_floor, limit_down_floor, floor);
	}

}