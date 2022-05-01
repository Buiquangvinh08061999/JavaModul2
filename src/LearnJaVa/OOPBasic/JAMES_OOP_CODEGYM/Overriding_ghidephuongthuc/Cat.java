package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overriding_ghidephuongthuc;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Tôi ăn cá!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo Meo Meo.");
    }
}
