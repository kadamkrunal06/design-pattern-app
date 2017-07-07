package com.techlabs.decorator.test;

import com.techlabs.decorator.pattern.*;

public class DecoratorTest {
	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Circle using normal border");
		circle.draw();
		System.out.println("Circle using Red border");
		redCircle.draw();
		System.out.println("Rectangle using Red border");
		redRectangle.draw();
	}
}
