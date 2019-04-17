import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest 
{

	 private Rectangle r1 = new Rectangle(new Point(100, 100), 50, 100, Color.BLACK, true);
	 private Rectangle r2 = new Rectangle(new Point(300, 100), 75, 300, Color.BLUE, false);
	    
	    private Square s1 = new Square(new Point(200, 300), 60, Color.BLUE, true);
	    private Square s2 = new Square(new Point(400, 300), 60, Color.YELLOW, false);
	@Test
	public void rectangleConstructorTest() 
	{
		// Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Rectangle is more than 4", 4, r1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Rectangle is more than 4", 4, r2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, s1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, s2.getLocation().length);

        // Verify the location for each shape
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(100, 100), r1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(300, 100), r2.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Square", new Point(200, 300), s1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Square", new Point(400, 300), s2.getLocation()[0]);

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Rectangle", Color.BLACK, r1.getColor());
        Assert.assertEquals("Incorrect color for the Rectangle", Color.BLUE, r2.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.BLUE, s1.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.YELLOW, s2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Rectangle", r1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Rectangle", r2.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Square", s1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Square", s2.isFilled());
	}

}
