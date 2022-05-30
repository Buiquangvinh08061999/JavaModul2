package interface_Animal_ACU;

public class Nemo extends Animal implements Swimable{
    @Override
    public String makeNoise() {
        return "Nemo: eeeee";
    }

    @Override
    public String howtoSwim() {
        return "Nemo: Bơi bằng cách lạng lách dưới nước ";
    }
}
