package Telusko;

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
    public void addComponent(Component com) {
        components.add(com);
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
        System.out.println("    Leaf: " + name + " : " + price);
    }
}

