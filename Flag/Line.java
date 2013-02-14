public class Line{

	private GraphicsPoint a, b;

	public Line(int x1, int y1, int x2, int y2){

		GraphicsPoint a = new GraphicsPoint(x1, y1);
		GraphicsPoint b = new GraphicsPoint(x2, y2);

		this(c, d);


	}

	public Line(GraphicsPoint a, GraphicsPoint b){
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
		g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
	}


}