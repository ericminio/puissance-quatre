package domain;
import java.util.Iterator;

public abstract class GridIterator implements Iterator<String> {

	protected Grid grid;
	protected int current;
	protected int maxIndex;

	public GridIterator(Grid grid) {
		this.grid = grid;
	}

	public boolean hasNext() {
		return current < maxIndex;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}