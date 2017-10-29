package Controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

import Model.Salmon;
import View.Game;

public class MainController {

	// a double precise rec, you dont have to use a double rec
	private Rectangle2D rec = new Rectangle2D.Double(0, 0, 0, 0);
	private Salmon sal = new Salmon(0, 50);
	private Game game;
	
	public MainController(Game game) {
		// constructor
		this.game = game;
	}
	
	public void loop() {
		sal.move();
	}
	
	public void render(Graphics g) {
		// casting for double precision
		Graphics2D g2 = (Graphics2D) g;
		rec.setRect(sal.getX(), sal.getY(), game.getWidth()*.07, game.getHeight()*.05);
		// rendering sides of rec
		g2.draw(this.rec);
		Color c = new Color(250, 128, 114);
		g2.setColor(c);
		// rendering inside of rec
		g2.fill(this.rec);
		
	}
	
}
