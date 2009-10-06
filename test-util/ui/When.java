package ui;

import domain.Grid;

public class When {

	public static void uiStarts() {
		UiContext.gridPanel = new GridPanel();
	}

	public static void uiDigest(Grid grid) {
		uiStarts();
		UiContext.gridPanel.digest(grid);
	}

}
