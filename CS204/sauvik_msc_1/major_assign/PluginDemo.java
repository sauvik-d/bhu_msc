interface Plugin {
    void run();
}
class HelloPlugin implements Plugin {
    public void run() {
        System.out.println("Hello");
    }
}

class ByePlugin implements Plugin {
    public void run() {
        System.out.println("Bye");
    }
}
public class PluginDemo {
    public static void main(String[] args) {
        
        HelloPlugin h = new HelloPlugin();
        ByePlugin b = new ByePlugin();

        h.run();
        b.run();
    }
}