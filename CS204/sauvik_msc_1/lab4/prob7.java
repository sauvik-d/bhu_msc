import java.util.*;

class Parent{
	Parent(){
		System.out.println("Parent Constructor Calling!");
	}
	void display(){
		System.out.println("Parent display");
	}
}
class Child extends Parent{
	Child(){
		super();
		super.display();
		this.display();
	}
	void display(){

		System.out.println("Child display");
	}
}
public class prob7{
	public static void main(String[] args){
		Child obj = new Child();
		obj.display();
	}
}