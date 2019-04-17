import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

	private Square s1 = new Square(new Point(200, 300), 60, Color.BLUE, true);
    private Square s2 = new Square(new Point(400, 300), 60, Color.YELLOW, false);
	@Test
	public void test() 
	{
		Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, s1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, s2.getLocation().length);
        
        Assert.assertEquals("Incorrect location for the Square", new Point(200, 300), s1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Square", new Point(400, 300), s2.getLocation()[0]);
        
        Assert.assertEquals("Incorrect color for the Square", Color.BLUE, s1.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.YELLOW, s2.getColor());
        
        Assert.assertTrue("Incorrect flag for filled for the Square", s1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Square", s2.isFilled());
	}

}
