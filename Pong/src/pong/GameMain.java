package pong;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GameMain extends JFrame implements Runnable{
	private static final String TITLE = "Pong";
	private static final int MAINWIDTH = 640;
	private static final int MAINHEIGHT = 480;
	private static final int FPS = 16;
	private static final Color BACKGROUND = Color.BLACK;
	
	
	//All objects announce 
	private Playground PG;
	private Padel padelLeft;
	private Padel padelRight;
	private Ball ball;
	
	/**
	 * Constructor to set up the main window.
	 * After the set up it will call the <code>init()</code>
	 * to initialize all objects they needed.
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
	
	/**
	 * Getter for main window width.
	 * @return Return the width as <code>int</code>.
	 */
	public static int getMainWidth() {
		return MAINWIDTH;
	}
	
	/**
	 * Getter for main window height.
	 */
	public static int getMainHeight() {
		return MAINHEIGHT;
	}
	
	/**
	 * Initialize all objects.
	 */
	public void init() {
		setVisible(true);
		PG = new Playground();
		padelLeft = new Padel(10, MAINHEIGHT / 2 - 25);
		padelRight = new Padel(620, MAINHEIGHT / 2 - 25);
		ball = new Ball();
	}
	
	/**
	 * Override the paint method of JFrame. This method must not called !
	 * Method paint is self calling when its necessary.
	 */
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, MAINWIDTH, MAINHEIGHT);
		PG.paint(g);
		padelLeft.paint(g);
		padelRight.paint(g);
		ball.paint(g);	
		g.dispose();
	}
	
	/**
	 * At the moment unused.
	 */
	public void update() {
		repaint();
	}
	
	/**
	 * Game loop.
	 */
	@Override
	public void run() {
		int i, j;
		while(true) {
			i = ball.getX();
			j = ball.getY();
			update();
			ball.setX(++i);
			ball.setY(++j);
			try {
				Thread.sleep(FPS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * MainMethod will create a new object of GameMain and start so the game.
	 * @param args
	 */
	public static void main(String[] args) {
		GameMain GM = new GameMain();
		Thread t = new Thread(GM);
		t.start();
	}
}