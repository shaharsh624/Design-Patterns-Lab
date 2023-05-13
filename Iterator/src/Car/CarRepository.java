package Car;

public class CarRepository implements Container {
    public String[] cars = {"Mercedes", "BMW", "Audi", "Ferrari", "Jaguar"};

    public Iterator getIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator {
        int index;
        public boolean hasNext() {
            return index < cars.length;
        }

        public Object next() {
            return this.hasNext() ? cars[index++] : null;
        }
    }
}
