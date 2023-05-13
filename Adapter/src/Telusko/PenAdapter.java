package Telusko;

public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();

    public void write(String str) {
        pp.write(str);
    }
}
