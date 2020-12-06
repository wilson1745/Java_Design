package template_12.template;

import template_12.adventurer.Adventurer;

/**
 * @description an algorithm when creating a maze
 *
 * @author wilso
 * @date 2020/12/06
 */
public abstract class MazeTemplate {

	// level
	protected int difficulty;

	// player
	protected Adventurer adventurer;

	// hook
	protected boolean isDoubleMaze;

	public Adventurer adventurer(Adventurer adventurer) {
		this.adventurer = adventurer;

		// check player's level
		if (false == checkLevel(adventurer.getLevel())) {
			System.out.println(
					this.getClass().getSimpleName() + " Need to enhance your level to open " + difficulty + " maze");
		} else {
			System.out.println(this.getClass().getSimpleName() + " Start the maze with " + difficulty + " level");
			createMaze();
			start();

			if (isDoubleMaze) {
				// decide whether or not showing the hidden maze
				hiddenMaze();
			}

			// calculate the result
			showResult();
		}

		return this.adventurer;
	}

	private boolean checkLevel(int level) {
		return level < difficulty ? false : true;
	}

	// create maze (override by sub class)
	abstract void createMaze();

	// enter maze (override by sub class)
	abstract void start();

	private void hiddenMaze() {
		System.out.println(this.getClass().getSimpleName() + " Start the [hidden] " + difficulty + " maze");
	}

	private void showResult() {
		this.adventurer.setLevel(adventurer.getLevel() + 50 * difficulty);
		System.out.println(this.getClass().getSimpleName() + " ----" + adventurer.getType() + " complete the "
				+ difficulty + " maze");
	}

}
