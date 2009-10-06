package domain;


public class DiagonalsIterator extends GridIterator {

	public DiagonalsIterator(Grid grid) {
		super(grid);
		maxIndex = diagonalMax();
		current = diagonalMin();
	}
	
	protected int diagonalMin() {
		return -grid.lines().size() + 1;
	}

	protected int diagonalMax() {
		return grid.lines().get(0).length();
	}

	public String next() {
		return getDiagonal(current++);
	}
	
	public String getDiagonal(int start) {
		int startLine = (start<0) ?  -start : 0;
		int startColumn = (start<0) ? 0 : start;
		int column = startColumn;
		
		String diagonal = "";
		for (int i=startLine; i<grid.lines().size(); i++, column++) {
			if ((column) < grid.lines().get(i).length()) {
				diagonal += "" + grid.lines().get(i).charAt(column);
			}
		}
		return diagonal;
	}

}
