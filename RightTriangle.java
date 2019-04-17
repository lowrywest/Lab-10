import java.awt.Color;
import java.awt.Point;

/*
 * @author Stephen
 * @author Lowry West
 * @version April 11, 2019
 */


public class RightTriangle extends Triangle
{
	public RightTriangle(Point pointLB, int base, int height,Color color, boolean filled) 
	{
		/*
		 * Super Constructor that passes in the point the color and if it is filled or not
		 */
		super(pointLB, color, filled);
		/*
		 * Array that holds all the points in the shape
		 */
		location= new Point[3];
		/*
		 * local variables to hold the original x and y location
		 */
		int originalX=(int)pointLB.getX();
		int originalY=(int)pointLB.getY();
		/*
		 * adding the points to the array
		  */
		location[0]= pointLB;
		location[1]= new Point(originalX,originalY+height);
		location[2]= new Point(originalX+base,originalY);
		// TODO Auto-generated constructor stub
	}

}

