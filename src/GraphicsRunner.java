import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// WIDTH and HEIGHT are constants	
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new SmileyFace());
		//getContentPane().add(new BigHouse());
		//getContentPane().add(new Robot());
		// add other classes to run them 
		// BigHouse, Robot, or ShapePanel
		// i.e.  in order to run your BigHouse`
		// you will need to change 
		// getContentPane().add(new SmileyFace());
		// to 
		// getContentPane().add(new BigHouse()); 
		// and then run it again
		// getContentPane().add(new ShapePanel()); 

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		@SuppressWarnings("unused")
		GraphicsRunner run = new GraphicsRunner();
	}
}