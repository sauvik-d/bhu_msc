import java.util.*;
public class prob6{
	public boolean check(String str){
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--){
			reverse += str.charAt(i);
		}
		if(str.equals(reverse)) return true;
		else return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		prob6 obj = new prob6();
		System.out.println("Status of Palindrome: " + obj.check(str));
	}
}