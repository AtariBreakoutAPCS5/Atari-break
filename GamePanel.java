import java.awt.Color;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.UIManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.event.*;

import java.awt.Color;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.UIManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.event.*;

public class GamePanel  { // gamepanel doens't need to be a Jpanel
	JFrame frame = new JFrame("Breakout");
	private JPanel panel;
	
	private int padX = 200; //
	private int padY =525; //
	Paddle pad = new Paddle (padX,padY); // are these truly needed if they are in board?
	Ball ball = new Ball(padX, padY);
	Board board = new Board();
	int speed = 5;
	private int width = 450;
	private int height = 600;
	private Timer ticker = new Timer(speed, null);
	private boolean moving ;
	private boolean dir = true;




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GamePanel().start();

	}
	private void start() {
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		panel = new JPanel() { //great syntax not learned
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGame(g);
			}

		};
		panel.setBackground(Color.BLACK);
		panel.setPreferredSize(new Dimension(width,height));
		
		frame.add(panel);
		frame.pack();
		
	
		setUpKeyMappings();
		//frame.repaint(); // needed or not
 		 
	}
	private void startTimer() {
		ticker.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int brickx =0;
//			if(dir == true) {
//		ball.UP();
//			}
//			if(dir == false) {
//				ball.DOWN();
//				frame.repaint();
//			}
			if(dir == true){
				ball.move();
				frame.repaint();
			}
			if(dir == false){
				ball.move(brickx);
			}
			
			for (int g=0; g<board.blocks.size();g++) {
				if ((testIntersection(ball.showyourself(),board.blocks.get(g).showyourself()))) {
					brickx = board.blocks.get(g).get_X_Value();
					dir = false;
 				}
			}
			
			if ((testIntersection(ball.showyourself(),pad.showyourself()))){
				dir = true;
				ball.move();
				
}
			if(ball.getY()>620) {
				ball.reset();
				pad.reset();
				ticker.stop();
			}
			frame.repaint();
			}
		});
		if(moving = true) {
		ticker.start();
		}
		if(moving = false) {
		ticker.stop();
		}
		}
	
	
	private void drawGame(Graphics g) {
		// TODO Auto-generated method stub
		
		ball.draw(g);
		pad.draw(g);
		board.draw(g);
		//frame.repaint(); // needed or not


	}
	private void endGame() {
		
	}
	
	public static boolean testIntersection(Shape shapeA, Shape shapeB) {
		   Area areaA = new Area(shapeA);
		   areaA.intersect(new Area(shapeB));
		   return !areaA.isEmpty();
		}
	
	private void setUpKeyMappings() {
		panel.getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"space");
		panel.getActionMap().put("space",new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				// what do you want to do when the left arrow is pressed?
				moving = true;
				startTimer();
		
				panel.repaint();
			}
		});
		panel.requestFocusInWindow();


		panel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"left");
		panel.getActionMap().put("left",new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				// what do you want to do when the left arrow is pressed?
				pad.moveLeft();
		
 				System.out.println("You have pressed LEFT!" + pad.getX());
				panel.repaint();
			}
		});
		panel.requestFocusInWindow();

		panel.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"right");
		panel.getActionMap().put("right",new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				// what do you want to do when the left arrow is pressed?
				pad.moveRight();
				
				System.out.println("You have pressed RIGHT!" + pad.getX());
				panel.repaint();
			}
		});
		panel.requestFocusInWindow();

	}

}
