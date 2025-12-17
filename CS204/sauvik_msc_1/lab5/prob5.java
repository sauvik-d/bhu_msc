import java.util.*;
abstract class Shape{
	String color;
	Shape(String color){
		this.color = color;
	}
	abstract void area();
}
class Circle extends Shape{
	double rad;
	Circle(String color, double rad){
		super(color);
		this.rad = rad;
	}
	void area(){
		System.out.println(3.14*rad*rad + " " + color);
	}
}
class Rectangle extends Shape{
	double w, h;
	Rectangle(String color, double w, double h){
		super(color);
		this.w = w;
		this.h = h;
	}
	void area(){
		System.out.println(w*h + " " + color);
	}
}
class prob5{
	public static void main(String[] args){
		Circle c = new Circle("Red", 5);
		Rectangle r = new Rectangle("Blue", 10, 20);
		c.area();
		r.area();
	}
}