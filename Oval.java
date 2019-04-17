import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Oval extends Shape
{
	/*
	 * creating the private diameter variables that are in the uml
	 */
	private int diameter1;
	private int diameter2;
	/*
	 * Oval Constructor 
	 */
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
		super(color,filled);
		diameter1=d1;
		diameter2=d2;
		location= new Point[1];
		location[0]=pointUL;
	}
	/*
	 * returns the diameter 1
	 */
	public int getDiameter1()
	{
		return diameter1;
	}
	/*
	 * returns the diameter 2
	 */
	public int getDiameter2()
	{
		return diameter2;
	}
	/*
	 * (non-Javadoc)
	 * @see Drawable#draw(java.awt.Graphics)
	 */
	public void draw(Graphics graphics)
	{
		/*
		 * sets color
		 */
		graphics.setColor(getColor());
		/*
		 * if isnt filled then draw the outline 
		 */
		if(isFilled()!= true)
		{
			graphics.drawOval(location[0].x,location[0].y, diameter1,diameter2);
		}
		/*
		 * else fill the oval
		 */
		else
		{
			graphics.fillOval(location[0].x,location[0].y, diameter1,diameter2);
		}
	}

}
