import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;


public abstract class Shape implements Drawable
{
	/*
	 * global variables that are used in every shape
	 */
	protected Point[] location;
	private Color color;
	private boolean filled;
	
	/*
	 * Shape constructor used throughout the shapes
	 */
	public Shape(Color color, boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	/*
	 * returns color
	 */
	public Color getColor()
	{
		return color;
	}
	/*
	 * returns if it is filled or not
	 */
	public boolean isFilled()
	{
		return filled;
	}
	/*
	 * returns the array of points
	 */
	public Point[] getLocation()
	{
		return location;
	}
}