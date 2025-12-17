import java.util.*;
class Rectangle{
	static int default_height = 10;
	int height;
	int width;
	Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	Rectangle(int width){
		this(default_height, width);
	}
}
public class prob2{
	public static void main(String[] args){
		Rectangle obj = new Rectangle(4);
		System.out.println("Height and Width are: " + obj.height + " " + obj.width);
	}
}
