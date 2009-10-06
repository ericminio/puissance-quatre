package domain;
import org.junit.Ignore;
import org.junit.Test;

import domain.Then;
import domain.When;



public class PlayerPlays {

	@Test
	public void playerStartsOnFirstLineAndFirstColumns() {
		When.player("Y").playsInColumn(0);
		Then.gridIs("Y");
	}
	
	@Ignore
	@Test
	public void playerStartsOnFirstLineAndSecondColumns() {
		When.player("Y").playsInColumn(1);
		Then.gridIs(".Y");
	}
}
