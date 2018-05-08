import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/*
 * If there is anything wrong with this code or you dislike the way I did it, please feel free to 
 * change it how ever you see fit.
 * 
 */

public class Board  {

	private int y_value;
	private Color col;

	Color[] colors = new Color[]{Color.blue, Color.green, Color.yellow,Color.orange, Color.red};

	ArrayList<Brick> blocks = new ArrayList<Brick>();

	public Board(){

		y_value=50;
		int x_value = 0;


		//*****This is loop to put all the bricks into colors*****//
		for(int i =0; i<colors.length;i++){
			col = colors[i];
			
			while(x_value<=450){ // The value 450 represents the width of the board
				Brick brick = new Brick(col, x_value, y_value);
				blocks.add(brick);
				x_value+=50; // This value will add on to the x value
			}
			x_value = 0;
			y_value += 50;
		}
	}

	public void draw(Graphics g){
		//****This Draws the bricks****//
		for(int i = 0;i < blocks.size();i++ ){
			blocks.get(i).draw(g);
		}

	}
}
