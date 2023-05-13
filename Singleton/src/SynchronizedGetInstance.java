public class SynchronizedGetInstance {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Ferrari obj = Ferrari.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Ferrari obj2 = Ferrari.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}

class Ferrari {
    private static volatile Ferrari obj;
    private Ferrari() {
        System.out.println("Ferrari F8: $40200");
    }
    public static Ferrari getInstance(){
        if (obj == null){
            synchronized (Ferrari.class) {
                if (obj == null) {
                    System.out.println("Created new object!");
                    obj = new Ferrari();
                }
            }
        }
        return obj;
    }
}
