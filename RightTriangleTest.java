import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class RightTriangleTest
{

	private Triangle r1= new RightTriangle(new Point(100, 250), 7, 19, Color.CYAN,true);
	private Triangle r2= new RightTriangle(new Point(600, 150), 15, 8, Color.GRAY,false);
	@Test
	public void test() 
	{
		Assert.assertEquals("Quantity of points defining the Right Triangle is more than 3", 3, r1.getLocation().length);
		Assert.assertEquals("Quantity of points defining the Right Triangle is more than 3", 3, r2.getLocation().length);

		Assert.assertEquals("Incorrect location for the Right Triangle", new Point(100, 250), r1.getLocation()[0]);
		Assert.assertEquals("Incorrect location for the Right Triangle", new Point(600, 150), r2.getLocation()[0]);

		  Assert.assertEquals("Incorrect color for the Right Triangle", Color.CYAN, r1.getColor());
		  Assert.assertEquals("Incorrect color for the Right Triangle", Color.GRAY, r2.getColor());
		  
		  Assert.assertTrue("Incorrect flag for filled for the Right Triangle", r1.isFilled());
		  Assert.assertFalse("Incorrect flag for filled for the Right Triangle", r2.isFilled());
		
	}

}
