import java.util.*;
public class prob1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	try{
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
	}
	catch(ArithmeticException ex){
		System.out.println(ex);
	}
	catch(InputMismatchException ex){
		System.out.println(ex);
	}
	}
}