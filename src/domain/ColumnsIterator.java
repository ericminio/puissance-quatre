package domain;


public class ColumnsIterator extends GridIterator {

	public ColumnsIterator(Grid grid) {
		super(grid);
		current = 0;
		maxIndex = grid.lines().get(0).length();
	}

	public String next() {
		return getColumn(current++);
	}
	
	public String getColumn(int i) {
		String column = "";
		for (String line : grid.lines()) {
			column += "" + line.charAt(i);
		}
		return column;
	}

}
