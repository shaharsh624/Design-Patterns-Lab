public class SingletonSync {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
    }
}

class SingletonClass {
    private static SingletonClass obj;
    private SingletonClass(){
        System.out.println("This is Private Constructor!");
    }
    public static SingletonClass getInstance() {
        if (obj == null) {
            System.out.println("Created new obj.");
            obj = new SingletonClass();
        }
        return obj;
    }
}