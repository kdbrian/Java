package userinterface;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	
	public static final int SCREEN_WIDTH = 800;
	private GameScreen gameScreen;
	
	public GameWindow() {
		super("Java T-Rex game");
		setSize(SCREEN_WIDTH, 250);
		setLocation(200, 200);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}
}
