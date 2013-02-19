import javax.swing.JFrame;
import java.awt.Graphics;

public class FlagTester extends JFrame{

	public static void main(String[] args){
		FlagTester ft = new FlagTester("Flag Tester");



	}

	private Flag f;


	public FlagTester(String title){

		super(title);

		this.f  = new Flag(200,100,300,200);
		this.setBounds(100,100, 600, 400);
		this. setVisible(true);


	}
	public void paint(Graphics g){

		this.f.draw(g);
		
	}


}