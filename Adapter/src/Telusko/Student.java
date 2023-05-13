package Telusko;

public class Student {
    public static void main(String[] args) {
        PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I am tired of writing assignment!");
    }
}
