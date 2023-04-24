public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        careTaker.add(originator.saveStateToMemento()); // Saved state 1 at index 0
        originator.setState("State 2");
        careTaker.add(originator.saveStateToMemento()); // Saved state 2 at index 1

        originator.setState("State 3");
        careTaker.add(originator.saveStateToMemento()); // Saved state 3 at index 2

        originator.setState("State 4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Second saved state: " + originator.getState());
    }
}
