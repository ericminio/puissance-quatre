package domain;
import java.util.Iterator;


public class Game {

	private Grid grid;
	
	public Game() {
		grid = new Grid();
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	public boolean won(String token) {
		return hasFourAligned(new LinesIterator(grid), token)
			|| hasFourAligned(new ColumnsIterator(grid), token)
			|| hasFourAligned(new DiagonalsIterator(grid), token)
			;
	}
	
	protected boolean hasFourAligned(Iterator<String> iterator, String token) {
		boolean wins = false;
		while (iterator.hasNext()) {
			wins = tokenIsFoundFourTime(token, iterator.next()) || wins;
		}
		return wins;
	}
	
	protected boolean tokenIsFoundFourTime(String token, String candidate) {
		int nb = 0;
		for (int i=0; i<candidate.length(); i++) {
			if (stringHasTokenAt(candidate, token, i)) {
				nb ++;
			}
			else {
				nb = 0;
			}				
		}
		return nb>=4;
	}
	
	protected boolean stringHasTokenAt(String candidate, String token, int i) {
		return candidate.substring(i, i+1).compareTo(token)==0;
	}

	
}
