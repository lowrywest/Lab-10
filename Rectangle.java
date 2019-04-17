import java.awt.Color;
import java.awt.Point;

/*
 * @version April 11, 2019 Lab 10
 * @author Lowry West
 */

public class Rectangle extends Polygon
{

	public Rectangle(Point pointUL, int width,int height,Color color,boolean filled)
	{
		/*
		 * Super Constructor that passes in the color and if it is filled or not
		 */
		super(color, filled);
		location= new Point[4];
		int originalX=pointUL.x;
		int originalY=pointUL.y;
		location[0]=pointUL;
		location[2]=new Point(originalX, originalY+height);
		location[1]=new Point(originalX+width, originalY);
		location[3]=new Point(originalX+width, originalY+height);
		// TODO Auto-generated constructor stub
	}

}
