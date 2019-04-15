import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Polygon extends Shape
{
	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}
	
	public void draw(Graphics graphics)
	{
		graphics.setColor(getColor());
		int numPoints=location.length;
		if(numPoints>2)
		{
			int[] xLocations= new int[numPoints];
			int[] yLocations= new int[numPoints];
			
			for(int i=0; i< numPoints; i++)
			{
				xLocations[i]=location[i].x;
				yLocations[i]=location[i].y;
			}
			
			if(isFilled()!= true)
			{
				graphics.drawPolygon(xLocations, yLocations, numPoints);
			}
			else
			{
				graphics.fillPolygon(xLocations, yLocations, numPoints);
			}
			
		}
		else if(numPoints==2)
		{
			graphics.drawLine(location[0].x, location[0].y, location[1].x, location[1].y);
		}
		
		
	}

}
