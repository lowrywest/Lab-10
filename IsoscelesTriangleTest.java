import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class IsoscelesTriangleTest {

	private Triangle i1= new IsoscelesTriangle(new Point(300, 300), 32, 39, Color.MAGENTA, true);
	private Triangle i2= new IsoscelesTriangle(new Point(500, 330), 45, 10, Color.PINK, false);

	@Test
	public void isoscelesTriangleTest() 
	{
		Assert.assertEquals("Quantity of points defining the Isosceles Triangle is more than 3", 3, i1.getLocation().length);
		Assert.assertEquals("Quantity of points defining the Isosceles Triangle is more than 3", 3, i2.getLocation().length);
		
		Assert.assertEquals("Incorrect location for the Isosceles Triangle", new Point(300, 300), i1.getLocation()[0]);
		Assert.assertEquals("Incorrect location for the Isosceles Triangle", new Point(500, 330), i2.getLocation()[0]);
		
		Assert.assertEquals("Incorrect color for the Isosceles Triangle", Color.MAGENTA, i1.getColor());
		Assert.assertEquals("Incorrect color for the Isosceles Triangle", Color.PINK, i2.getColor());
		  
		Assert.assertTrue("Incorrect flag for filled for the Isosceles Triangle", i1.isFilled());
		Assert.assertFalse("Incorrect flag for filled for the Isosceles Triangle", i2.isFilled());
		
		
	}

}
