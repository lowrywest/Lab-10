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
	
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
		super(color,filled);
		diameter1=d1;
		diameter2=d2;
		
	}
	
	public int getDiameter1()
	{
		return diameter1;
	}
	public int getDiameter2()
	{
		return diameter2;
	}
	public void draw(Graphics graphics)
	{
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		g2d.setStroke(new BasicStroke(5));
		
	}

}
