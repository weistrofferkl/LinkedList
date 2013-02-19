import javax.swing.JFrame;
import java.awt.Graphics;

public class LineTest extends JFrame{

	public static void main(String[] args){
		LineTest lt = new LineTest("Line Tester");

	}

	private Line l;




	public LineTest(String title){

		super(title);

		this.l  = new Line(200,100,200,200);


		this.setBounds(100,100, 600, 400);
		this. setVisible(true);
	}
	public void paint(Graphics g){

		this.l.draw(g);
	}


}