import java.util.ArrayList;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	/*
	 * global arraylist
	 */
	private ArrayList<Shape> shapeList;
	/*
	 * DrawlPanel Constructor
	 */
	public DrawPanel()
	{
		shapeList= new ArrayList<Shape>();
	}
	/*
	 * adds a shape to the arrayList
	 */
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	protected void paintComponent(Graphics graphics)
	{
		/*
		 * creates the graphics windao
		 */
		super.paintComponent(graphics);
		/*
		 * sets the background color
		 */
		this.setBackground(Color.WHITE);
		/*
		 * adding the shapes to the gui 
		 */
		graphics.setColor(Color.BLACK);
		shapeList.add(new Sinusoid(Color.LIGHT_GRAY, new Point(500,700),900, 400, 100));
		shapeList.add(new Rectangle(new Point(200, 200),50, 50, Color.BLACK, true));
		shapeList.add(new Rectangle(new Point(300, 200),50, 50, Color.BLACK, true));
		shapeList.add(new Circle(new Point(500, 500), 90, Color.BLACK,true));
		shapeList.add(new Oval(new Point(800, 800), 90,70, Color.BLACK,true));
		shapeList.add(new IsoscelesTriangle(new Point(300,300),100,100,Color.LIGHT_GRAY,true));
		shapeList.add(new RightTriangle(new Point(600,300),100,100,Color.BLACK,true));
		shapeList.add(new Rectangle(new Point(200, 200),50, 50, Color.BLACK, true));
		shapeList.add(new Rectangle(new Point(500, 200),50, 50, Color.BLACK, true));
		shapeList.add(new Circle(new Point(500, 800), 90, Color.BLACK,true));
		shapeList.add(new Oval(new Point(800, 300), 90,70, Color.BLACK,true));
		shapeList.add(new IsoscelesTriangle(new Point(900,300),100,100,Color.LIGHT_GRAY,true));
		shapeList.add(new RightTriangle(new Point(600,300),100,100,Color.BLACK,true));
		shapeList.add(new IsoscelesTriangle(new Point(600,300),100,100,Color.LIGHT_GRAY,true));
		shapeList.add(new RightTriangle(new Point(600,600),100,100,Color.BLACK,true));
		

		/*
		 * drawing out the shapes in the gui 
		 */
		shapeList.get(0).draw(graphics);
		shapeList.get(1).draw(graphics);
		shapeList.get(2).draw(graphics);
		shapeList.get(3).draw(graphics);
		shapeList.get(4).draw(graphics);
		shapeList.get(5).draw(graphics);
		shapeList.get(6).draw(graphics);
		shapeList.get(7).draw(graphics);
		shapeList.get(8).draw(graphics);
		shapeList.get(9).draw(graphics);
		shapeList.get(10).draw(graphics);
		shapeList.get(11).draw(graphics);
		shapeList.get(12).draw(graphics);
		shapeList.get(13).draw(graphics);
		shapeList.get(14).draw(graphics);
		shapeList.get(15).draw(graphics);
		
	}
}
