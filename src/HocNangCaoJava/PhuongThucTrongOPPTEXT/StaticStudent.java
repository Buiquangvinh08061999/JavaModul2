package HocNangCaoJava.PhuongThucTrongOPPTEXT;

public class stactic {
    public  int ID;
    public  String name;
    static String college = "CODEGYM";

    public stactic(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public  void getAll(){
        System.out.println("ID la " + ID +" ten la " + name + " " + college);
    }

    public static void main(String[] args) {
        stactic std1 = new stactic(1,"Vinh");
        stactic std2 = new stactic(2, "Top");
        std1.getAll();
        std2.getAll();
    }
}
