//1. Write a program with class name calculateArea having essential parameters(instance variables and methods) overload a function named area in such a way so it calculates area of circle, rectangle and triangle.


import java.util.*;

class calculateArea{
	float area(int rad){
		return (float)(3.14*(rad*rad));
	}
	int area(int h, int w){
		return h*w;
	}
	double area(int a, int b, int c){
		float s = (float)((a+b+c)/2);
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}
class probArea extends calculateArea{
	public static void main(String[] args){
		calculateArea obj = new calculateArea();
		System.out.println("Area of circle: " + obj.area(5));
		System.out.println("Area of rectangle: " + obj.area(5, 6));
		System.out.println("Area of triangle: " + obj.area(5, 6, 7));
	}
}