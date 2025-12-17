import java.util.*;
class Parent{
	Parent(){};
	void display(){
		System.out.println("Calling parent display");
	}
}
class Child extends Parent{
	//Child(){};
	void display(){
		System.out.println("Calling child display");
		//super.display();
	}
}
class try1{
	public static void main(String[] args){
		Child obj = new Parent();
		obj.display();
	}
}
