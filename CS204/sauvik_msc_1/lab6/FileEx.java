import java.util.*;
import java.io.*;
public class FileEx{
	public static void main(String[] args){
		FileInputStream f = null;
		try{
			f = new FileInputStream("hi.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally printed!");
		}
	}
}