import java.util.*;
class ComplexNumber{
	double r;
	double i;
	ComplexNumber(double r, double i){
		this.r = r;
		this.i = i;
	}
	ComplexNumber(ComplexNumber c){
		this.r = c.r;
		this.i = c.i;
	}
}
class prob3{
	public static void main(String[] args){
		ComplexNumber obj1 = new ComplexNumber(33.5, 78.2);
		ComplexNumber obj2 = new ComplexNumber(obj1);
		System.out.println(obj2.r + " " + obj2.i);
	}
}