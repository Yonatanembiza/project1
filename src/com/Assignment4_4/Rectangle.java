package com.Assignment4_4;

public class Rectangle {
	
	private double length;
	private double width;
	
	// Constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Accessor
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	
	// Area of Rectangle
	public double computeArea() {
		return length * width;
	}

}
