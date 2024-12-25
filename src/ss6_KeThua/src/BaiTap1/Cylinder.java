package BaiTap1;

public class Cylinder extends Circle {

	private double height;

	public Cylinder(double radius, String color, double heigth) {
		super(radius, color);
		this.height = height;
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return super.getArea() * this.height;
	}

	public String toString() {
		return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", volume=" + getVolume() + ", height="
				+ getHeight() + "]";
	}

}
