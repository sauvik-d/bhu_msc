import java.util.*;
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Employee extends Person{
	int salary;
	Employee(String name, int age, int salary){
		super(name, age);
		this.salary = salary;

		//System.out.print(super.name);
	}
}
public class prob5{
	public static void main(String[] args){
		
		//Person obj = new Person("Emp1", 25);
		Employee emp = new Employee("Emp1", 25, 30000);
		System.out.println("Name: "+emp.name);
		//System.out.println(emp.name);
		System.out.println("Age: "+emp.age);
		System.out.println("Salary: "+emp.salary);
	}
}