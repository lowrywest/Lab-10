import java.util.ArrayList;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	private ArrayList<Shape> shapeList;

	public DrawPanel()
	{
		shapeList= new ArrayList<Shape>();
	}
	
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		this.setBackground(Color.WHITE);
		graphics.setColor(Color.BLACK);
		shapeList.add(new RightTriangle(new Point(100,200), 100, 100, Color.YELLOW, false));
		shapeList.get(0).draw(graphics);
	}
}
