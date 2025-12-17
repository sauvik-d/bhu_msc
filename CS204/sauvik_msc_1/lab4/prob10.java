import java.util.*;

class Human{
	int num;
	Human(){
		System.out.println("Default Constructor!");
	}
	Human(int num){
		System.out.println("Parameterized Constructor!");
	}
}
class Student extends Human{
	Student(){
		super();
	}
	Student(int a){
		super(5);
	}
}
public class prob10{
	public static void main(String[] args){
		Student obj1 = new Student();
		Student obj2 = new Student(10);
		//obj.call1();
		//obj.call2();
	}
}