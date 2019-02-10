package command;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
	
	private int snackQty = 2;
	private int drinkQty = 4;
	private List<Order> orderList = new ArrayList<>();
	
	/*
	 * The waitress receives the order
	 * @param order
	 * */
	public void setOrder(Order order) {
		try {
			switch (order.name) {
			case "snackOrder":
				if (snackQty <= 0) {
					System.out.println("The snack has been out of order!");
				} else {
					System.out.println("Add snack order!");
					snackQty--;
					orderList.add(order);
				}
				break;
			case "drinkOrder":
				if (drinkQty <= 0) {
					System.out.println("The drink has been out of order!");
				} else {
					System.out.println("Add drink order!");
					drinkQty--;
					orderList.add(order);
				}
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Cancel the order
	 * @param order
	 * */
	public void cancelOrder(Order order) {
		try {
			if (orderList.size() != 0) {
				switch (order.name) {
				case "snackOrder":
					snackQty++;
					System.out.println("Cancel one sanck order!");
					break;
				case "drinkOrder":
					drinkQty++;
					System.out.println("Cancel one drink order!");
					break;
				default:
					break;
				}
				orderList.remove(order);	
			} else {
				System.out.println("\nThere is no order left!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Deliver the order to kitchen
	public void notifyBaker() {		
		for (Order order : orderList) {
			order.sendOrder();
		}
		
		orderList.clear();
	}
	
	public List<Order> getOrderList() {
		return orderList;
	}
}
