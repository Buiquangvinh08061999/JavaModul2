package abstractClass;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.animalSound();
        cat.eat();
        cat.shape();


        Animal dog = new Dog();
        dog.animalSound();
        dog.eat();
        dog.shape();


    }
}
