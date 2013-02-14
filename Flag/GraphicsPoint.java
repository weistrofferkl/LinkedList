

public class GraphicsPoint{

	private int x,y;

	public GraphicsPoint(int x, int y){


			moveTo(x,y);
		}

		public void setX(int x){

			if (x>= 0){
			this.x = x;
			}

		}
		public void getX(int x){
			return this.x;
		}
		public void setY(int y){
			if(y >= 0){
			this.y = y;
			}
		}
		public void getY(int y){
			return this.y;
		}


		public void moveTo(int x, int y){
			setY(y);
			setX(x);
		}

}