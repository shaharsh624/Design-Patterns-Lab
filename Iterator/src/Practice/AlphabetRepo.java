package Practice;

public class AlphabetRepo implements Container{
    char[] repository = {'A', 'B', 'C', 'D', 'E'};

    public Iterator getIterator() {
        return new AlphaIterator();
    }

    public class AlphaIterator implements Iterator {
        int index;
        public boolean hasNext() {
            return index<repository.length;
        }
        public Object next() {
            return this.hasNext() ? repository[index++] : null;
        }
    }
}
