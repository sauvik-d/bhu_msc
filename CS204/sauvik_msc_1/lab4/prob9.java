import java.util.*;

class Outer{
	//int num;
	void display(){
		System.out.println("Outer display");
	}
	class Inner{
		void method(){
			Outer.this.display();
		}
	}
}
class prob9{
	public static void main(String[] args){
		Outer obj = new Outer();
		Outer.Inner inobj = obj.new Inner(); // explaination needed
		// if inner class static then ---> Outer.Inner inobj = new Outer.Inner();
		inobj.method();
	}
}