package pong;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GameMain extends JFrame implements Runnable{
	private static final String TITLE = "Pong";
	private static final int MAINWIDTH = 640;
	private static final int MAINHEIGHT = 480; 
	private static final Color BACKGROUND = Color.BLACK;
	
	private Playground PG;
	private Padel padelLeft;
	private Padel padelRight;
	private Ball ball;
	
	/**
	 * Constructor to set up the main window.
	 */
	public GameMain() {
		setTitle(TITLE);
		setSize(MAINWIDTH, MAINHEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(BACKGROUND);
		init();
	}
	
	public static int getMainwidth() {
		return MAINWIDTH;
	}

	public static int getMainheight() {
		return MAINHEIGHT;
	}
	
	public void init() {
		setVisible(true);
		PG = new Playground();
		padelLeft = new Padel(10, MAINHEIGHT / 2 - 25);
		padelRight = new Padel(620, MAINHEIGHT / 2 - 25);
		ball = new Ball();
	}
	
	@Override
	public void paint(Graphics g) {
		PG.paint(g);
		padelLeft.paint(g);
		padelRight.paint(g);
		ball.paint(g);
	}
	
	public void update() {
		repaint();
	}
	
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		new GameMain();	
	}
}