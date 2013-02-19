import java.awt.Graphics;
import java.awt.Color;

public class Rectangle{

private GraphicsPoint a, b;

	public Rectangle(int x1, int y1, int x2, int y2){

		this(new GraphicsPoint(x1,y1), new GraphicsPoint(x2, y2));

		//GraphicsPoint a = new GraphicsPoint(x1, y1);
		//GraphicsPoint b = new GraphicsPoint(x2, y2);

		//this(c, d);


	}

	public Rectangle(GraphicsPoint a, GraphicsPoint b){
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
		//g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
		//g.drawRect(a.getX(), a.getY(), b.getX(), b.getY());
		//g.drawRect((a.getX()/2), (a.getY()/2), (b.getX()/2), (b.getY()/2));
		g.setColor(Color.RED);
		g.fillRect(a.getX(), a.getY(), b.getX(), b.getY());
		
		
		
	}



}