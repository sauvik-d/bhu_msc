import java.util.*;
class Employee{
	String name;
    int id;
    String desig;
    double salary;

    public Employee(String name, int id, String desig, double salary) {
        this.name = name;
        this.id = id;
        this.desig = desig;
        this.salary = salary;
        System.out.println(name+" "+id+" "+desig+" "+salary);
    }

    
    public Employee(String name, int id) {
        this(name, id, "N/A", 0.0);
        System.out.println(name+" "+id);
    }

    
    public Employee(String name, int id, String desig) {
        this(name, id, desig, 0.0);
        System.out.println(name+" "+id+" "+desig);
    }

    
    public Employee(String name) {
        this(name, 0, "N/A", 0.0);
        System.out.println(name);
    }
}
public class prob2{
	public static void main(String[] args){
		Employee e1 = new Employee("A");
        Employee e2 = new Employee("B", 101);
        Employee e3 = new Employee("C", 102, "Manager");
        Employee e4 = new Employee("D", 103, "Intern", 5000);
	}
}
