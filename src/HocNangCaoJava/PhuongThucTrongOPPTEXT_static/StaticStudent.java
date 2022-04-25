package HocNangCaoJava.PhuongThucTrongOPPTEXT;

public class StaticStudent {
    public  int ID;
    public  String name;
    static String college = "CODEGYM";

    public StaticStudent(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public  void getAll(){
        System.out.println("ID la " + ID +" ten la " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticStudent std1 = new StaticStudent(1,"Vinh");
        StaticStudent std2 = new StaticStudent(2, "Top");
        std1.getAll();
        std2.getAll();
    }
}
