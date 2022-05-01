package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.ThuchanhStactic;

public class Student_staticmethod {
    private int ID;
    private String name;
    private static String college = "Bach Khoa";

    public Student_staticmethod(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    public String toString() {
      return String.format("id: %d, name: %s, college: %s", ID, name, college);
    }


    public static void main(String[] args) {
        Student_staticmethod st1 = new Student_staticmethod(1,"Vinh");
        Student_staticmethod st2 = new Student_staticmethod(2,"Quang");

        System.out.println(st1.toString());

        change(); /*gọi lài thì college: sẽ thành: CODEGYM*/
        System.out.println(st2.toString());

    }
}
