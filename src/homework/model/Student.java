package homework.model;

public class Student extends Preson{
    private int math;

    public Student(){
    }

    public Student(int math) {
        this.math = math;
    }

    public Student(Integer id, String name, int age, String gender, int math) {
        super(id, name, age, gender);
        this.math = math;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "math=" + math +
                '}';
    }

    public String getLine(){
        return super.getLine() + "," + math;
    }
}
