package Telusko;

public class AssignmentWork {
    private Pen p;

    public void setP(Pen p) {
        this.p = p;
    }
    public void writeAssignment(String str) {
        p.write(str);
    }
}
