package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overriding_ghidephuongthuc;

public class testDog_Cat_Bird {
    public static void main(String[] args) {
        System.out.println("Test Dog:  ");
        Dog d = new Dog();
        d.eat();
        d.makeSound();
        d.sleep();

        System.out.println("-------------");
        System.out.println("Test Cat: ");
        Cat c = new Cat();
        c.eat();
        c.makeSound();
        c.sleep();

        System.out.println("-------------");
        System.out.println("Test Bird");
        Bird b = new Bird();
        b.eat();
        b.makeSound();
        b.sleep();
    }
}
