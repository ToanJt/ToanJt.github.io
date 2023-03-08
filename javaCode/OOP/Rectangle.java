package OOP;

public class Rectangle {
	private float length;
	private float width;
	Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return 2*(width + length);
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}