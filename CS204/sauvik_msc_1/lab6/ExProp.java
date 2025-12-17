import java.util.*;
public class ExProp{
	public static void methodA(){
		try{methodB();}
		catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("A");
		e.printStackTrace();
		}
	}
	public static void methodB(){
		System.out.println("B");
		methodC();
	}
	public static void methodC(){
		System.out.println("C");
		int a = 2 / 0;
		
	}
	public static void main(String[] args){
		methodA();
	}
}