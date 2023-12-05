package lab1;

public class Ellipse  extends Rectangle{
	public Ellipse(double width, double height) {
        super(width, height);
    }

    // Implementation of getArea() method for Ellipse
    @Override
    public double getArea() {
        // Formula for the area of an ellipse: π * a * b, where a and b are semi-major and semi-minor axes
        return Math.PI * getWidth() * getHeight();
    }
    public String toString() {
        return "Ellipse - Semi-Major Axis: " + getWidth() + ", Semi-Minor Axis: " + getHeight() +
               ", Area: " + getArea() + ", Sides: 0";
    }

}
