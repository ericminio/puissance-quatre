package domain;
import org.junit.Assert;
import org.junit.Test;



public class GameTest {

	
	@Test
	public void substringSpecs() {
		Assert.assertEquals("Z", "AZERTY".substring(1, 2));
		Assert.assertEquals("", "AZERTY".substring(1, 1));
	}
	
	
	
}
