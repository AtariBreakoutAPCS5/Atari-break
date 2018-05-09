import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Brick {
	
	private Color color;
	private static final int width = 20;
	private static final int height = 20;
	private int x_value;
	private int y_value;
	
	public Brick(Color c, int x, int y){
		color =c;
		x_value = x;
		y_value = y;
		
	}
	public void draw(Graphics g){
 
	
		Graphics2D g2d = (Graphics2D)g.create();
 	    Shape rectangle = new Rectangle(x_value, y_value, width, height);
 	    g2d.setColor(color);
 	    g2d.fill(rectangle);
 	    g2d.dispose();	
		
	}
	
	public Shape showyourself() {
		return new Rectangle(x_value, y_value, width, height);	
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
