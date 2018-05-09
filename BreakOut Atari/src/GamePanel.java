import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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

public class GamePanel extends JPanel {
	JFrame frame = new JFrame("Breakout");
	private JPanel panel;
	
	private int padX = 200;
	private int padY =525;
	Paddle pad = new Paddle (padX,padY);
	Board board = new Board();
	
	private int width = 450;
	private int height = 600;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GamePanel().start();

	}
	private void start() {

		
		frame.setResizable(false);
		
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.BLACK);

//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGame(g);
			}

		};
		panel.setPreferredSize(new Dimension(width,height));
		
		frame.add(panel);
		frame.pack();
		panel.addMouseListener(new MouseAdapter() {
			
			
		});
		setUpKeyMappings();
		frame.repaint();

		//		frame.setSize(450,600);
		//		frame.getContentPane().setBackground(new Color(0,0,0));
		//		frame.setResizable(false);
		//		frame.setVisible(true);
		//		panel = new JPanel(){
		//			@Override
		//			public void paintComponent(Graphics g){
		//				super.paintComponent(g);
		//				drawGame(g);
		//				frame.repaint(); 
		//			}
		//
		//		};
		//
		//
		//		frame.pack();
		//
		//		panel.addMouseListener(new MouseAdapter(){
		//
		//		});
	}
	private void drawGame(Graphics g) {
		// TODO Auto-generated method stub
		board.draw(g);
		frame.repaint();


	}
	
	private void setUpKeyMappings() {

		panel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"left");
		panel.getActionMap().put("left",new AbstractAction(){

			@Override
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

			@Override
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
