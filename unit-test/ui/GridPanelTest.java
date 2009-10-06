package ui;

import org.junit.Test;

import domain.Grid;

public class GridPanelTest {

	@Test
	public void shouldBeEmptyAtStart() {
		When.uiStarts();
		Then.gridPanelIsEmpty();
	}
	
	@Test
	public void canDigestAToken() {
		Grid grid = new Grid("Y");
		When.uiDigest(grid);
		Then.firstHoleIsNotEmpty();
	}
	
	@Test
	public void canDigestTwoTokens() {
		Grid grid = new Grid("YY");
		When.uiDigest(grid);
		Then.secondHoleIsNotEmpty();
	}
	
	@Test
	public void canDigestTwoLines() {
		Grid grid = new Grid("YY");
		        grid.addLine("RR");
		When.uiDigest(grid);
		Then.secondHoleOfSecondLineIsNotEmpty();
	}
}
