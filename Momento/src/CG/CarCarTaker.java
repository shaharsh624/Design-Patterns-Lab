package CG;// The caretaker class, which is responsible for managing the momento objects
import java.util.ArrayList;
import java.util.List;
class CarCareTaker extends CarMemento {
    private List<CarMemento> mementos = new ArrayList<CarMemento>();

    public CarCareTaker(String make, String model, int speed, int position) {
        super(make, model, speed, position);
    }

    public void addMemento(CarMemento memento) {
        mementos.add(memento);
    }

    public CarMemento getMemento(int index) {
        return mementos.get(index);
    }
}