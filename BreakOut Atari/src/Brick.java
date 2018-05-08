import java.awt.Color;
import java.awt.Graphics;

public class Brick {
	
	private Color color;
	private static final int width = 40;
	private static final int height = 20;
	private int x_value;
	private int y_value;
	
	public Brick(Color c, int x, int y){
		color =c;
		x_value = x;
		y_value = y;
		
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(x_value, y_value, width, height);
	}
	
	
	public int get_X_Value(){
		return x_value;
	}
	public int get_Y_Value(){
		return y_value;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public Color getColor(){
		return color;
	}

}
