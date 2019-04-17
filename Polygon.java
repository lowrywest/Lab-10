import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Polygon extends Shape
{
	/*
	 * constructor that calls the super constructor
	 */
	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}
	/*
	 * (non-Javadoc)
	 * @see Drawable#draw(java.awt.Graphics)
	 */
	public void draw(Graphics graphics)
	{
		/*
		 * setting the color from the get color method
		 */
		graphics.setColor(getColor());
		/*
		 * making a variable that holds the number of points 
		 */
		int numPoints=location.length;
		/*
		 * determine the number of points in the array
		 */
		if(numPoints>2)
		{
			/*
			 * arrays of the x & y vals of the points set to the location
			 */
			int[] xLocations= new int[numPoints];
			int[] yLocations= new int[numPoints];
			
			/*
			 * loops through the array of points and gets just tge x&y values form the points
			 */
			for(int i=0; i< numPoints; i++)
			{
				xLocations[i]=location[i].x;
				yLocations[i]=location[i].y;
			}
			/*
			 * if the shape is not filled draw the outline
			 */
			if(isFilled()!= true)
			{
				graphics.drawPolygon(xLocations, yLocations, numPoints);
			}
			/*
			 * fill the polygon
			 */
			else
			{
				graphics.fillPolygon(xLocations, yLocations, numPoints);
			}
			
		}
		/*
		 * if it has two points draw the line
		 */
		else if(numPoints==2)
		{
			graphics.drawLine(location[0].x, location[0].y, location[1].x, location[1].y);
		}
		
		
	}

}
