package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.ThuchanhStactic;

public class StudentsAccess {
    private String name = "John";
    public String classes = "C02";
    public StudentsAccess(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        StudentsAccess std = new StudentsAccess();
        System.out.println("Tên: "+std.name + " class: " + std.classes);


        //Thông qua setter  (setName & setClasses) chúng ta
        /* có thể thay đổi tên và thuộc tính mà ta muốn thay đổi
        * Setter hỗ trợ ta làm được việc đó*/
        std.name ="Top";
        std.classes ="C0222K1";
        System.out.println("Tên: "+std.name + " class: " + std.classes);
    }
}
