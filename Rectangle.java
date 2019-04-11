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
		super(color, filled);
		location= new Point[4];
		int originalX=(int)pointUL.getX();
		int originalY=(int)pointUL.getY();
		location[0]=pointUL;
		location[1]=new Point(originalX, originalY+height);
		location[2]=new Point(originalX+width, originalY);
		location[3]=new Point(originalX+width, originalY+height);
		// TODO Auto-generated constructor stub
	}

}
