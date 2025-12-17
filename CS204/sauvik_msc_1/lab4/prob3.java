import java.util.*;
class Chain{
	public void step1(){
		System.out.println("Called step1");
	}
	public void step2(){
		this.step1();
		System.out.println("Called step2");
	}
	public void step3(){
		this.step2();
		System.out.println("Called step3");
	}
}

class prob3 extends Chain{
	public static void main(String[] args){
		Chain obj = new Chain();
		obj.step3();
	}
}