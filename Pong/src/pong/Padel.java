package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Padel extends JPanel {
	private final int WIDTH = 10;
	private final int HEIGHT = 50;	
	private final float SPEED = 1.0f;
	
	//x and y coordinate
	private int x;
	private int y;
	
	/**
	 * Constructor of Padel they set the start x and y coordinate of the Padel.
	 * @param x Start x coordinate as int.
	 * @param y Start y coordinate as int.
	 */
	public Padel(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	/**
	 * TODO: implementing key listener.
	 */
}