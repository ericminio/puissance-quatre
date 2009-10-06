package ui;

import org.junit.Assert;

public class Then {

	public static void gridPanelIsEmpty() {
		Assert.assertTrue(UiContext.gridPanel.isEmpty());
		
	}

	public static void firstHoleIsNotEmpty() {
		Assert.assertFalse(UiContext.gridPanel.lines().get(0).get(0).isEmpty());
	}

	public static void secondHoleIsNotEmpty() {
		Assert.assertFalse(UiContext.gridPanel.lines().get(0).get(1).isEmpty());
	}

	public static void secondHoleOfSecondLineIsNotEmpty() {
		Assert.assertFalse(UiContext.gridPanel.lines().get(1).get(1).isEmpty());
	}

}
