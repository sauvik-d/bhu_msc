import java.util.*;
public class prob10{
	public static boolean check_anagram(String str1, String str2){
		int[] mp1 = new int[200];
		int[] mp2 = new int[200];
		for(int i=0;i<str1.length();i++){
			char ch = str1.charAt(i);
			int num = (int)ch;
			mp1[num] = mp1[num] + 1;
		}
		for(int i=0;i<str2.length();i++){
			char ch = str2.charAt(i);
			int num = (int)ch;
			mp2[num] = mp2[num] + 1;
		}
		for(int i=0;i<200;i++){
			if(mp1[i] != mp2[i]) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("Status of whether anagram or not: "+ check_anagram(str1, str2));
	}
}