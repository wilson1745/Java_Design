package command_9.order;

import command_9.kitchenworker.KitchenWorker;

public class DrinkOrder extends Order {

	public DrinkOrder(KitchenWorker receiver) {
		super(receiver);
		this.name = "drinkOrder";
	}

}
