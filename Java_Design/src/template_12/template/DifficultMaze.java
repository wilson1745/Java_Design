package template_12.template;

/**
 * @description DifficultMaze.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class DifficultMaze extends MazeTemplate {

	public DifficultMaze() {
		// there is hidden map in difficult maze
		super.isDoubleMaze = true;
		super.difficulty = 50;
	}

	@Override
	void createMaze() {
		System.out.println(this.getClass().getSimpleName() + " start 1000 * 1000 maze");
		System.out.println(this.getClass().getSimpleName() + " with outrageous monsters");
		System.out.println(this.getClass().getSimpleName() + " level 100th boss");
		System.out.println(this.getClass().getSimpleName() + " arrange the environment");
		System.out.println(this.getClass().getSimpleName() + " maze is ready to go");
	}

	@Override
	void start() {
		System.out.println(
				this.getClass().getSimpleName() + " adventurer start engaging the " + this.getClass().getSimpleName());
	}

}
