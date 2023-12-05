package lab1;

public class Circle extends Shape {
	double radius;
	// Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        // Formula for the area of a circle: π * r^2
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
 
    public String toString() {
        return "Circle - Radius: " + getRadius() + ", Area: " + getArea() + ", Sides: 0";
    }

    
}


