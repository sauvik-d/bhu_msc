import java.util.*;
class prob5{
	public static void reverse(int[] arr, int i, int j){
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void rotate(int[] arr, int k, int n){
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5, 6};
		int k = 3;
		rotate(arr, 3, arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}