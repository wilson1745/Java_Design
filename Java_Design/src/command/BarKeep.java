package command;

public class BarKeep implements KitchenWorker {

	@Override
	public void finishOrder() {
		System.out.println("Take out the cup -> Add the ice -> Add drink into the cup -> Finish the drink!");
	}

}
