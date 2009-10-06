package domain;


public class When {

	private static When instance;
	static {
		instance = new When();
	}
	private static String token;

	public static When player(String player) {
		When.token = player;
		return instance;
	}
	
	public static void firstLineIs(String firstLine) {
		gridIs(firstLine);
	}
	
	public static void gridIs(String firstLine) {
		DomainContext.game = new Game();
		DomainContext.game.getGrid().addLine(firstLine);
	}

	public void playsInColumn(int i) {
		DomainContext.game = new Game();
		DomainContext.game.getGrid().addLine(token);
	}

	
	
}
