package BaiTap3;

public class MoveablePoint extends Point {
	private float xSpeed;
	private float ySpeed;

	public MoveablePoint() {
		super();
		this.xSpeed = 0.0f;
		this.ySpeed = 0.0f;
	}

	public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public float[] getSpeed() {
		return new float[] { xSpeed, ySpeed };
	}

	public MoveablePoint move() {
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		return this;
	}

	@Override
	public String toString() {
		return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
	}
}
