import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Area;

public class Ball {
	int x_value;
	int y_value;
	Paddle pad;
	private boolean inPlay;
	Ball ball;
	public int originalx,originaly;
	public int angleX =-1, angleY = -1;
	int w = 20, h = 20;
	

	

	
	public Ball(int x, int y){
		x_value= x;
		y_value = y;
		originalx = x;
		originaly = y;
	
	}
	public void move(){
		
		/*
		 * The move method tells the change in value for x and y as the ball is moving from one area to another. 
		 */
		
		angleX = 1;
		angleY = -1;
		int constant = 20;
		if(x_value + angleX < 0){
			angleX = 1;
		}
		else if(x_value + angleX> 450 -constant){
			angleX = 1;
		}
		 if(y_value + angleY<0){
			angleY = 1;
			System.out.println("00");
		}
		 if(y_value ==0){
//			 System.out.println("00");
			
		}
		
		x_value = x_value+ angleX;
		y_value = y_value + angleY;
		
	
}
	public void move(int x){
		int constant = 20;
		
		angleX = 1;
		angleY = -1;
		if(x_value + angleX < 0){
			angleX = 1;
		}
		else if(x_value + angleX> x -constant){
			angleX = -1;
		}
		else if(y_value + angleY<0){
			angleY = 1;
		}
		
		
		
		x_value = x_value+ angleX;
		y_value = y_value + angleY;
		
	}
	
	public void draw(Graphics g){
 		Graphics2D g2d = (Graphics2D)g.create();
 	    //Shape rectangle = new Rectangle(40, 0, 50, 30);
 	   // g2d.setColor( Color.BLUE );
 	   // g2d.fill(rectangle);
 	    Shape oval = new Ellipse2D.Double(x_value,y_value-50, 50, 50); 
 	    g2d.setColor( Color.GREEN );
 	    g2d.fill( oval );
 	    g2d.dispose();
 	}

	public Shape showyourself() {
		return new Ellipse2D.Double(x_value, y_value-50, 50, 50);	
	}
	
	public void UP() {
		y_value--;
 	}
	public void DOWN() {
		y_value++;
	}

	
	
	public static boolean testIntersection(Shape shapeA, Shape shapeB) {
	   Area areaA = new Area(shapeA);
	   areaA.intersect(new Area(shapeB));
	   return !areaA.isEmpty();
	}
	 
	public int getX(){
		return x_value;
	}
	public int getY(){
		return y_value;
	}
	public void reset() {
		x_value=originalx;
		y_value=originaly;
	}
	

}