package domain;


public class LinesIterator extends GridIterator {

	public LinesIterator(Grid grid) {
		super(grid);
		maxIndex = grid.lines().size();
	}

	public String next() {
		return grid.lines().get(current++);
	}


}
