package BaiTap;

public class Main {
	public static void main(String[] args) {

		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		Square square = new Square(4.0);

		System.out.println("Trước khi thay đổi kích thước:");
		System.out.println(circle);
		System.out.println(rectangle);
		System.out.println(square);

		circle.resize(20);
		rectangle.resize(50);
		square.resize(10);

		System.out.println("\nSau khi thay đổi kích thước:");
		System.out.println(circle);
		System.out.println(rectangle);
		System.out.println(square);

		System.out.println("\nTô màu các đối tượng:");
		rectangle.howToColor();
		square.howToColor();
	}
}
