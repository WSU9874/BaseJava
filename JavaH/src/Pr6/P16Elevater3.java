package Pr6;

public class P16Elevater3 extends P13Elevator2{
	
	void Repair() {
		help = String.format("�������Դϴ�");
	}
	
	void up() {
		if(floor>=limit_up_floor) {
			help="���������Դϴ�";
		}else {
			floor=floor+2;
			help=String.format("%d���Դϴ�", floor);
		}
		this.down();
	}
	void down() {
	super.down();
	System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n",this.help);
}

}
/////18������
