package com.Assignment4_4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(2);
		Rectangle rectangle = new Rectangle(2.0, 5.0);
		Triangle triangle = new Triangle(8.5, 5.5);
		
		System.out.println("Area of Circle is "+circle.computeArea());
		System.out.println("Area of Rectangle is "+rectangle.computeArea());
		System.out.println("Area of Triangle is "+triangle.computeArea());
	}

}
