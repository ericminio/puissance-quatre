package domain;

import org.junit.Assert;


public class Then {
	
	private static Then instance;
	static {
		instance = new Then();
	}
	private static String token;

	public static Then player(String player) {
		Then.token = player;
		return instance;
	}

	public void wins() {
		Assert.assertTrue(DomainContext.game.won(token));
	}

	public void doesntWin() {
		Assert.assertFalse(DomainContext.game.won(token));
	}

	public static void gridIs(String expected) {
		Assert.assertEquals(expected, DomainContext.game.getGrid().lines().get(0));
	}
}
