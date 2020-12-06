package template_12;

import java.util.logging.Logger;

import org.junit.Test;

import template_12.adventurer.Adventurer;
import template_12.adventurer.Gundam;
import template_12.adventurer.Sabar;
import template_12.template.DifficultMaze;
import template_12.template.EasyMaze;
import template_12.template.MazeTemplate;

/**
 * @description Test.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class MazeTest {

	Logger logger = Logger.getLogger(MazeTest.class.getSimpleName());

	Adventurer sabar = new Sabar();
	Adventurer gundam = new Gundam();

	MazeTemplate easyMaze = new EasyMaze();
	MazeTemplate hardMaze = new DifficultMaze();

	@Test
	public void test() {
		logger.info("====Hard Maze====");
		sabar = hardMaze.adventurer(sabar);

		logger.info("====Easy Maze====");
		sabar = easyMaze.adventurer(sabar);

		// after growing up
		logger.info("====Hard Maze====");
		sabar = hardMaze.adventurer(sabar);
		System.out.println("");
		gundam = hardMaze.adventurer(gundam);
	}

}
