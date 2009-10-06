package domain;
import org.junit.Test;

import domain.And;
import domain.Then;
import domain.When;
public class WinWithDiagonalAlignment {

	@Test
	public void winWithSimpleDiagonal() {
		When.firstLineIs("A...");
		  And.nextLineIs(".A..");
		  And.nextLineIs("..A.");
		  And.nextLineIs("...A");
		Then.player("A").wins();
	}
	
	@Test
	public void winWithSecondDiagonal() {
		When.firstLineIs(".A...");
		  And.nextLineIs("..A..");
		  And.nextLineIs("...A.");
		  And.nextLineIs("....A");
		Then.player("A").wins();
	}
	
	@Test
	public void winWithUpperDiagonal() {
		When.firstLineIs(".....");
		  And.nextLineIs("A....");
		  And.nextLineIs(".A...");
		  And.nextLineIs("..A..");
		  And.nextLineIs("...A.");
		Then.player("A").wins();
	}
}
