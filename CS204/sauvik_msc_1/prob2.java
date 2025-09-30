import java.util.*;
import java.lang.*;
public class prob2{

	static int def_max = 10000;
	static int def_min = -10000;
	public static int[] findmaxmin(int n){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		int[] arr2 = new int[2];
		int mx = def_min;
		int min = def_max;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			arr[i] = a;
		}
		for(int i=0;i<n;i++){
			mx = Math.max(mx, arr[i]);
			min = Math.min(min, arr[i]);
		}
		arr2[0] = mx;
		arr2[1] = min;
		return arr2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = findmaxmin(n);
		System.out.println("The maximum and minimum elements of array are: ");
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
}