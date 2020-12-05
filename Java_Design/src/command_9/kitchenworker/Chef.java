package command_9.kitchenworker;

public class Chef implements KitchenWorker {

	@Override
	public void finishOrder() {
		System.out.println("Take out the bread -> Add the butter -> Put the bread into the hitter -> Add some decorations -> Finish the dessert!");
	}

}
