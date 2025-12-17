import java.util.*;

class Building{
	int floors;
	String name;
	Building(){
		System.out.println("Default Constructor");
	}
	Building(int floors){
		this.floors = floors;
		System.out.println("No. of floors: "+ this.floors);
	}
	Building(int floors, String name){
		this.name = name;
		this.floors = floors;
		System.out.println("No. of floors and building: " + this.floors + " " + this.name);
	}
}
class House extends Building{
	House(){
		super();
	}
	House(int num){
		super(5);
	}
	House(int num, String name){
		super(5, "Banaras Villa");
	}
}
class prob8{
	public static void main(String[] args){
		House obj = new House();
		House obj2 = new House(10);
		House obj3 = new House(10, "call");
	}
}