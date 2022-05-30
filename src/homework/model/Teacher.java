package homework.model;

public class Teacher extends Preson {
    private double salary;

    public Teacher(){
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(Integer id, String name, int age, String gender, double salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "salary=" + salary +
                '}';
    }

    public String getLine(){
        return super.getLine() + "," + salary;
    }
}
