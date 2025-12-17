import java.util.*;
class Animal{
	void makeSound(){
		System.out.println("Animal making sound!");
	}
}
class Dog extends Animal{
	void makeSound(int num){
		super.makeSound();
		System.out.println("Taken a number from main " + num);
		System.out.println("Called Superclass's method!");
	}
}
class prob4 extends Dog{
	public static void main(String[] args){
		Dog obj = new Dog();
		obj.makeSound(5);
	}
}