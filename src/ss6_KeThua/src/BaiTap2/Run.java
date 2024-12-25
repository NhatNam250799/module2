package BaiTap2;

public class Run {
	public static void main(String[] args) {
		
		Point2D point2D = new Point2D(1.5f, 2.5f);
		System.out.println("Point2D:");
		System.out.println("Coordinates: " + point2D);
		System.out.println("Array format: " + java.util.Arrays.toString(point2D.getXY()));

		
		Point3D point3D = new Point3D(1.5f, 2.5f, 3.5f);
		System.out.println("\nPoint3D:");
		System.out.println("Coordinates: " + point3D);
		System.out.println("Array format: " + java.util.Arrays.toString(point3D.getXYZ()));
	}
}
