package domain;
import org.junit.Assert;
import org.junit.Test;

import domain.ColumnsIterator;
import domain.Grid;



public class ColumnsIteratorTest {

	@Test
	public void canRetrieveColumns() {
		Grid grid = new Grid();
		grid.addLine("ABCD");
		grid.addLine("ABCD");
		ColumnsIterator columnsIterator = new ColumnsIterator(grid);
		Assert.assertEquals("AA", columnsIterator.next());
		Assert.assertEquals("BB", columnsIterator.next());
		Assert.assertEquals("CC", columnsIterator.next());
		Assert.assertEquals("DD", columnsIterator.next());
	}
	
	@Test
	public void knowsWhenToStop() {
		Grid grid = new Grid();
		grid.addLine("ABCD");
		grid.addLine("ABCD");
		ColumnsIterator columnsIterator = new ColumnsIterator(grid);
		Assert.assertTrue(columnsIterator.hasNext());
		
		columnsIterator.next();
		Assert.assertTrue(columnsIterator.hasNext());
		
		columnsIterator.next();
		Assert.assertTrue(columnsIterator.hasNext());
		
		columnsIterator.next();
		Assert.assertTrue(columnsIterator.hasNext());
		
		columnsIterator.next();
		Assert.assertFalse(columnsIterator.hasNext());
		
	}
}
