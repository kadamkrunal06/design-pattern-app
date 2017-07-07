package com.techlabs.decorator.pattern;

public abstract class ShapeDecorator implements Shape {
	private Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
