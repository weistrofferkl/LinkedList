import javax.swing.JFrame;
import java.awt.Graphics;

public class RectangleTest extends JFrame{

	public static void main(String[] args){
		RectangleTest rt = new RectangleTest("Rectangle Tester");



	}

	private Rectangle r;


	public RectangleTest(String title){

		super(title);

		this.r  = new Rectangle(200,100,200,200);
		this.setBounds(100,100, 600, 400);
		this. setVisible(true);


	}
	public void paint(Graphics g){

		this.r.draw(g);
		
	}


}