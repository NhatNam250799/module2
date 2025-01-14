package BaiTap;

public class XayDungLopFan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public XayDungLopFan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5.0;
		this.color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		if (on) {
			return "Fan is on: speed=" + speed + ", color=" + color + ", radius=" + radius;
		} else {
			return "Fan is off: color=" + color + ", radius=" + radius;
		}
	}

	public static void main(String[] args) {

		XayDungLopFan fan1 = new XayDungLopFan();
		XayDungLopFan fan2 = new XayDungLopFan();

		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		fan2.setSpeed(MEDIUM);
		fan2.setRadius(7);
		fan2.setColor("green");
		fan2.setOn(false);

		System.out.println("Fan 1: " + fan1.toString());
		System.out.println("Fan 2: " + fan2.toString());
	}
}
