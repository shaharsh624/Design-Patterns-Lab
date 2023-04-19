public class CarRepository implements Container {
    public String cars[] = {"Mercedes", "BMW", "Audi", "Ferrari", "Jaguar"};

    public Iterator getIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator {
        int index;
        public boolean hasNext() {
            if (index < cars.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return cars[index++];
            }
            return null;
        }
    }
}
