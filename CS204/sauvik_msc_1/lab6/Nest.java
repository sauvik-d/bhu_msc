import java.util.*;
public class Nest{
	public static void main(String[] args){
		String input = "try";
		try{
			System.out.println("Outer try!");
			int num = 5;
			num = Integer.parseInt(input);
			try{
				System.out.println("Inner Try!");
				num /= 0;
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}