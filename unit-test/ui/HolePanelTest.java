package ui;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;


public class HolePanelTest {

	@Test
	public void notEmptyStateShouldBeVisible() {
		HolePanel holePanel = new HolePanel(10, 10);
		holePanel.setEmpty(true);
		Color emptyColor = holePanel.getForeground();
		holePanel.setEmpty(false);
		Color notEmptyColor = holePanel.getForeground();
		Assert.assertNotSame(emptyColor, notEmptyColor);
	}
}
