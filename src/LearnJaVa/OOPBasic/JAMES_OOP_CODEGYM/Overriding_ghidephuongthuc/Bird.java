package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overriding_ghidephuongthuc;

public class Bird extends Animal{
    public Bird(){
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("Tôi ăn sâu!");
    }

    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }
}
