import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private int x_value;
	private int y_value;
	
	private int  width = 70;
	private int  height = 15;
	public Paddle(int x, int y){
		x_value = x;
		y_value = y;
	}
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(x_value, y_value,width , height);
	}
	
	public int getX(){
		return x_value;
	}
	public int getY(){
		return y_value;
	}
	public void moveLeft() {
		// TODO Auto-generated method stub
		x_value--;
	}
	public void moveRight(){
		x_value++;
	}
}
