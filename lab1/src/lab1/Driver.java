package lab1;

public class Driver {
	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle(2,4);
		Rectangle rectangle2=new Rectangle(6,8);
		
		System.out.println("Area of rectangle1:"+rectangle1.getArea());
		System.out.println("Area of rectangle2:"+rectangle2.getArea());
		
		 // Create instances of Circle and test
        Circle circle1 = new Circle(7.0);
        Circle circle2 = new Circle(5.0);

        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Area of Circle 2: " + circle2.getArea());
        
        Ellipse ellipse1 = new Ellipse(10.0, 6.0);
        Ellipse ellipse2 = new Ellipse(15.0, 8.0);

        System.out.println(ellipse1);
        System.out.println(ellipse2);
	}



}
