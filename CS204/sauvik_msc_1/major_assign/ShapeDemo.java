interface Shape {
    double area();
}

class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public double area() { return 3.14 * r * r; }
}

class Rectangle implements Shape {
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    public double area() { return w * h; }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        Rectangle r = new Rectangle(3, 4);
        
        System.out.println(c.area());
        System.out.println(r.area());
        
    }
}
