import javax.swing.JFrame;

public class DrawFrame extends JFrame
{
	private static DrawPanel drawPanel= new DrawPanel();;
	private static String title;
	
	public DrawFrame(String title)
	{
	
		this.title=title;
	}
	public static void main(String[] args)
	{
		JFrame box= new JFrame(title);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.add(new DrawPanel());
		box.setSize(1000,1000);
		box.setVisible(true);
	}

}
