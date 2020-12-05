package command_9.order;

import command_9.kitchenworker.KitchenWorker;

public abstract class Order {

	// The receiver
	protected KitchenWorker receiver;
	protected String name;

	public Order(KitchenWorker receiver) {
		this.receiver = receiver;
	}

	// Send orders to the chief
	public void sendOrder() {
		receiver.finishOrder();
	}

	public KitchenWorker getReceiver() {
		return receiver;
	}

	public void setReceiver(KitchenWorker receiver) {
		this.receiver = receiver;
	}

	// What kind of orders
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
