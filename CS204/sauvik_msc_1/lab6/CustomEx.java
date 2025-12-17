import java.util.*;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		super(str);
	}
}
public class CustomEx{
	public static void fun(int age) throws InvalidAgeException{
		if(age < 0 || age > 150) throw new InvalidAgeException("Got it!");
		System.out.println(age);
	}
	public static void main(String[] args){
		int age = 12;
		
		try{
			fun(200);
		}
		catch(InvalidAgeException ex){
			System.out.println(ex.getMessage());
		}
	}
}