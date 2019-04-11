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
		super(pointLB, color, filled);
		location= new Point[3];
		int originalX=(int)pointLB.getX();
		int originalY=(int)pointLB.getY();
		location[0]= pointLB;
		location[1]= new Point(originalX,originalY+height);
		location[2]= new Point(originalX+base,originalY);
		// TODO Auto-generated constructor stub
	}

}

