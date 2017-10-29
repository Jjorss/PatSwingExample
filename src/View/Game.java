package View;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.MainController;


public class Game extends JPanel{

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private static final int HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	private MainController mc;
	
	

	public Game() {
		super();
		JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setFocusable(true);
        frame.getContentPane().add(this);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);
        //frame.setVisible(true);
        frame.setVisible(true);
        mc = new MainController(this);
        
	}
	/**
	 * Standard main method.
	 * Creates a game object and starts the game.
	 * 
	 * @param args
	 * @throws InvocationTargetException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		
		Game game = new Game();
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
		game.start();
		
	}
		
	/**
	 * Main game loop. Calls repaint every tic and the game loop
	 * controller loop function to start all of the models logic methods.
	 */
	
	public void start() {
		while(true) {
			// loop
			// this is where you do fps
			mc.loop();
			repaint();
		}
	}

	/**
	 * Override paintComponet from JPanel. Takes in Graphics g.
	 * Uses g to call all render functions and handles scaling
	 * @param g Graphics object that is needed to render shapes on screen.
	 */
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // render
        mc.render(g);
	}
	public int getWidth() {
		return WIDTH;
	}
	public int getHeight() {
		return HEIGHT;
	}
	
	/**
	 * Getter for the attribute scale.
	 * @return
	 */
	
}
