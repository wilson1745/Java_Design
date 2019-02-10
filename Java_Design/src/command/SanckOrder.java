package command;

public class SanckOrder extends Order {

	public SanckOrder(KitchenWorker receiver) {
		super(receiver);
		this.name = "snackOrder";
	}

}
