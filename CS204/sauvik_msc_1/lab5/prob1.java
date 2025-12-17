import java.util.*;
class Student{
	String s_name;
	int id;
	String grade;
	Student(String s_name, int id){
		this.s_name = s_name;
		this.id = id;
	}
	Student(String s_name, int id, String grade){
		this(s_name, id);
		this.grade = grade;
	}
}
class prob1{
	public static void main(String[] args){
		Student std = new Student("Harry", 10, "A");
		System.out.println(std.s_name + " " + std.id + " " + std.grade);
	}
}