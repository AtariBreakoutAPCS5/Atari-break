import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

public class Paddle {
	public int x_value;
	private int y_value;
	private int originalx;
	private int originaly;
	
	private int  width = 70;
	private int  height = 15;
	
	int dx = 0;
	
	public Paddle(int x, int y){
		x_value = x;
		y_value = y;
		originalx=x;
		originaly=y;
	}
	public Shape showyourself() {
		return new Rectangle(x_value, y_value, width, height);	
	}
	
	public void draw(Graphics g){
		Graphics2D g2d = (Graphics2D)g.create();
 	    Shape rectangle = new Rectangle(x_value, y_value, width, height);
 	    g2d.setColor(Color.white);
 	    g2d.fill(rectangle);
 	    g2d.dispose();	
	}
	public void reset() {
		x_value=originalx;
		y_value=originaly;
	}
	
	public int getX(){
		return x_value;
	}
	public int getY(){
		return y_value;
	}
	public void moveLeft() {
		// TODO Auto-generated method stub
		dx = -3;
	}
	public void moveRight(){
		dx = 3;
	}
	
	public void release(){
		dx = 0;
	}
}
