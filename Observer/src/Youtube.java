public class Youtube {
    public static void main(String[] args) {
        Channel design_pattern = new Channel();
        Subscriber s1 = new Subscriber("mno");
        Subscriber s2 = new Subscriber("abc");
        Subscriber s3 = new Subscriber("pqr");
        Subscriber s4 = new Subscriber("xyz");
        design_pattern.subscribe(s1);
        design_pattern.subscribe(s2);
        design_pattern.subscribe(s3);
        design_pattern.subscribe(s4);
        s1.subscribeChannel(design_pattern);
        s2.subscribeChannel(design_pattern);
        s3.subscribeChannel(design_pattern);
        s4.subscribeChannel(design_pattern);
        design_pattern.upload("Learn C++");
    }
}
