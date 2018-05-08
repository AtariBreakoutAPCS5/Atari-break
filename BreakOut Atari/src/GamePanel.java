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
	Paddle pad;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new GamePanel().start();

	}
	private void start(){
		 frame.setSize(450,600);
		 frame.getContentPane().setBackground(new Color(0,0,0));
		 frame.setResizable(false);
		 frame.setVisible(true);
		  panel = new JPanel(){
			 @Override
			 public void paintComponent(Graphics g){
				 super.paintComponent(g);
				 drawGame();
				 frame.repaint();
				 
				 
				 }

			
		 };
		 panel.addMouseListener(new MouseAdapter(){
			 
		 });
	}
	private void drawGame() {
		// TODO Auto-generated method stub
		
	}
	private void setUpKeyMappings() {

		this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"left");
		this.getActionMap().put("left",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// what do you want to do when the left arrow is pressed?
				
			}
		});
		this.requestFocusInWindow();
		
	}

}
