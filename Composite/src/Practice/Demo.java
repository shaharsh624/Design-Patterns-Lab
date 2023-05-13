package Practice;
import java.util.*;

interface Component {
    void showPrice();
}

class Composite implements Component {
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    public void addComponent(Component c) {
        components.add(c);
    }
    public void showPrice() {
        System.out.println("Composite: " + name);
        for (Component c : components) {
            c.showPrice();
        }
    }
}

class Leaf implements Component {
    int price;
    String name;
    public Leaf(String name, int price) {
        this.price = price;
        this.name = name;
    }
    public void showPrice() {
        System.out.println("\tLeaf: " + name + ": " + price);
    }
}

public class Demo {
    public static void main(String[] args) {
        Leaf hd = new Leaf("HDD", 5000);
        Leaf mouse = new Leaf("Mouse", 400);
        Leaf monitor = new Leaf("Monitor", 9000);
        Leaf ram = new Leaf("Ram", 3500);
        Leaf cpu = new Leaf("CPU", 9800);

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}





