import java.awt.Graphics;

public class Paddle {
	public int x;
	public int y;
	public Paddle(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void draw(Graphics g){
		g.fillRect(x, y, 50, 10);
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
