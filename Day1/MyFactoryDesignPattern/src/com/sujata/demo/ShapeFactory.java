package com.sujata.demo;

public class ShapeFactory {

	static public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		else if(shapeType.equals("square"))
			return new Square();
		return null;
	}
}
