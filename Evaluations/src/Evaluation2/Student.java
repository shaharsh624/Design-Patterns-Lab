package Evaluation2;

public class Student {
    private String name;
    private String email;
    private String school;
    private String program;
    private String branch;
    private int marks;

    public Student(String name, String email, String school, String program, String branch, int marks) {
        super();
        this.name = name;
        this.email = email;
        this.school = school;
        this.program = program;
        this.branch = branch;
        this.marks = marks;
    }

    public String toString() {
        return "\nEntered Details\n[\n   Name: " + name + "\n   Email: " + email + "\n   School: " + school + "\n   Program: " + program + "\n   Branch: " + branch + "\n   Latest Marks: " + marks + "\n]";
    }
}
