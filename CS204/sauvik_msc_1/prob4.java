import java.util.*;
public class prob4{
	public static int[] sort_two(int arr1[], int arr2[], int n1, int n2){
		int[] arr = new int[n1+n2];
		int k = 0;
		int i=0, j=0;
		while(i < n1 && j < n2 && k < n1+n2){
			if(arr1[i] <= arr2[j]){
				arr[k] = arr1[i];
				i++;
			}
			else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = arr1[i];
			k++;
			i++;
		}
		while(j<n2){
			arr[k] = arr2[j];
			j++;
			k++;
		}
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		System.out.println("Enter elements of first array: ");
		for(int i=0;i<n1;i++){
			int a = sc.nextInt();
			arr1[i] = a;
		}
		System.out.println("Enter elements of second array: ");
		for(int i=0;i<n2;i++){
			int a = sc.nextInt();
			arr2[i] = a;
		}
		System.out.println("The first array is: ");
		for(int i: arr1){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The second array is: ");
		for(int i: arr2){
			System.out.print(i+" ");
		}
		System.out.println();
		int[] arr = sort_two(arr1, arr2, n1, n2);
		System.out.println("Sorted merged array: ");
		for(int i: arr){
			System.out.print(i+" ");
		}
		
	}
}