package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overriding_ghidephuongthuc;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("Măm Măm");
    }
    public void makeSound(){
        System.out.println("...................");
    }
    public void sleep(){
        System.out.println("Khò Khò ZzzZzzZzz");
    }
}
