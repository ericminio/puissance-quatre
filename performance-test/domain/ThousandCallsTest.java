package domain;
import org.junit.Test;

import domain.And;
import domain.Then;
import domain.When;



public class ThousandCallsTest {

	@Test(timeout=200)
	public void winWithSimpleDiagonal() {
		for (int i=0; i<10000; i++) {
			When.firstLineIs("A...");
			  And.nextLineIs(".A..");
			  And.nextLineIs("..A.");
			  And.nextLineIs("...A");
			Then.player("A").wins();
		}
	}
}
