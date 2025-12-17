import java.util.*;
class DatabaseConnection{
	static DatabaseConnection inst = new DatabaseConnection();
	private DatabaseConnection(){
		System.out.println("Private Constructor called!");
	}
	public static DatabaseConnection get(){
		return inst;
	}
}
public class prob4{
	public static void main(String[] args){
		DatabaseConnection obj1 = DatabaseConnection.get();
	}
}