package Practice;

public class Main {
    public static void main(String[] args) {
        AlphabetRepo alphaRepo = new AlphabetRepo();

        for (Iterator iterator = alphaRepo.getIterator(); iterator.hasNext();) {
            char letter = (char)iterator.next();
            System.out.println("Alphabet : " + letter);
        }
    }
}
