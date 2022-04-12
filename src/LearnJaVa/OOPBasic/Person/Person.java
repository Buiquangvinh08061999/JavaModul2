package LearnJaVa.OOPBasic.Person;

public class Person {
    //Dùng public thì có thể truy suất, Dùng Pivate bảo mật không thể truy suất lại
    //Bài tập cơ bản về thuộc tính của con người;
    public int ID;
    public  String name;
    public int age;
    public  float height;


    public  Person(int ID,String name, int age, float height){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.height = height;
    }
    //    Bài Nâng Cao để cho điều kiện age >=0 và <=100;
//    public void  setAge(int age){
//        if(age >=0 && age<=100){
//            this.age = age;
//        }
//    }
//    public  int getAge(){
//        return this.age;
//    }
    public  void  getInfo(){
        System.out.println("ID is: " + this.ID);
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
        System.out.println("Height is: " + this.height);

    }
    public  void  getDeMo(){
        System.out.println("ID la: " + this.ID);
        System.out.println("Toi Ten la: " + this.name);
        System.out.println("Tuoi la: " + this.age);
        System.out.println("Can nang la: " + this.height);
    }
}
