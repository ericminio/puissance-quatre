package ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import domain.Grid;

@SuppressWarnings("serial")
public class GridPanel extends JPanel {

	protected static final int HOLE_SIZE = 21;
	protected static final int LINE_NUMBER = 7;
	protected static final int COLUMN_NUMBER = 10;
	
	private List<List<HolePanel>> lines;

	public GridPanel() {
		setLayout(null);
		lines = new ArrayList<List<HolePanel>>();
		initHoles(10, 10);
	}
	
	public List<List<HolePanel>> lines() {
		return lines;
	}
	
	public void initHoles(int x, int y) {
		for (int lineIndex=0; lineIndex<LINE_NUMBER; lineIndex++) {
			List<HolePanel> line = new ArrayList<HolePanel>();
			for (int column=0; column<COLUMN_NUMBER; column++) {
				HolePanel holePanel = buildHole(
						x+column*HOLE_SIZE, 
						y+(LINE_NUMBER-lineIndex)*HOLE_SIZE, 
						HOLE_SIZE);
				line.add(holePanel);
				add(holePanel);
			}
			lines.add(line);
		}
	}
	
	public HolePanel buildHole(int x, int y, int size) {
		HolePanel hole = new HolePanel(size, size);
		hole.setLocation(x, y);
		return hole;
	}

	public boolean isEmpty() {
		boolean empty = true;
		for (List<HolePanel> line : lines) {
			for (HolePanel holePanel : line) {
				empty = empty && holePanel.isEmpty();
			}
		}
		return empty;
	}

	public void digest(Grid grid) {
		int lineIndex = 0;
		for (String line : grid.lines()) {
			for (int i=0; i<line.length(); i++) {
				HolePanel hole = lines.get(lineIndex).get(i);
				hole.setEmpty(false);
			}
			lineIndex ++;
		}
	}
}
