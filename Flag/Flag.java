import java.awt.Graphics;
import java.awt.Color;

public class Flag{

private GraphicsPoint a, b;

	public Flag(int x1, int y1, int x2, int y2){

		this(new GraphicsPoint(x1,y1), new GraphicsPoint(x2, y2));

	}

	public Flag(GraphicsPoint a, GraphicsPoint b){
		this.a = a;
		this.b = b;
	}

	

	public void setA(GraphicsPoint a){
		this.a = a;
	}
	public void setA(int x, int y){
		setA(new GraphicsPoint(x,y));
	}
	public GraphicsPoint getX(){
		return a;
	}

	public void draw(Graphics g){
		
		g.setColor(Color.RED);
		g.fillRect(0,20, b.getX()*2, b.getY()/6);

		g.setColor(Color.RED);
		g.fillRect(0,80, b.getX()*2, b.getY()/6);

		g.setColor(Color.RED);
		g.fillRect(0,140, b.getX()*2, b.getY()/6);

		g.setColor(Color.RED);
		g.fillRect(0,200, b.getX()*2, b.getY()/6);

		g.setColor(Color.RED);
		g.fillRect(0,260, b.getX()*2, b.getY()/6);

		g.setColor(Color.RED);
		g.fillRect(0,320, b.getX()*2, b.getY()/6);

		g.setColor(Color.RED);
		g.fillRect(0,380, b.getX()*2, b.getY()/6);


		
	
		
		
	}



}