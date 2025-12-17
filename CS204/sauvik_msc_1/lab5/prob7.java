import java.util.*;
interface Shape{
	public void area();
	public void perimeter();
}
class Circle implements Shape{
	double rad;
	Circle(double rad){
		//super(color);
		this.rad = rad;
	}
	public void perimeter(){
		System.out.println(2*3.14*rad);
	}
	public void area(){
		System.out.println(3.14*rad*rad);
	}
}
class Rectangle implements Shape{
	double w, h;
	Rectangle(double w, double h){
		//super(color);
		this.w = w;
		this.h = h;
	}
	public void perimeter(){
		System.out.println(2*(w+h));
	}
	public void area(){
		System.out.println(w*h);
	}
}
class prob7{
	public static void main(String[] args){
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(10, 20);
		c.area();
		r.area();
	}
}