import java.util.*;
public class MultiCatch{
	public static void main(String[] args){
		int[] arr = {10, 21, 44, 57, 33};
		try{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			arr[5] = 2;
			arr[2] = a;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(InputMismatchException e){
			System.out.println(e);
		}
	}
}