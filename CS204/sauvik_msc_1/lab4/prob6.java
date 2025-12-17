import java.util.*;
class Vehicle{
	void move(){
		System.out.println("Vehicle movement");
	}
}
class Car extends Vehicle{
	void move(){
		super.move();
		System.out.println("Car movement");
	}
}
public class prob6{
	public static void main(String[] args){
		Car obj = new Car();
		obj.move();
	}
}