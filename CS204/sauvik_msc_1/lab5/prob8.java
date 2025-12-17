import java.util.*;
interface Flying {
    void fly();
}
interface Swimming {
    void swim();
}
class Duck implements Flying, Swimming{
    public void fly(){
        System.out.println("Flying");
    }
    public void swim(){
        System.out.println("Swimming");
    }
}
class prob8{
    public static void main(String[] args){
        Duck obj = new Duck();
        obj.fly();
        obj.swim();
    }
}