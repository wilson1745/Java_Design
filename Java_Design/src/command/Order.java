package command;

public abstract class Order {
	
	// The kitchen worker
	protected KitchenWorker receiver;
	protected String name;
	
	public Order(KitchenWorker receiver) {
		this.receiver = receiver;
	}
	
	public void sendOrder() {
		receiver.finishOrder();
	}
	
	public String getName() {
		return name;
	}
	
}
