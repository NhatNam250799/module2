package BaiTap3;

public class Run {
	public static void main(String[] args) {

		MoveablePoint moveablePoint = new MoveablePoint(1.0f, 2.0f, 0.5f, 1.5f);
		System.out.println("Before moving: " + moveablePoint);

		moveablePoint.move();
		System.out.println("After moving: " + moveablePoint);
	}
}
