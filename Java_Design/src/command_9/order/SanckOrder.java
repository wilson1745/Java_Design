package command_9.order;

import command_9.kitchenworker.KitchenWorker;

public class SanckOrder extends Order {

	public SanckOrder(KitchenWorker receiver) {
		super(receiver);
		this.name = "snackOrder";
	}

}
