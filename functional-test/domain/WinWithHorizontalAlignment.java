package domain;
import org.junit.Test;

import domain.And;
import domain.Then;
import domain.When;
public class WinWithHorizontalAlignment {

	@Test
	public void simpleWinWithFourHorizontalYellow() {
		When.gridIs("YYYY");
		Then.player("Y").wins();
	}
	
	@Test
	public void shouldNotAcceptHoles() {
		When.gridIs("YYY..YY");
		Then.player("Y").doesntWin();
	}

	@Test
	public void canWinOnSecondLine() {
		When.firstLineIs("ABCD");
		  And.nextLineIs("YYYY");
		Then.player("Y").wins();
	}
	
	@Test
	public void canWinWithTwoLines() {
		When.firstLineIs("YYYY");
		  And.nextLineIs("ABCD");
		Then.player("Y").wins();
	}
}
