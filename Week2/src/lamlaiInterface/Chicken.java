package lamlaiInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String sound() {
        return "Chicken: O o O o O";
    }

    @Override
    public String howToEat() {
        return "Chicken: gà bóp ớt";
    }
}
