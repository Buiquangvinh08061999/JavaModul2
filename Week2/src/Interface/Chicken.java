package Interface;

public class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "Chicken: Cộc tác Cộc Tác ";
    }

    @Override
    public String howToEat() {
        return "Chicken: Chiên nó lên";
    }
}
