package atividade_02;

public class MyCircle {
	private MyPoint center;
	private int radius;
	private int x;
	private int y;

	public MyCircle() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}

	public MyCircle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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

	public double getArea() {
		return x * y;
	}

	@Override
	public String toString() {
		return "Circle @ (x = " + x + ", y = " + y + ") " + "radius = " + radius + ", area = " + getArea();
	}
}
