package OOP;
import java.math.*;

public class Circle {
	private double radius;

	Circle() {
		this.radius = 1;
	}
	Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double getCircumFerence() {
		return 2 * Math.PI*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}

