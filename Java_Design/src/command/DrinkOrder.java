package command;

public class DrinkOrder extends Order {

	public DrinkOrder(KitchenWorker receiver) {
		super(receiver);
		this.name = "drinkOrder";
	}

}
