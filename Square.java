import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle
{

	/*
	 * Constructor that calls the super constructor
	 */
	public Square(Point pointUL, int width,Color color,boolean filled) 
	{
		super(pointUL, width, width, color, filled);
	}

}
