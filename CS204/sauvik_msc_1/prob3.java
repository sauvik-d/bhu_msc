import java.util.*;
public class prob3{
	public static boolean check(int[] arr){
		int[] mp = new int[10000];
		for(int i: arr){
			mp[i] = mp[i] + 1;
		}
		for(int i: mp){
			if(i > 1) return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			arr[i] = a;
		}
		System.out.println("Status of duplicacy: " + check(arr));
	}
}