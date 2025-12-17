import java.util.*;
import java.io.*;
class DataProcessingException extends Exception{
	DataProcessingException(String str, Throwable cause){
		super(str, cause);
	}
}
public class ExChain{
	public static void func(String str) throws DataProcessingException{
		try{
			FileInputStream f = new FileInputStream(str);
		}
		catch(FileNotFoundException e){
			throw new DataProcessingException(str, e);
		}
	}
	public static void main(String[] args){
		try{
			func("hi.txt");
		}
		catch(DataProcessingException e){
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}
