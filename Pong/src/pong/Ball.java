package pong;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Ball extends JPanel {
	//x and y coordinate.
	private int x = 295;
	private int y = 215;
	private float speed = 1.0f;
	private float angle;
	
	/**
	 * Getter for x coordinate.
	 * Return a int.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Setter for x coordinate.
	 * @param x The x coordinate as int.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Getter fox y coordinate.
	 * Return a int.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Setter a y coordinate.
	 * @param y The y coordinate as int.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Override the paint method of JPanel. 
	 * This method should only called in paint method of GameMain !
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 15, 15);
	}
}