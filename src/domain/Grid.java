package domain;
import java.util.ArrayList;
import java.util.List;


public class Grid {

	private List<String> lines;
	
	public Grid() {
		lines = new ArrayList<String>();
	}
	
	public Grid(String firstLine) {
		this();
		addLine(firstLine);
	}
	
	public List<String> lines() {
		return lines;
	}
	
	public void addLine(String line) {
		lines.add(line);
	}
	
	
}
