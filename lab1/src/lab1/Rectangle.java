package lab1;

public class Rectangle extends Shape {

		
		double width;
		double height;
		
		public Rectangle(int i, int j) {
			// TODO Auto-generated constructor stub
		}


		public Rectangle(double width2, double height2) {
			// TODO Auto-generated constructor stub
		}


		public void setWidth(double width){
			this.width=width;
			
		}
		
		
		public double getWidth(){
			return width;
		}
		
		
		
		public  void setHeight(double height) {
			this.height=height;
			
			
		}
		public double getHeight() {
			return height;
			
		}
	
		public double getArea() {
			return width*height;
		}
		
		public String toString() {
	        return "Rectangle - Width: " + getWidth() + ", Height: " + getHeight() +
	               ", Area: " + getArea() + ", Sides: 4";
	    }
	}


