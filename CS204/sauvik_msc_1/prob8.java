import java.util.*;
public class prob8{
	public static String reverse(String str){
		int left = 0, right = str.length() - 1;
		String str2 = "";
		while(right >= 0){
			str2 += str.charAt(right);
			right--;
		}
		return str2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Reversed String is: " + reverse(str));
	}
}