package atividade_02;

public class TestMyCircle {

	public static void main(String[] args) {

		MyCircle circle = new MyCircle();
		MyPoint point = new MyPoint(6, 0);

		circle.setX(8);
		circle.setY(8);
		circle.setCenter(point);
		circle.setRadius(10);

		System.out.println("X VALUE = " + circle.getX());
		System.out.println("Y VALUE = " + circle.getY());
		System.out.println("RADIUS VALUE = " + circle.getRadius());
		System.out.println("CENTER VALUE = " + circle.getCenter());

		System.out.println(circle.toString());

	}
}