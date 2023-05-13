package Geekific;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(new ReadyState(phone).OnOffOn());
        System.out.println(new ReadyState(phone).OnHome());

        System.out.println();

        System.out.println(new LockedState(phone).OnOffOn());
        System.out.println(new LockedState(phone).OnHome());

        System.out.println();

        System.out.println(new OffState(phone).OnOffOn());
        System.out.println(new OffState(phone).OnHome());
    }
}
