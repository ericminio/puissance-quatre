package domain;
import org.junit.Test;

import domain.And;
import domain.Then;
import domain.When;

public class WinWithVerticalAlignment {

	@Test
	public void simpleWinWithFourVerticalYellow() {
		When.firstLineIs("Y");
		  And.nextLineIs("Y");
		  And.nextLineIs("Y");
		  And.nextLineIs("Y");
		Then.player("Y").wins();
	}
	
	@Test
	public void shouldNotAcceptHoles() {
		When.firstLineIs("Y");
		  And.nextLineIs("Y");
		  And.nextLineIs(".");
		  And.nextLineIs("Y");
		  And.nextLineIs("Y");
		Then.player("Y").doesntWin();
	}
	
	@Test
	public void canWinOnSecondColumn() {
		When.firstLineIs("AY");
		  And.nextLineIs("BY");
		  And.nextLineIs("CY");
		  And.nextLineIs("DY");
		Then.player("Y").wins();
	}
	
	@Test
	public void canWinWithTwoColumns() {
		When.firstLineIs("YA");
		  And.nextLineIs("YB");
		  And.nextLineIs("YC");
		  And.nextLineIs("YD");
		Then.player("Y").wins();
	}
}
