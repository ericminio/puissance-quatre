package ui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class HolePanel extends JPanel {

	private int width;
	private int height;
	private boolean empty;
	
	public HolePanel(int width, int height) {
		this.width = width;
		this.height = height;
		setSize(width, height);
		empty = true;
	}
	
	public Color getBackground() {
		return Color.blue;
	}
	
	public Color getForeground() {
		return empty ? Color.white : Color.yellow;
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		
		Ellipse2D ellipse = new Ellipse2D.Float();
		ellipse.setFrame(2, 2, getWidth()-5, getHeight()-5);
		g.setClip(ellipse);
		g.setColor(getForeground());
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean newValue) {
		empty = newValue;
	}
	
}
