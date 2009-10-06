package domain;


public class And {

	public static void nextLineIs(String line) {
		DomainContext.game.getGrid().addLine(line);
	}

}
