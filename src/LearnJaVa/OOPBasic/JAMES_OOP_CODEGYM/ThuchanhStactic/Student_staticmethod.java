package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.ThuchanhStactic;

public class Student {
    private int ID;
    private String name;
    private static String college = "Bach Khoa";

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    public String toString() {
      return String.format("{id: %d, name: %s, college: %s}", ID, name, college);
    }


    public static void main(String[] args) {
        Student st1 = new Student(1,"Vinh");
        Student st2 = new Student(2,"Quang");
        System.out.println(st1.toString());

        change(); /*gọi lài thì college: sẽ thành: CODEGYM*/
        System.out.println(st2.toString());

    }
}
