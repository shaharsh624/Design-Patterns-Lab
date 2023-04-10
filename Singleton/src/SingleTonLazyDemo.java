
public class SingleTonLazyDemo {
    public static void main(String[] args) {
        BMW obj1 = BMW.getInstance();
        BMW obj2 = BMW.getInstance();
    }
}

class BMW {
    public static BMW obj;
    private BMW(){
        System.out.println("This is BMW I4");
    }
    public static BMW getInstance(){
        if (obj == null){
            obj = new BMW();
        }
        return obj;
    }
}
