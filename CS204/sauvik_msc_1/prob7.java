import java.util.*;
public class prob7{
	public static void count(String str){
		int v = 0, c = 0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				v++;
			}
			else c++;
		}
		System.out.println("No. of vowels and consonants are: " + v + " " + c);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		count(str);
	}
}