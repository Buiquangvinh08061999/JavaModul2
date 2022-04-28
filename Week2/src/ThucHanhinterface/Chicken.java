package ThucHanhinterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Ó Ò Ó Ó";
    }

    @Override
    public String howtoEat() {
        return "Chicken: Bóp hành ớt! ";
    }
}
