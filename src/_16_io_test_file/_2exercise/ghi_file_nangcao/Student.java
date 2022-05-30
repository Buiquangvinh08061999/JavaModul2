package _16_io_test_file._2exercise.ghi_file_nangcao;

public class Student {
    private String name;
    private int age;
    private double math;

    public Student(){
    }
    public Student(String name, int age, double math) {
        this.name = name;
        this.age = age;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return name +"\t" + age + "\t" + math;
    }
}
