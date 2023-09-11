package com.Assignment4_4;

public class Triangle {
	private double height;
	private double base;
	
	// Constructor
	public Triangle(double base, double height) {
		this.height = height;
		this.base = base;
	}
	
	// Accessor
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
	// Area of Triangle
	public double computeArea() {
		return (base * height)/2;
	}

}
