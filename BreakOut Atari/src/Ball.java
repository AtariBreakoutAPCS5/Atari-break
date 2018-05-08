import java.awt.Graphics;

public class Ball {
	
	int x_value;
	int y_value;
	Paddle pad;
	
	public Ball(int x, int y){
		x_value= x;
		y_value = y;
	
	}
	public void draw(Graphics g){
		pad.getX();
	}
	public int getX(){
		return x_value;
	}
	public int getY(){
		return y_value;
	}
	

}
