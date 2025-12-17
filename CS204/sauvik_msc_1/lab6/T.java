import java.util.*;
class WeakPasswordException extends Exception{
	WeakPasswordException(String str){
		super(str);
	}
}
public class T{
	public static void validatePassword(String str) throws WeakPasswordException{
		if(str.length() < 8) throw new WeakPasswordException("Weak Password!");
	}
	public static void main(String[] args){
		try{
			validatePassword("abcd");
		}
		catch(WeakPasswordException ex){
			System.out.println(ex.getMessage());
		}
	}
}