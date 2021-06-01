package atividade_02;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance(int x, int y) {
		double result = 0;
		double v1 = Math.pow((this.x - x), 2);
		double v2 = Math.pow((this.y - y), 2);
		result = Math.sqrt(v1 + v2);
		return result;
	}

	public double distance(MyPoint p) {
		return this.distance(p.getX(), p.getY());
	}

	public String toString() {
		String result = "My point (" + this.x + ", " + this.y + ")";
		return result;
	}

	public boolean equals(MyPoint other) {
		boolean result = false;
		if (other != null) {
			result = (this.x == other.getX()) && (this.y == other.getY());
		}
		return result;
	}

}
