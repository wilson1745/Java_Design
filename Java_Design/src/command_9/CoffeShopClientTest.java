package command_9;

import command_9.kitchenworker.BarKeep;
import command_9.kitchenworker.Chef;
import command_9.order.DrinkOrder;
import command_9.order.Order;
import command_9.order.SanckOrder;

/**
 * @description Command
 * 
 * @author Wilson
 * @date 2020年10月11日
 */
public class CoffeShopClientTest {

	public static void main(String[] args) {
		Chef snackChef = new Chef();
		BarKeep barKeep = new BarKeep();
		Order snackOrder = new SanckOrder(snackChef);
		Order drinkOrder = new DrinkOrder(barKeep);
		Waitress cuteGirl = new Waitress();

		System.out.println("\n===== The guest has made an order! =====");
		// start making order
		cuteGirl.setOrder(snackOrder);
		cuteGirl.setOrder(snackOrder);
		cuteGirl.setOrder(drinkOrder);
		cuteGirl.setOrder(drinkOrder);
		// there are still drinks left
		cuteGirl.setOrder(drinkOrder);

		System.out.println("\n===== One guest cancel the dessert test =====");
		cuteGirl.cancelOrder(snackOrder);
		// there are still dessert left
		cuteGirl.setOrder(snackOrder);

		System.out.println("\n===== Finish making the order, I'll let the kitchen prepare for these orders =====");
		System.out.println(cuteGirl.getOrderList().size());
		cuteGirl.notifyBaker();

		System.out.println("\n===== Run out of dessert! =====");
		cuteGirl.setOrder(snackOrder);
		System.out.println(cuteGirl.getOrderList().size());

		// Test if the order is cancelled after notifying the kitchen
		cuteGirl.cancelOrder(snackOrder);
		cuteGirl.setOrder(snackOrder);
		cuteGirl.notifyBaker();

		cuteGirl.cancelOrder(drinkOrder);
		cuteGirl.setOrder(drinkOrder);
		cuteGirl.notifyBaker();

		cuteGirl.setOrder(snackOrder);
		cuteGirl.setOrder(drinkOrder);
	}

}
