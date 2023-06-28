package ticketPackage;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
	//-----------------------------------------------------------------------------------
		//****************************************************************************
	public List<OrderList> OrderList = new ArrayList<OrderList>();
		
		public void setOrderLists(String idNumber, int age, int preferOption, int amount,
									int cost) {
			OrderList order = new OrderList();
			order.setid = idNumber;
			order.setage = age; 						//이런식으로한다.
			order.setoption = amount;
		}
		public void resultPrint(int orderCount) {
			System.out.printf("%s%s%s%s%s", "id", "age", "option", "amount", "cost");
			for(OrderList order : ls.data) {
				System.out.printf("%s%d%d%d%d%d", order.getid,order.getage,order.getoption,order.
									getamount, order.getcost);
			}
		}
	//-------------------------------------------------------------------------------------
	private long customerIDNumber;
	private int age;
	private int option;
	private String optionString;
	private int amount;
	private int cost;
	
	
	
	
	
	
	public class OrderListClass {
		private int ticketGrade;
		private int totalPrice;
		private int ticketType;
		private int ticketCount;
		
		public OrderListClass(int ticketGrade, int totalPrice, int ticketType, int ticketCount) {
			this.ticketGrade = ticketGrade;
			this.totalPrice = totalPrice;
			this.ticketType = ticketType;
			this.ticketCount = ticketCount;
		}
		
		public int getTicketGrade() {
			return this.ticketGrade;
		}
		
		public int getTotalPrice() {
			return this.totalPrice;
		}
		
		public int getTicketType() {
			return this.ticketType;
		}
		
		public int getTicketCount() {
			return this.ticketCount;
		}
	}
}



