package Evaluation2;

public class NewStudent {

    private String name;
    private String email;
    private String school;
    private String program;
    private String branch;
    private int marks;

    public NewStudent setName(String name){
        this.name = name;
        return this;
    }
    public NewStudent setEmail(String email){
        this.email = email;
        return this;
    }
    public NewStudent setSchool(String school) {
        this.school = school;
        return this;
    }
    public NewStudent setProgram(String program) {
        this.program = program;
        return this;
    }
    public NewStudent setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public NewStudent setMarks(int marks){
        this.marks = marks;
        return this;
    }

    public Student getStudent(){
        return new Student(name, email, school, program, branch, marks);
    }

}
