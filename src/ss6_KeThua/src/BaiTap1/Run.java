package BaiTap1;

public class Run {
	public static void main(String[] args) {

		Circle circle = new Circle(5.0, "red");
		System.out.println("Circle:");
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.getArea());

		Cylinder cylinder = new Cylinder(5.0, "black", 10.0);
		System.out.println("\nCylinder:");
		System.out.println("Radius: " + cylinder.getRadius());
		System.out.println("Height: " + cylinder.getHeight());
		System.out.println("Area (Base): " + cylinder.getArea());
		System.out.println("Volume: " + cylinder.getVolume());
	}
}
