package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class Playground extends JPanel {
	private String player1 = "Player1: 0";
	private String player2 = "Player2: 0";
	
	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("Serif", Font.BOLD, 27));
		g.drawString(player1, 20, 50);
		g.drawString(player2, 500, 50);
	}
}