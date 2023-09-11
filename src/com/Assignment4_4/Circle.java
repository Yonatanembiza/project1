package com.Assignment4_4;

public class Circle {
	private final static double PI = 3.14;
	private double radius;
	
	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// Accessor
	public double getRadius() {
		return radius;
	}
	// Area of Circle
	public double computeArea() {
		return PI * radius * radius;
	}
}
