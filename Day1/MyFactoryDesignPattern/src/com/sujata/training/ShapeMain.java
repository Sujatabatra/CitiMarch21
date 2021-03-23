package com.sujata.training;

import com.sujata.demo.Rectangle;
import com.sujata.demo.Shape;
import com.sujata.demo.ShapeFactory;

public class ShapeMain {

	public static void main(String[] args) {
//		Shape s1=new Rectangle();
		
		Shape s1=ShapeFactory.getShape("rectangle");
		s1.draw();

	}

}
