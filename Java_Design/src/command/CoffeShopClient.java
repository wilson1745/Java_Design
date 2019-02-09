package command;

public class CoffeShopClient {
	public static void main(String[] args) {
		
		System.out.println("===== Starting the command model =====");
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
