import java.awt.Color;
import java.awt.Point;

/*
 * @author Stephen
 * @author Lowry West
 * @version April 11, 2019
 */


public class RightTriangle extends Triangle
{
	private int base;
	private int height;

	public RightTriangle(Point pointLB, int base, int height,Color color, boolean filled) 
	{
		super(pointLB, color, filled);
		this.base=base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

}
