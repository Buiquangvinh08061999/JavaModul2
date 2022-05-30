package interface_Animal_ACU;

public class AngryBird extends Animal implements Flyable,Runable{
    @Override
    public String makeNoise() {
        return "Bird: Liu Lo";

    }

    @Override
    public String howtoFly() {
        return "Bird: Bay bằng cách vẫy mạnh 2 cánh trên không!";
    }

    @Override
    public String howtoRun() {
        return "Bird: Chạyyyy trên mặt đất ";
    }
}
