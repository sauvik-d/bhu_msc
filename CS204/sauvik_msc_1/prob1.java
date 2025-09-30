import java.util.*;
public class prob1{
	public static int[] function(int n){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		System.out.println("Enter the numbers of the array: ");
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			arr[i] = a;
		}
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++){
			arr2[i] = arr[n-i-1];
		}
		return arr2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = function(n);
		for(int i: arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}