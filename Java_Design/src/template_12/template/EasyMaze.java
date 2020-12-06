package template_12.template;

/**
 * @description EazyMaze.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class EasyMaze extends MazeTemplate {

	public EasyMaze() {
		super.difficulty = 1;
	}

	@Override
	void createMaze() {
		System.out.println(this.getClass().getSimpleName() + " start 100 * 100 maze");
		System.out.println(this.getClass().getSimpleName() + " with 10 little monsters");
		System.out.println(this.getClass().getSimpleName() + " level 10th boss");
		System.out.println(this.getClass().getSimpleName() + " arrange the environment");
		System.out.println(this.getClass().getSimpleName() + " maze is ready to go");
	}

	@Override
	void start() {
		System.out.println(
				this.getClass().getSimpleName() + " adventurer start engaging the " + this.getClass().getSimpleName());
	}

}
