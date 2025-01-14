package BaiTap;

public class Square extends Shape implements Resizeable, Colorable {
	private double side = 1.0;

	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public String toString() {
		return "A Square with sides=" + getSide() + ", which is a subclass of " + super.toString();
	}

	@Override
	public void resize(double percent) {
		this.side *= percent;
	}

	public void howToColor() {
		System.out.println("Color all four side");
	}
}
