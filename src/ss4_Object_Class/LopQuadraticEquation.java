package BaiTap;

public class LopQuadraticEquation {
	private double a;
	private double b;
	private double c;

	public LopQuadraticEquation() {
		super();
	}

	public LopQuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	 public double getDiscriminant() {
	        return b * b - 4 * a * c;
	    }

}
