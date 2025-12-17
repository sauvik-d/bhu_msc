import java.util.*;

class Rectangle{
	String name;
	int age;
	Rectangle(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class prob1{
	public static void main(String[] args){
		Rectangle obj = new Rectangle("Sauvik", 20);
		System.out.println(obj.name + " " + obj.age);
	}
}