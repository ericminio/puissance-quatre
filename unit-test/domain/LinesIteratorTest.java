package domain;
import org.junit.Assert;
import org.junit.Test;

import domain.Grid;
import domain.LinesIterator;



public class LinesIteratorTest {

	@Test
	public void canRetrieveColumns() {
		Grid grid = new Grid();
		grid.addLine("ABCD");
		grid.addLine("1234");
		LinesIterator linesIterator = new LinesIterator(grid);
		Assert.assertEquals("ABCD", linesIterator.next());
		Assert.assertEquals("1234", linesIterator.next());
	}
	
	@Test
	public void knowsWhenToStop() {
		Grid grid = new Grid();
		grid.addLine("ABCD");
		grid.addLine("1234");
		LinesIterator linesIterator = new LinesIterator(grid);
		Assert.assertTrue(linesIterator.hasNext());
		
		linesIterator.next();
		Assert.assertTrue(linesIterator.hasNext());
		
		linesIterator.next();
		Assert.assertFalse(linesIterator.hasNext());
		
	}
}
