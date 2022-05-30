package interface_Animal_ACU;

public class Bolt extends Animal implements Runable{
    @Override
    public String makeNoise() {
        return "Dog: Gâu gâu gâu";
    }


    @Override
    public String howtoRun() {
        return "Dog : Chạy bằng 4 chân, tốc độ bàn thờ ";
    }
}
