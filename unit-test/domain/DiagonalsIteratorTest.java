package domain;
import org.junit.Assert;
import org.junit.Test;

import domain.DiagonalsIterator;
import domain.Grid;



public class DiagonalsIteratorTest {

	@Test
	public void canRetrieveDiagonals() {
		Grid grid = new Grid();
		grid.addLine("ABCD");
		grid.addLine("ABCD");
		DiagonalsIterator diagonalIterator = new DiagonalsIterator(grid);
        Assert.assertEquals("A", diagonalIterator.next());
		Assert.assertEquals("AB", diagonalIterator.next());
		Assert.assertEquals("BC", diagonalIterator.next());
		Assert.assertEquals("CD", diagonalIterator.next());
		Assert.assertEquals("D", diagonalIterator.next());
	}
	
	@Test
	public void canComputeDiagonalsBounds() {
		Grid grid = new Grid("ABCDEFGH");
                grid.addLine("12345678");
                grid.addLine("-+&é(§è!");
        DiagonalsIterator diagonalIterator = new DiagonalsIterator(grid);
        Assert.assertEquals(-2, diagonalIterator.diagonalMin());
        Assert.assertEquals(8, diagonalIterator.diagonalMax());
	}
	
	@Test
	public void letsTriangulateDiagonalsBoundsComputation() {
		Grid grid = new Grid("ABCD");
                grid.addLine("1234");
                grid.addLine("-+&é(§è!");
                grid.addLine("-+&é(§è!");
        DiagonalsIterator diagonalIterator = new DiagonalsIterator(grid);
        Assert.assertEquals(-3, diagonalIterator.diagonalMin());
        Assert.assertEquals(4, diagonalIterator.diagonalMax());
	}
	
	@Test
	public void knowsWhenToStop() {
		Grid grid = new Grid();
		grid.addLine("ABCD");
		grid.addLine("ABCD");
		DiagonalsIterator diagonalIterator = new DiagonalsIterator(grid);
        Assert.assertTrue("A", diagonalIterator.hasNext());
        
        diagonalIterator.next();
        Assert.assertTrue("A", diagonalIterator.hasNext());
        diagonalIterator.next();
        Assert.assertTrue("A", diagonalIterator.hasNext());
        diagonalIterator.next();
        Assert.assertTrue("A", diagonalIterator.hasNext());
        diagonalIterator.next();
        Assert.assertTrue("A", diagonalIterator.hasNext());
        diagonalIterator.next();
        Assert.assertFalse("A", diagonalIterator.hasNext());
        
	}
}
