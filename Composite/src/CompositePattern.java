public class CompositePattern {
    public static void main(String[] args) {
        Component flw = new Leaf("Front Left Wheel", 4000);
        Component frw = new Leaf("Front Right Wheel", 4500);
        Component rlw = new Leaf("Rear Left Wheel", 5000);
        Component rrw = new Leaf("Rear Right Wheel", 4000);

        Component piston = new Leaf("Piston", 9000);
        Component chamber = new Leaf("Combustion Chamber", 8000);
        Component camshaft = new Leaf("Cam Shaft", 10000);
        Component valves = new Leaf("Valves", 8500);

        Composite wheel = new Composite("Wheel");
        Composite engine = new Composite("Engine");
        Composite car = new Composite("Car");

        wheel.addComponent(flw);
        wheel.addComponent(frw);
        wheel.addComponent(rlw);
        wheel.addComponent(rrw);

        engine.addComponent(piston);
        engine.addComponent(chamber);
        engine.addComponent(camshaft);
        engine.addComponent(valves);

        car.addComponent(wheel);
        car.addComponent(engine);

        car.showPrice();

    }
}
