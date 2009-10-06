package ui;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import domain.Grid;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {

	public GameFrame() {
		this.getContentPane().setLayout(new BorderLayout());
		GridPanel gridPanel = new GridPanel();
		Grid grid = new Grid("YY");
		        grid.addLine("R");
		gridPanel.digest(grid);
		this.getContentPane().add(gridPanel, BorderLayout.CENTER);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	
}
