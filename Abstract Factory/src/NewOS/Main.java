package NewOS;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        OSFactory osFactory = Objects.requireNonNull(Producer.getFactory("Mobile")).getMobile("Android");


    }
}
