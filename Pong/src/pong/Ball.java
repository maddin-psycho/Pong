package pong;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Ball extends JPanel {	
	private int x;
	private int y;
	private float speed = 1.0f;
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(295, 215, 15, 15);
	}
}