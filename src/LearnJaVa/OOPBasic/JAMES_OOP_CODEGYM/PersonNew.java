package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

public class PersonNew {
    //Bài này luyện về hướng đối tượng và cách dúng nó
    public String name;
    public int age;
    public float height;

    public PersonNew(String name,int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;

    }
    public  void eat(String foodName){
        System.out.println(name +  " dep trai " +age + " tuoi "+ height + foodName);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getHeight() {
        return height;
    }

    public static void main(String[] args) {
        PersonNew personNew = new PersonNew("Top", 20,1.7f);
        personNew.eat("Vipppp");




        personNew.name ="Tốppp";
        personNew.age=12;
        personNew.height=1.7f;

        String name = personNew.getName();
        int age = personNew.getAge();
        float height = personNew.getHeight();

        System.out.println(name + " nam nay " + age + " tuoi, chieu cao "+ height);
    }
}
